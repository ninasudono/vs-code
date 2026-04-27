import java.util.Scanner;

public class tugasP3_25410100003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mata Kuliah 1
        System.out.print("Masukkan nama mata kuliah 1: ");
        String mk1 = input.nextLine();

        System.out.print("Masukkan jumlah SKS mata kuliah 1: ");
        int sks1 = input.nextInt();

        System.out.print("Masukkan nilai (contoh: 4.00 ): ");
        double nilai1 = input.nextDouble();
        input.nextLine(); // buang enter

        // Mata Kuliah 2
        System.out.print("\nMasukkan nama mata kuliah 2: ");
        String mk2 = input.nextLine();

        System.out.print("Masukkan jumlah SKS mata kuliah 2: ");
        int sks2 = input.nextInt();

        System.out.print("Masukkan nilai (contoh: 4.00 ): ");
        double nilai2 = input.nextDouble();
        input.nextLine(); // buang enter

        // Mata Kuliah 3
        System.out.print("\nMasukkan nama mata kuliah 3: ");
        String mk3 = input.nextLine();

        System.out.print("Masukkan jumlah SKS mata kuliah 3: ");
        int sks3 = input.nextInt();

        System.out.print("Masukkan nilai (contoh: 4.00 ): ");
        double nilai3 = input.nextDouble();
        input.nextLine(); // buang enter

        // Perhitungan IPS
        double totalBobot = (sks1 * nilai1) + (sks2 * nilai2) + (sks3 * nilai3);
        int totalSKS = sks1 + sks2 + sks3;
        double ips = totalBobot / totalSKS;

        // Penentuan SKS maksimal
        int sksMaks;
        if (ips >= 3.50) {
            sksMaks = 24;
        } else if (ips >= 3.00) {
            sksMaks = 22;
        } else if (ips >= 2.00) {
            sksMaks = 20;
        } else {
            sksMaks = 18;
        }

        // Output
        System.out.println("\n===== HASIL =====");
        System.out.println("IPS Mahasiswa: " + ips);
        System.out.println("SKS Maksimal yang dapat diambil: " + sksMaks);
    }
}