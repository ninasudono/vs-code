public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    //Konstruktor utama
    public BankAccount(String accountNumber, String ownerName,
                       double initialBalance) {

        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Nomer rekening tidak boleh kosong."
            );
        }

        if (ownerName == null || ownerName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Nama pemilik tidak boleh kosong."
            );
        }

        if (initialBalance < 0) {
            throw new IllegalArgumentException(
                "Saldo awal tidak boleh kurang dari 0."
            );
        }

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    //Overloaded constructor
    //Saldo awal otomatis 0
    public BankAccount(String accountNumber, String ownerName) {
        this(accountNumber, ownerName, 0.0);
    }

    //Getter nomor rekening
    public String getAccountNumber() {
        return this.accountNumber;
    }

    //Getter nama pemilik
    public String getOwnerName() {
        return this.ownerName;
    }

    //Getter saldo
    public double getBalance() {
        return this.balance;
    }

    //Method deposit
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(
                "Setoran berhasil! Saldo Saat Ini: " + this.balance
            );
        } else {
            System.out.println(
                "Gagal! Setoran harus lebih besar dari 0."
            );
        }
    }

    //Method withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(
                "Gagal! Jumlah penarikan harus lebih besar dari 0."
            );
        } else if (amount > this.balance) {
            System.out.println(
                "Gagal! Saldo tidak mencukupi."
            );
        } else {
            this.balance -= amount;
            System.out.println(
                "Penarikan berhasil! Saldo Saat Ini: " + this.balance
            );
        }
    }
}