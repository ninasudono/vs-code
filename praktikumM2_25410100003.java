import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class praktikumM2_25410100003{
public static void main(String[] args) throws IOException {
        
    // 1. Deklarasi Variabel
    float nominal;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader -> Input (Seperti Screener) -> Harus Float

    // 2. Proses
    System.out.print("Masukkan Nominal = ");
    nominal = Float.parseFloat(br.readLine()); 
    // Konversi Dari Integer Menjadi Float
    System.out.println("--------------------");
    int duapuluhRb = (int) (nominal / 20000);
    nominal = nominal % 20000;
    int sepuluhRb = (int) (nominal / 10000);
    nominal = nominal % 10000;
    int seribu = (int) (nominal / 1000);
    nominal = nominal % 1000;
    int limaratus = (int) (nominal / 500);
    nominal = nominal % 500;
    int duaratus = (int) (nominal / 200);
    nominal = nominal % 200;
    int seratus = (int) (nominal / 100);
    nominal = nominal % 100;
        
    // 3. Output 
    System.out.println("Dua puluh ribuan = " + duapuluhRb);
    System.out.println("Sepuluh ribuan = " + sepuluhRb);
    System.out.println("Seribuan = " + seribu);
    System.out.println("Lima ratusan = " + limaratus);
    System.out.println("Dua ratusan = " + duaratus);
    System.out.println("Seratusan = " + seratus);

    }
}
