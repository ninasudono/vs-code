public class BankAccount {
    //Atribut privat (Data Hiding)
    private String accountNumber;
    private String ownerName;
    private double balance;

    //Konstruktor Utama (Parameterized Constructor) dengan validasi
    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Nomor rekening tidak boleh null atau kosong.");
        }

        if (ownerName == null || ownerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama pemilik tidak boleh null atau kosong.");
        }

        if (initialBalance < 0) {
            throw new IllegalArgumentException("Saldo awal tidak boleh kurang dari 0.");
        } else {
            this.balance = initialBalance;
        }

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    //Overloaded Constructor (Constructor Chaining)
    public BankAccount(String accountNumber, String ownerName) {
        this(accountNumber, ownerName, 0.0);
    }

    //Getter
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public double getBalance() {
        return this.balance;
    }

    //Method deposit
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Setoran berhasil. Saldo Saat ini: " + this.balance);
        } else {
            System.out.println("Gagal. Setoran harus lebih besar dari 0.");
        }
    }

    //Method withdraw (Tarik Tunai)
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Gagal. Jumlah penarikan harus lebih besar dari 0.");
        } else if (amount > this.balance) {
            System.out.println("Gagal. Saldo tidak mencukupi.");
        } else {
            this.balance -= amount;
            System.out.println("Penarikan berhasil. Saldo saat ini: " + this.balance);
        }
    }
}