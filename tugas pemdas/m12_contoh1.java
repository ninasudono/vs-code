public class m12_contoh1 {
    public static void main(String[] args) {
        /*
        Hitung luas lingkaran dengan jari jari = 7
        hasilnya dibulatkan hingga 2 angka di belakang koma
        rumus = pi * r * r

        Math, Stack & Queue, Vector >> Arraylist
        */

    double jari = 7;
    double luas = Math.PI * (Math.pow(jari, 2));

    //membulatkan ke atas hingga 2 angka di belakang komai
    double hasil = Math.round(luas);
    //kalau 2 digit
    double hasil2 = Math.round(luas*100.0) / 100.0;
    //kalau 3 digit >> double hasil2 = Math.round(luas*1000.0) / 1000.0;

    System.out.println("Luas : "+luas);
    System.out.println("Hasil : "+hasil);
    System.out.println("Hasil 2 angka belakang koma : "+hasil2);
    }
}