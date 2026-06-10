import java.util.Scanner;

public class TransaksiPulsa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Input jumlah pelanggan (Variabel Tunggal)2
        int jmlPelanggan;
        do {
            System.out.print("Masukkan jumlah pelanggan (minimal 3): ");
            jmlPelanggan = input.nextInt();
            if (jmlPelanggan < 3) {
                System.out.println("Peringatan: Jumlah pelanggan minimal harus 3 orang!");
            }
        } while (jmlPelanggan < 3);

        input.nextLine(); // Membersihkan buffer

        // 2. Deklarasi Array 1 Dimensi untuk menyimpan data
        String[] namaProvider = new String[jmlPelanggan];
        String[] jenisPaket = new String[jmlPelanggan];
        double[] nominalPulsa = new double[jmlPelanggan];
        double[] totalBayarAwal = new double[jmlPelanggan];
        double[] cashback = new double[jmlPelanggan];
        double[] totalAkhir = new double[jmlPelanggan];

        // 3. Proses Input Data ke dalam Array
        for (int i = 0; i < jmlPelanggan; i++) {
            System.out.println("\n--- Data Pelanggan ke-" + (i + 1) + " ---");
            System.out.print("Nama Provider: ");
            namaProvider[i] = input.nextLine();
            
            System.out.print("Jenis Paket (SMS/Data/Nelpon): ");
            jenisPaket[i] = input.nextLine();
            
            System.out.print("Nominal Pulsa (100000/50000/25000/15000): ");
            nominalPulsa[i] = input.nextDouble();
            input.nextLine(); // Membersihkan buffer

            double nominal;
            while (true) {
                System.out.print("Nominal Pulsa (100000/50000/25000/15000): ");
                nominal = input.nextDouble();
                
                if (nominal == 100000 || nominal == 50000 || nominal == 25000 || nominal == 15000) {
                    nominalPulsa[i] = nominal;
                    break; // Keluar dari loop jika input sesuai
                } else {
                    System.out.println("Input Salah! Hanya boleh 100000, 50000, 25000, atau 15000.");
                }
            }
            input.nextLine(); // Membersihkan buffer setelah nextDouble()
            // Hitung Bayar Awal (Nominal + Admin 2000)
            totalBayarAwal[i] = nominalPulsa[i] + 2000;

            // 4. Logika Perhitungan Cashback
            if (totalBayarAwal[i] >= 100000) {
                cashback[i] = 0.15 * totalBayarAwal[i];
            } else if (totalBayarAwal[i] >= 50000) {
                cashback[i] = 0.10 * totalBayarAwal[i];
            } else {
                cashback[i] = 0;
            }

            // Hitung Total yang harus dibayarkan kembali
            totalAkhir[i] = totalBayarAwal[i] - cashback[i];
        }

        // 5. Menampilkan Output Data
        System.out.println("\n==========================================================================");
        System.out.printf("%-3s | %-12s | %-10s | %-10s | %-10s | %-10s\n", 
                          "No", "Provider", "Paket", "Nominal", "Cashback", "Total Bayar");
        System.out.println("--------------------------------------------------------------------------");
        
        for (int i = 0; i < jmlPelanggan; i++) {
            System.out.printf("%-3d | %-12s | %-10s | %-10.0f | %-10.0f | %-10.0f\n", 
                              (i + 1), namaProvider[i], jenisPaket[i], nominalPulsa[i], cashback[i], totalAkhir[i]);
        }
        System.out.println("==========================================================================");
        
        input.close();
    }
}