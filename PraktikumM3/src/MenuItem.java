public class MenuItem {
    private String namaMenu;
    private String kategori;
    private Double harga;
    private int stok;
    
    public MenuItem(String namaMenu, String kategori, double harga, int stok){
        this.namaMenu = namaMenu;
        this.stok = stok;
        this.harga = harga;
        this.kategori = kategori;
    }

    public MenuItem() {
        this("Menunya gaada cuy", "Umum", 0.0, 0);
    }

    public MenuItem(String namaMenu, double harga) {
        this(namaMenu, "Makanan", harga, 10);
    }

    public void tampilInformasi() {
    System.out.println("=================================");
    System.out.println("Nama Menu: " + this.namaMenu);
    System.out.println("Kategori: " + this.kategori);
    System.out.println("Harga: " + this.harga);
    System.out.println("Sisa Stok: " + this.stok);
    System.out.println("=================================");
    }

    public void updateStok(int jumlah) {
        this.stok += jumlah;
        if(this.stok <0){
            this.stok = 0;
        }
        System.out.println("Info Stok '" + this.namaMenu + "'Berhasil diupdate menjadi: " + this.stok);
    }
}