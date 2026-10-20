import java.util.Scanner;

public class Transportasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int peserta;
        int bus, minibus, mobil, sisa;

        System.out.print("Masukkan jumlah peserta: ");
        peserta = input.nextInt();

        bus = peserta / 50;
        sisa = peserta % 50;

        minibus = sisa / 15;
        sisa = sisa % 15;

        mobil = sisa / 7;
        if (sisa % 7 != 0) {
            mobil++;
        }

        System.out.println("Bus: " + bus);
        System.out.println("Mini Bus: " + minibus);
        System.out.println("Mobil: " + mobil);
    }
}