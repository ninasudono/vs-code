//1. impor class Scanner
import java.util.Scanner;
public class latihanscanner {
    public static void main(String[] args) {
    //deklarasi scanner
    Scanner scanner = new Scanner(System.in);

    /*Praktik:
    Jacob ingin belanja beberapa kebutuhan belanja pokok di alfamart. Sebagai kasir, ada beberapa data yang harus dimasukkan ke dalam program dari belanjaan Jacob. Data-data tersebut adalah:
    - Nama barang >> String
    - Jumlah beli >> int
    - Harga >> int
    - Total >> int
    - PPN >> int
    - Tanggal >> String
    - Kembalian >> int
    */

    //deklarasi variabel
    String nama_barang = "";
    int jumlah_beli, harga = 0, total = 0;    

    //A. input (print: di sebelah, println: di bawah)
    System.out.print("Input nama :");
    nama_barang = scanner.nextLine();

    System.out.print("Input jumlah beli :");
    jumlah_beli = scanner.nextInt();

    System.out.print("Input harga :");
    harga = scanner.nextInt();

    total = jumlah_beli * harga;
    System.out.println("Total: " + total);

    //tutup scanner
    scanner.close();
    }
}