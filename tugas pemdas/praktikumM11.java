import java.util.Scanner;

public class praktikumM11 {
public static int faktorial(int n) {
if (n == 1) { // base case
    return 1;
} else { // recursive case
    return n * faktorial(n - 1);
    }
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Masukkan angka = ");
    int angka = input.nextInt();

    System.out.println("Hasil faktorial = " + faktorial(angka));
    }
}
