import java.util.Scanner;

public class latihan_sbyzoo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Inisialisasi variabel dan Array 1 Dimensi
        int jumlahKategori = 0;
        String[] kategori = new String[100];
        long[] harga = new long[100];
        int[] jumlahBeli = new int[100];
        
        int pilihan;
        boolean dataInputted = false;

        do {
            System.out.println("\n=== Pemesanan Tiket SurabayaZoo ===");
            System.out.println("1. Input Kategori dan Harga");
            System.out.println("2. Input Jumlah Beli");
            System.out.println("3. Lihat Total Bayar");
            System.out.println("4. Keluar Program");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah kategori yang ingin diinput: ");
                    jumlahKategori = input.nextInt();
                    input.nextLine(); 

                    for (int i = 0; i < jumlahKategori; i++) {
                        System.out.println("\nData ke-" + (i + 1));
                        System.out.print("Nama Kategori (misal: Zoo only/Zoo+Aquarium): ");
                        kategori[i] = input.nextLine();
                        System.out.print("Harga Tiket: ");
                        harga[i] = input.nextLong();
                        input.nextLine();
                        // Reset jumlah beli jika admin input ulang kategori
                        jumlahBeli[i] = 0; 
                    }
                    dataInputted = true;
                    System.out.println("Data berhasil disimpan!");
                    break;

                case 2:
                    if (!dataInputted) {
                        System.out.println("Peringatan: Silakan isi Menu 1 terlebih dahulu!");
                    } else {
                        System.out.println("\n--- Input Jumlah Beli ---");
                        for (int i = 0; i < jumlahKategori; i++) {
                            System.out.print("Jumlah tiket untuk " + kategori[i] + " (Rp " + harga[i] + "): ");
                            jumlahBeli[i] = input.nextInt();
                        }
                        System.out.println("Jumlah pembelian berhasil dicatat.");
                    }
                    break;

                case 3:
                    if (!dataInputted) {
                        System.out.println("Peringatan: Data kategori masih kosong!");
                    } else {
                        long totalKeseluruhan = 0;
                        System.out.println("\n--- Rincian Pembayaran ---");
                        System.out.printf("%-15s | %-10s | %-10s | %-10s\n", "Kategori", "Harga", "Jumlah", "Subtotal");
                        System.out.println("------------------------------------------------------------");
                        
                        for (int i = 0; i < jumlahKategori; i++) {
                            long subtotal = harga[i] * jumlahBeli[i];
                            totalKeseluruhan += subtotal;
                            System.out.printf("%-15s | %-10d | %-10d | %-10d\n", kategori[i], harga[i], jumlahBeli[i], subtotal);
                        }
                        
                        System.out.println("------------------------------------------------------------");
                        System.out.println("TOTAL BAYAR: Rp " + totalKeseluruhan);
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah memesan tiket SurabayaZoo!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);

        input.close();
    }
}