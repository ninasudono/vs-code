//soal c

import java.util.Scanner;

public class UTS_25410100003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1. Input jumlah pelanggan (var tunggal)
        int jumPelanggan;
        do {
            System.out.print("Masukkan jumlah pelanggan (minimal 3): ");
            jumPelanggan = input.nextInt();
            if (jumPelanggan < 3) {
                System.out.println("Peringatan: Jumlah pelanggan minimal 3 orang!");
            }
        } while (jumPelanggan < 3);
        
        input.nextLine(); // Membersihkan buffer

        // 2. Deklarasi array 1D untuk simpan data
        String[] namaProvider = new String[jumPelanggan];
        String[] jenisPaket = new String[jumPelanggan];
        double[] nominalPulsa = new double[jumPelanggan];
        double[] totalBayarAwal = new double[jumPelanggan];
        double[] cashback = new double[jumPelanggan];
        double[] totalAkhir = new double[jumPelanggan];

        // 3. Proses input data ke array
        for (int i = 0; i < jumPelanggan; i++) {
            System.out.println("\n--- Data Pelanggan ke-" + (i + 1) + " ---");
            System.out.print("Nama Provider: ");
            namaProvider[i] = input.nextLine();
            
            System.out.print("Jenis Paket (SMS/Data/Nelpon/lainnya): ");
            jenisPaket[i] = input.nextLine();

            double nominal;
            while (true) {
                System.out.print("Nominal Pulsa (100000/50000/25000/15000): ");
                nominal = input.nextDouble();
                
                if (nominal == 100000 || nominal == 50000 || nominal == 25000 || nominal == 15000) {
                    nominalPulsa[i] = nominal;
                    break; // Keluar loop jika input sesuai
                } else {
                    System.out.println("Input Salah! Hanya boleh antara 100000, 50000, 25000, 15000. Masukkan lagi dengan benar.");
                }
            }
            input.nextLine();
            // Hitung Bayar Awal (Nominal + Admin 2000)
            totalBayarAwal[i] = nominalPulsa[i] + 2000;

            // 4. Logika perhitungan cashback
            if (totalBayarAwal[i] >= 100000) {
                cashback[i] = 0.15 * totalBayarAwal[i];
            } else if (totalBayarAwal[i] >= 50000) {
                cashback[i] = 0.10 * totalBayarAwal[i];
            } else {
                cashback[i] = 0;
            }

            // Hitung total yang harus dibayarkan kembali
            totalAkhir[i] = totalBayarAwal[i] - cashback[i];
        }

        // 5. Menampilkan output data
        System.out.println("\n==========================================================================");
        System.out.printf("%-3s | %-12s | %-10s | %-10s | %-10s | %-10s\n", 
                          "No", "Provider", "Paket", "Nominal", "Cashback", "Total Bayar");
        System.out.println("--------------------------------------------------------------------------");
        
        for (int i = 0; i < jumPelanggan; i++) {
            System.out.printf("%-3d | %-12s | %-10s | %-10.0f | %-10.0f | %-10.0f\n", 
                              (i + 1), namaProvider[i], jenisPaket[i], nominalPulsa[i], cashback[i], totalAkhir[i]);
        }
        System.out.println("==========================================================================");
        
        input.close();
    }

}