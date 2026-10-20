import java.util.Scanner; // Import ini wajib untuk input data
public class ContohArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Menentukan berapa banyak data yang mau dimasukkan
        System.out.print("Masukkan jumlah buah yang ingin didata: ");
        int jumlah = input.nextInt();
        input.nextLine(); // Membersihkan sisa enter

        // 2. Membuat array dengan ukuran sesuai input user
        String[] daftarBuah = new String[jumlah];

        // 3. Mengisi array menggunakan perulangan 'for'
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama buah ke-" + (i + 1) + ": ");
            daftarBuah[i] = input.nextLine();
        }

        // 4. Menampilkan hasil yang sudah diisi
        System.out.println("\n--- Daftar Buah Anda ---");
        for (int i = 0; i < daftarBuah.length; i++) {
            System.out.println("Buah " + (i + 1) + ": " + daftarBuah[i]);
        }
        
        System.out.println("Total buah: " + daftarBuah.length);
    }
}