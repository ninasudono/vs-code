public class Main {
    public static void main(String[] args) {
        Buku buku = new Buku("Hujan", "Tere Liye", 320);
        Majalah majalah = new Majalah("National Geographic", "Susan Goldberg", "Edisi Oktober 2026");

        System.out.println("=== STATUS AWAL PERPUSTAKAAN ===");
        System.out.println(buku);
        System.out.println(majalah);

        buku.setTersedia(false);

        System.out.println("\n=== STATUS SETELAH PEMINJAMAN ===");
        System.out.println(buku);
        System.out.println(majalah);
    }
}