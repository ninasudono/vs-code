import java.util.Scanner;
public class M11tanpaBaseCase {
    public static void hitung(int n) {
        System.out.println(n);
        hitung(n - 1); //tidak ada base case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        hitung(n);

        sc.close();
    }
}