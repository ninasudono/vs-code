import java.util.Scanner;
public class latihanMath2 {
    /*
        1. Membuat kerangka fungsi
        2. Deklarasi scanner
        3. Membuat inputan
        4. Pembulatan angka 
        5. Hitung selisih
        6. Memanggil fungsi agar output bisa tampil 
    */
    
    static Scanner sc = new Scanner(System.in);
    
  public static void main(String args[]) {
   //inputNilai(); 
   double panjang = 0.0, lebar = 0.0;
   diagonal (panjang , lebar);
  }
  
  //fungsi untuk latihan 1
  static double inputNilai (){
      double nilai;
      System.out.print("Masukkan nilai : ");
      nilai = sc.nextDouble();
    double nilaiBulat = Math.round(nilai);
    double selisih = Math.abs(100-nilaiBulat);
    System.out.println("Hasil nilai yang dibulatkan : " + nilaiBulat);
    System.out.println("Selisih dari 100 : " + selisih);
    return selisih;
  }
  
  
  /*
        1. Membuat kerangka fungsi 
        2. Membuat inputan 
        3. Hitung diagonal
        4. Memanggil fungsi agar output bisa tampil 
  */
  //fungsi untuk latihan 2
  static double diagonal(double panjang, double lebar) {
    System.out.print("Masukan Panjang : ");
    panjang = sc.nextDouble();
    System.out.print("Masukan lebar : ");
    lebar = sc.nextDouble();
    double diagonal = Math.sqrt(Math.pow(panjang, 2) + (Math.pow(lebar, 2)));
    System.out.print("Hasil Diagonal : " + diagonal);
    return diagonal;
  } 
  
  //ruang eksplor
 /*
 
 
 */
}