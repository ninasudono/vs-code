public class Main {
    public static void main(String[] args) {

        // Membuat tiga object menu
        MenuItem menuKosong = new MenuItem();

        MenuItem menuBurger = new MenuItem(
            "Burger Spesial rasa MBG",
            25000.0
        );

        MenuItem menuMinuman = new MenuItem(
            "Es teh manis",
            "Minuman",
            8000.0,
            50
        );

        // Menampilkan data menu awal
        System.out.println("=== Data Menu Awal ===");

        menuBurger.tampilInformasi();
        menuKosong.tampilInformasi();
        menuMinuman.tampilInformasi();

        // Proses transaksi dan perubahan stok
        System.out.println("\n=== Proses Transaksi ===");

        System.out.println("Pelanggan membeli 3 porsi Burger Spesial...");
        menuBurger.updateStok(-3);

        System.out.println("Restoran melakukan restock 20 gelas Es Teh Manis...");
        menuMinuman.updateStok(20);

        // Menampilkan data menu setelah update
        System.out.println("\n=== Data Menu Setelah Update ===");

        menuBurger.tampilInformasi();
        menuMinuman.tampilInformasi();
    }
}