public class Teknisi extends Karyawan {
    private double uangLembur;
    
    public Teknisi(String id, String nama, double gajiPokok, double uangLembur) {
        super(id, nama, gajiPokok);
        this.uangLembur = uangLembur;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "Uang Lembur: " + uangLembur+"\n";
    }
}