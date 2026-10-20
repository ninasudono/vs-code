import java.util.Scanner;

public class CekSIM {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia Anda: ");
        
        // Mengambil input angka (integer) dari user
        int usia = input.nextInt();

        // Logika IF untuk mengecek kondisi
        if (usia >= 17) {
            System.out.println("Anda sudah cukup umur untuk memiliki SIM.");
        } else {
            int sisa = 17 - usia;
            System.out.println("Maaf, Anda belum cukup umur.");
            System.out.println("Tunggu " + sisa + " tahun lagi ya!");
        }
    }
}