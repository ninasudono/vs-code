import java.util.Scanner;
public class latihan2M10 {
    static Scanner sc = new Scanner(System.in);
    static void InputData(){

        System.out.print("Masukkan Nama Barang : ");
        String namaBarang = sc.nextLine();

        System.out.print("Masukkan Jumlah Barang : ");
        int jumlahBarang = sc.nextInt();

        System.out.print("Masukkan Harga Barang : ");
        int hargaBarang = sc.nextInt();

        totalBayar(hargaBarang, jumlahBarang);
    }

    static int totalBayar(int harga, int jumlah){
        int total = harga * jumlah;
        System.out.println("Total Bayar = "+ total);
        return total;
    }
        public static void main(String[] args) {
        /*
        1. pocedure InputData Penjualan dengan var : namaBarang, jumlahBarang, hargaBarang
        2. function hitungTotal dengan parameter harga dan jumlah bertipe int
        3. total pembayaran diproses pada procedure Input
        4. procedure outputData untuk menampilkan data barang dan total pembayaran
        */

        InputData();
        }
    }
