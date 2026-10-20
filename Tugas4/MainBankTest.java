public class MainBankTest {

    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN SISTEM SATUBANK ===");
        System.out.println();

        //Pengujian akun dengan saldo awal
        System.out.println("=== AKUN 1 ===");

        BankAccount acc1 = new BankAccount(
            "REK-001",
            "Masha",
            1500000
        );
        // Baris untuk menguji compile-time error
        acc1.balance = -100;

        System.out.println(
            "Akun 1 berhasil dibuat: "
            + acc1.getOwnerName()
            + " | Saldo: Rp"
            + acc1.getBalance()
        );

        System.out.println();

        //Pengujian overloaded constructor
        System.out.println("=== AKUN 2 ===");

        BankAccount acc2 = new BankAccount(
            "REK-002",
            "Nailong"
        );

        System.out.println(
            "Akun 2 berhasil dibuat: "
            + acc2.getOwnerName()
            + " | Saldo: Rp"
            + acc2.getBalance()
        );

        System.out.println();

        //Pengujian deposit
        System.out.println("=== PENGUJIAN DEPOSIT ===");
        System.out.println("Deposit Rp2.000.000 ke Akun 2");
        acc2.deposit(2000000);
        System.out.println();

        //Pengujian withdraw berhasil
        System.out.println("=== PENGUJIAN WITHDRAW ===");
        System.out.println("Tarik Rp1.000.000 dari Akun 1");
        acc1.withdraw(1000000);
        System.out.println();

        //Pengujian penarikan melebihi saldo
        System.out.println("=== PENGUJIAN SALDO TIDAK MENCUKUPI ===");
        System.out.println("Mencoba tarik Rp20.000.000 dari Akun 1");
        acc1.withdraw(20000000);
        System.out.println();

        //Pengujian saldo awal negatif
        System.out.println("=== PENGUJIAN SALDO AWAL NEGATIF ===");

        try {
            BankAccount acc3 = new BankAccount(
                "REK-003",
                "Labubu",
                -5000000
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Akun ditolak: " + e.getMessage());
        }

        System.out.println();

        //Pengujian nama null
        System.out.println("=== PENGUJIAN NAMA NULL ===");

        try {
            BankAccount acc4 = new BankAccount(
                "REK-004",
                null,
                5000000
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Akun ditolak: " + e.getMessage());
        }

        System.out.println();

        //Menampilkan saldo akhir
        System.out.println("=== SALDO AKHIR ===");

        System.out.println(
            acc1.getAccountNumber()
            + " | "
            + acc1.getOwnerName()
            + " | Saldo: Rp"
            + acc1.getBalance()
        );

        System.out.println(
            acc2.getAccountNumber()
            + " | "
            + acc2.getOwnerName()
            + " | Saldo: Rp"
            + acc2.getBalance()
        );
    }
}