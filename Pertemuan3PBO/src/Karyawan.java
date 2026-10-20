public class Karyawan {
    private String nama;
    private double gaji;
    //no constructor
    public Karyawan() {
        nama = "Nina";
        gaji = "10000";
    }
    //tambah constructor
    public Karyawan(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }
    //getter dan setter nama
    public String getNama() {
        return nama;
    }
    //getter gaji
    public double getGaji() {
        return gaji;
    }
}