public class TestKaryawan {
    public static void main(String[] args) {
        Karyawan k1 = new Karyawan();
        System.out.println("Nama: " + k1.getNama());

        Karyawan k2 = new Karyawan("Rara Anjani", 20000.0);
        System.out.println("Nama: " + k2.getNama());

        Karyawan k3 = new Karyawan(10000.0);
        System.out.println(k3.getNama()+"\t"+k3.getGaji());

        Karyawan k4 = new Karyawan(15000.0);
        System.out.println(k4.getNama()+"\t"+k4.getGaji());
    }
}