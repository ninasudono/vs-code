import java.util.Scanner;
public class M11cetakBintang {
    public static void cetakBintang(int n) {
    if (n <= 0) {
        return; //base case
    }
    System.out.println("*");
    cetakBintang(n - 1); //recursive case
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bintang: ");
        int n = sc.nextInt();
        cetakBintang(n);
        
        sc.close();
    }
}