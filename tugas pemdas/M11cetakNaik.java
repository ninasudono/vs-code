import java.util.Scanner;
public class M11cetakNaik {
    public static void cetakNaik(int n) {
        if (n == 0) {
            return; // base case
        }
        cetakNaik(n - 1); // recursive case
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        cetakNaik(n);
        sc.close();
    }
}