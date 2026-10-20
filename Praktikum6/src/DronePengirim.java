public class DronePengirim extends Armada {

    private int batasKetinggianMaksimal;

    public DronePengirim(
            String noPlat,
            String merk,
            double kapasitasKg,
            int batasKetinggianMaksimal) {

        super(noPlat, merk, kapasitasKg);
        this.batasKetinggianMaksimal = batasKetinggianMaksimal;
    }

    @Override
    public double hitungBiayaOperasional() {
        return (kapasitasKg * 10000) + 50000;
    }

    @Override
    public void tampilkanInfoArmada() {
        System.out.println("[DRONE PENGIRIM]");
        super.tampilkanInfoArmada();

        System.out.println(
                "Batas Ketinggian Maksimal: "
                + batasKetinggianMaksimal + " meter"
        );

        System.out.printf(
                "Biaya/Hari: Rp %,.2f%n",
                hitungBiayaOperasional()
        );
    }
}