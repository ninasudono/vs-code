import java.util.Scanner;

public class latihanP2_25410100003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Deklarasi variabel
        String namaPelanggan;
        String namaMenu;
        double hargaSatuan;
        int jumlahPesanan;
        double totalHarga;
        String metodeBayar;
        double uangBayar;
        double kembalian;

        // Input data
        System.out.print("Nama Pelanggan : ");
        namaPelanggan = scanner.nextLine();

        System.out.print("Nama Menu : ");
        namaMenu = scanner.nextLine();

        System.out.print("Harga Satuan : ");
        hargaSatuan = scanner.nextDouble();

        System.out.print("Jumlah Pesanan : ");
        jumlahPesanan = scanner.nextInt();

        // Hitung total
        totalHarga = hargaSatuan * jumlahPesanan;
        System.out.println("Total Harga : " + totalHarga);

        // Pembayaran
        System.out.print("Uang Bayar : ");
        uangBayar = scanner.nextDouble();

        // Hitung kembalian otomatis
        kembalian = uangBayar - totalHarga;

        // Membersihkan buffer sebelum nextLine()
        scanner.nextLine();

        System.out.print("Metode Pembayaran : ");
        metodeBayar = scanner.nextLine();

        // Output struk
        System.out.println("\n          MIE WACOAN             ");
        System.out.println("\n===== STRUK PEMBAYARAN =====");
        System.out.println("Nama Pelanggan   : " + namaPelanggan);
        System.out.println("Menu             : " + namaMenu);
        System.out.println("Harga Satuan     : " + hargaSatuan);
        System.out.println("Jumlah Pesanan   : " + jumlahPesanan);
        System.out.println("Total Harga      : " + totalHarga);
        System.out.println("Uang Bayar       : " + uangBayar);

        if (kembalian >= 0) {
            System.out.println("Kembalian        : " + kembalian);
        } else {
            System.out.println("Uang kurang      : " + (-kembalian));
        }

        System.out.println("Metode Bayar     : " + metodeBayar);
        System.out.println("============================");
        System.out.println("Selamat Menikmati!");

        scanner.close();
    }
}
