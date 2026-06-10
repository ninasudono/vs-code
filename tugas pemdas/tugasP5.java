import java.util.Scanner;

public class tugasP5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPasien = 0;
        int inputPasien = 0;
        int jam = 1;

        System.out.println("=== Pecatatan Total Pasien Harian (selama 1 hari) ===");
        System.out.println("(Masukkan angka '0' jika jam operasional sudah selesai)");
        System.out.println("--------------------------------------------------------");

        //loop untuk mencatat jumlah pasien di setiap jam
        while (true) {
            System.out.println("Masukkan jumlah pasien pada jam ke-" + jam + ": ");
            inputPasien = input.nextInt();

        //untuk cek apakah jam operasional sudah selesai
        if (inputPasien == 0) {
            break;
        }

        //validasi agar tidak memasukkan angka negatif selain 0
        if (inputPasien < 0) {
            System.out.println("Input tidak valid! Masukkan jumlah pasien yang benar.");
            continue;
        }

        totalPasien += inputPasien;
        jam++;
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("Jam operasional sudah selesai.");
        System.out.println("Total pasien yang dilayani hari ini: " + totalPasien + " orang.");
        
        input.close();
    }
}