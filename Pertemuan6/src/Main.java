public class Main {
    public static void main(String[] args) {
        Karyawan[] arrKaryawan = new Karyawan[4];

        arrKaryawan[0] = new Manager("M001", "Masha", 500000.0, 100000.0);
        arrKaryawan[1] = new Teknisi("T001", "Nailong", 350000.0, 50000.0);
        arrKaryawan[2] = new Sekretaris("S001", "Labubu", 400000.0, 120000.0);
        arrKaryawan[3] = new Teknisi("T002", "Bible", 150000.0, 50000.0);

        for (Karyawan karyawan: arrKaryawan) {
            System.out.println(karyawan.getDetails());
            System.out.println("--------------------");
                    }
    }
}