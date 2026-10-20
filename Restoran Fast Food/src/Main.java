public class Main {

    public static void main(String[] args) {

        // Object 1 menggunakan Default Constructor
        MenuItem menu1 = new MenuItem();

        // Object 2 menggunakan Basic Parameterized Constructor
        MenuItem menu2 = new MenuItem(
            "Burger",
            25000
        );

        // Object 3 menggunakan Full Parameterized Constructor
        MenuItem menu3 = new MenuItem(
            "Es Teh",
            "Minuman",
            8000,
            20
        );

        // Menampilkan informasi awal setiap menu
        System.out.println("=== INFORMASI AWAL MENU ===");

        System.out.println("\nMenu 1");
        menu1.tampilInformasi();

        System.out.println("\nMenu 2");
        menu2.tampilInformasi();

        System.out.println("\nMenu 3");
        menu3.tampilInformasi();

        // Melakukan perubahan stok menu
        System.out.println("\n=== PERUBAHAN STOK ===");

        menu2.updateStok(5);

        // Menampilkan kembali informasi menu setelah stok berubah
        System.out.println("\n=== INFORMASI MENU SETELAH UPDATE ===");

        menu2.tampilInformasi();
    }
}