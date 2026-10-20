package Praktikum6;

import java.util.ArrayList;
import java.util.List;

public class MainSistemEkspedisi {

    public static void main(String[] args) {

        // ==========================================
        // REKAP BIAYA OPERASIONAL ARMADA
        // ==========================================

        List<Armada> daftarArmada = new ArrayList<>();

        MotorExpress motor = new MotorExpress(
                "L 1234 ABC", "Honda Supra", 50, true
        );

        MobilBox mobil = new MobilBox(
                "B 9988 XYZ", "Isuzu Elf", 2000, 6
        );

        DronePengirim drone = new DronePengirim(
                "DR-001", "DJI Delivery", 5, 120
        );

        daftarArmada.add(motor);
        daftarArmada.add(mobil);
        daftarArmada.add(drone);

        double totalOperasional = 0;

        System.out.println("==============================================");
        System.out.println("             FASTSPEED EXPRESS");
        System.out.println("      REKAP BIAYA OPERASIONAL ARMADA");
        System.out.println("==============================================");

        for (Armada armada : daftarArmada) {
            System.out.println();

            armada.tampilkanInfoArmada();

            totalOperasional += armada.hitungBiayaOperasional();

            System.out.println();
        }

        System.out.printf(
                "TOTAL OPERASIONAL ARMADA/HARI: Rp %,.2f%n",
                totalOperasional
        );

        // ==========================================
        // DAFTAR GAJI & KAPABILITAS KURIR
        // ==========================================

        System.out.println();
        System.out.println("==============================================");
        System.out.println("     DAFTAR GAJI & KAPABILITAS KURIR");
        System.out.println("==============================================");

        KurirTetap kurirTetap = new KurirTetap(
                "K-001",
                "Rudi Hermawan",
                120,
                3500000,
                5000
        );

        KurirMitra kurirMitra = new KurirMitra(
                "M-501",
                "Bambang Perkasa",
                85,
                12000
        );

        // Menampilkan profil kurir tetap
        System.out.println();
        kurirTetap.tampilkanProfil();

        System.out.println();
        System.out.println("[UJI HAK AKSES & DYNAMIC CASTING]");

        AksesSistem akses = kurirTetap;
        akses.login("K-001", "password123");

        PresensiDigital presensiTetap = kurirTetap;
        presensiTetap.rekamKehadiran();

        // Menampilkan profil kurir mitra
        System.out.println();
        kurirMitra.tampilkanProfil();

        System.out.println();
        System.out.println("[UJI HAK AKSES & DYNAMIC CASTING]");

        if (kurirMitra instanceof AksesSistem) {
            ((AksesSistem) kurirMitra).login(
                    "M-501", "password123"
            );
        } else {
            System.out.println(
                    "Info: Kurir " + kurirMitra.getNama()
                    + " TIDAK MEMILIKI akses login dashboard."
            );
        }

        PresensiDigital presensiMitra = kurirMitra;
        presensiMitra.rekamKehadiran();

        System.out.println();
        System.out.println("==============================================");
        System.out.println("           AKHIR LAPORAN");
        System.out.println("==============================================");
    }
}