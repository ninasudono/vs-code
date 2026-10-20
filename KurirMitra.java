
package Praktikum6;

public class KurirMitra extends Kurir
        implements PresensiDigital {

    private double upahPerPaket;

    public KurirMitra(String idKurir, String nama,
                      int jumlahPaketTerkirim,
                      double upahPerPaket) {
        super(idKurir, nama, jumlahPaketTerkirim);
        this.upahPerPaket = upahPerPaket;
    }

    @Override
    public double hitungGaji() {
        return jumlahPaketTerkirim * upahPerPaket;
    }

    @Override
    public void rekamKehadiran() {
        System.out.println(
            "[PRESENSI MOBILE] Kurir Mitra " + nama
            + " presensi via GPS Mobile App."
        );
    }

    @Override
    public void cetakLaporanKehadiran() {
        System.out.println(
            "[REKAP] Log aktivitas pengiriman harian Mitra "
            + nama + " tersimpan."
        );
    }

    @Override
    public void tampilkanProfil() {
        System.out.println("=== KURIR MITRA (FREELANCE) ===");
        super.tampilkanProfil();

        System.out.printf(
            "Upah/Paket : Rp %,.2f%n", upahPerPaket
        );

        System.out.printf(
            "TOTAL GAJI : Rp %,.2f%n", hitungGaji()
        );
    }
}
