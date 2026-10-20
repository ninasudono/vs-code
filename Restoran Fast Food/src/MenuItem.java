public class MenuItem {
    private String namaMenu;
    private String kategori;
    private double harga;
    private int stok;

    // Constructor 1: Default Constructor
    public MenuItem() {
        this("Menu Belum Dinamai", "Umum", 0.0, 0);
    }

    // Constructor 2: Basic Parameterized Constructor
    public MenuItem(String namaMenu, double harga) {
        this(namaMenu, "Makanan", harga, 10);
    }

    // Constructor 3: Full Parameterized Constructor
    public MenuItem(String namaMenu, String kategori,
                    double harga, int stok) {
        this.namaMenu = namaMenu;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
    }

    // Method untuk menampilkan informasi menu
    public void tampilInformasi() {
        System.out.println("--------------------------------");
        System.out.println("Nama Menu : " + namaMenu);
        System.out.println("Kategori  : " + kategori);
        System.out.println("Harga     : Rp" + harga);
        System.out.println("Stok      : " + stok);
        System.out.println("--------------------------------");
    }

    // Method untuk menambah atau mengurangi stok
    public void updateStok(int jumlah) {
        if (stok + jumlah < 0) {
            System.out.println(
                "Stok tidak mencukupi untuk dikurangi."
            );
        } else {
            stok += jumlah;
            System.out.println(
                "Stok " + namaMenu + " berhasil diperbarui."
            );
        }
    }
}