public class Karyawan {
    private String id;
    private String nama;
    private double gajiPokok;

    public Karyawan() {
    }

    public Karyawan(String id, String nama, double gajiPokok) {
        this.id = id;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public String getDetails () {
        return "ID = " + id + "\nNama = " + nama + "\nGaji Pokok = " + gajiPokok + "\n";
    }
}