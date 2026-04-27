//blok class
public class latihan1 {
    //blok main >> shortcut: psvm + tab
    public static void main(String[] args) {
    
    //tempat coding
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
    String nama_barang = "Sukro";
    int jumlah_beli = 2;
    int harga = 3000;
    int total = jumlah_beli * harga;
    
    //print/cetak >> shortcut: sout + tab
    System.out.println(total);

    //print variabel dengan teks tambahan
    System.out.println("Nama barang :" + nama_barang + "Jumlah Beli :" + jumlah_beli);

    //print dengan karakter escape \n >> new line
    System.out.println(nama_barang + "\n" + total);
    
    }
}
