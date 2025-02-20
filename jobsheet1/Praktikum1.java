import java.util.Scanner;
public class Praktikum1 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
                
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        int nilaiTugas = sc2.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int nilaiKuis = sc2.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int nilaiUTS = sc2.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int nilaiUAS = sc2.nextInt();
        System.out.println("==============================");
        System.out.println("==============================");
        
        String nilaiAkhirHuruf, keterangan=""; 
        Double nilaiAkhir;

        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS <0 | nilaiUAS > 100 ){
            System.out.println("Nilai Tidak Valid");
        } else {
            nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);
            if (nilaiAkhir > 80 && nilaiAkhir <=100) {
                nilaiAkhirHuruf = "A";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiAkhirHuruf = "B+";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiAkhirHuruf = "B";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiAkhirHuruf = "C+";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiAkhirHuruf = "C";
                keterangan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiAkhirHuruf = "D";
                keterangan = "SELAMAT ANDA TIDAK LULUS";
            } else {
                nilaiAkhirHuruf = "E";
                keterangan = "SELAMAT ANDA TIDAK LULUS";
            }
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiAkhirHuruf);
        }
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println(keterangan);
    }
}