public class MainBankTest {

    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN SISTEM SATUBANK ===");

        //Membuat akun 1 menggunakan constructor utama
        BankAccount acc1 = new BankAccount("REK-001", "Masha", 6000000);

        System.out.println("\n=== AKUN 1 ===");
        System.out.println("Akun 1 berhasil dibuat: "
                + acc1.getOwnerName()
                + " | Saldo: Rp" + acc1.getBalance());

        acc1.balance = -1000000;
        //Baris di atas jika diaktifkan akan menghasilkan compile-time error
        //karena balance memiliki access modifier private.

        //Membuat akun 2 menggunakan overloaded constructor
        BankAccount acc2 = new BankAccount("REK-002", "Nailong");

        System.out.println("\n=== AKUN 2 ===");
        System.out.println("Akun 2 berhasil dibuat: "
                + acc2.getOwnerName()
                + " | Saldo: Rp" + acc2.getBalance());

        //Pengujian deposit
        System.out.println("\n=== TES DEPOSIT ===");
        acc2.deposit(200000);

        //Pengujian withdraw dengan jumlah valid
        System.out.println("\n=== TES WITHDRAW VALID ===");
        acc1.withdraw(1000000);

        //Pengujian withdraw melebihi saldo
        System.out.println("\n=== TES WITHDRAW MELEBIHI SALDO ===");
        acc2.withdraw(500000);

        //Pengujian saldo awal negatif
        System.out.println("\n=== TES SALDO AWAL NEGATIF ===");
        try {
            BankAccount acc3 = new BankAccount("REK-003", "Labubu", -50000);
        } catch (IllegalArgumentException e) {
            System.out.println("Sistem menolak (Tertangkap Exception): "
                    + e.getMessage());
        }

        //Pengujian nama null
        System.out.println("\n=== TES NAMA NULL ===");
        try {
            BankAccount acc4 = new BankAccount("REK-004", null, 50000);
        } catch (IllegalArgumentException e) {
            System.out.println("Sistem menolak (Tertangkap Exception): "
                    + e.getMessage());
        }

        //Menampilkan saldo akhir
        System.out.println("\n=== SALDO AKHIR ===");
        System.out.println(acc1.getAccountNumber()
                + " | " + acc1.getOwnerName()
                + " | Saldo: Rp" + acc1.getBalance());

        System.out.println(acc2.getAccountNumber()
                + " | " + acc2.getOwnerName()
                + " | Saldo: Rp" + acc2.getBalance());
    }
}