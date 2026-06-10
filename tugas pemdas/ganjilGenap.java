import java.util.Scanner;
public class ganjilGenap {
    public static void main(String[] args) {
        /*
        Buatlah fungsi isGanjil() yang menerima satu parameter bertipe int.
        Fungsi mengembalikan nilai boolean: true jika bilangan ganjil, false jika
        genap. Uji dengan beberapa angka. Hint: gunakan operator % (modulus)
        
        Clue:
        - tipe fungsi int
        - return value : boolean
        */
       Scanner sc = new Scanner(System.in);

       int a=0;

       System.out.print("Masukkan Angka = ");
       a = sc.nextInt();
       
       //memanggil fungsi tanpa System.out.println
       isGanjil(a);
    }

    static boolean isGanjil (int angka){
        if (angka % 2 == 0){
             System.out.println("Genap");
            return true;
        } else {
            System.out.println("Ganjil");
            return false;
        }
    }
    
}