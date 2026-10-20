import java.util.Scanner;

public class tugasP5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPasien = 0;
        int inputPasien = 0;
        int jam = 1;

        System.out.println( "=== Pencatatan Total Pasien Harian (selama 1 hari) ===" );
        System.out.println("(Masukkan angka '0' jika jam operasional sudah selesai)");
        System.out.println("---------------------------------------");

        //loop untuk mencatat jumlah pasien setiap jamnya
        while (true) {
            System.out.println("Masukkan jumlah pasien jam ke-" + jam +" :");
            inputPasien = input.nextInt();

            //apakah jam operasional sudah selesai
            if (inputPasien == 0) {
                break;

            }

            //validasi agar tidak input angka negatif selain 0
            if (inputPasien < 0 ) {
                System.out.println("Input tidak valid, Masukkan jumlah pasien yang benar.");
                continue;

            }

            totalPasien += inputPasien;
            jam++;

        }

        System.out.println("---------------------------------------");
        System.out.println("Jam operasional sudah selesai.");
        System.out.println("Total seluruh pasien yang dilayani hari ini: " + totalPasien + " orang.");
    
    input.close();
    }
}
