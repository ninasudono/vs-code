import java.util.Scanner;
public class contohM10 {
    //blok class
    //membuat prosedur/function, serta var class level
    //var class level: static

    static Scanner sc = new Scanner(System.in);

    //procedure input >> ada scanner
    static void inputData(){
        //nilai tugas, nilai uts, nilai uas
        System.out.print("Masukkan nilai tugas : ");
        int nTugas = sc.nextInt();
        System.out.print("Masukkan nilai uts : ");
        int nUTS = sc.nextInt();
        System.out.print("Masukkan nilai uas : ");
        int nUAS = sc.nextInt();
        
        //panggil function
        nilaiAkhir(nTugas, nUTS, nUAS);
    }
    //function
    static int nilaiAkhir(int tg, int uts, int uas) {
        //NA = (30%*tugas)+(30%*uts)+(40%*uas)
        int NA = (tg*30/100)+(uts*30/100)+(uas*40/100);
        System.out.println("Nilai akhir : " +NA);
        return NA;
    }

    public static void main(String[] args) {
        //pebedaan signifikan antara prosedur & function
        /*
        1. Procedure: void, function: tipe data & return
        2. procedure tdk return value
        */

    //memanggil procedure & function
    inputData();

    }
}