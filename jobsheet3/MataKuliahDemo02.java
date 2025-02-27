import java.util.Scanner;
public class MataKuliahDemo02 {
    
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        
        int jumlah;
        System.out.print("Masukkan Jumlah Elemen: ");
        jumlah = sc2.nextInt();
        sc2.nextLine();
        
        MataKuliah02[] arrayOfMataKuliah = new MataKuliah02[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i=0; i < jumlah; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah02();
            arrayOfMataKuliah[i].tambahData(sc2);
        }

        System.out.println("\n============================");
        for (MataKuliah02 matkul : arrayOfMataKuliah){
            matkul.cetakInfo();
        }   
    }
}
// for (int i = 0; i < 3; i++) {
//     System.out.println("Data Mata Kuliah ke-" + (i + 1));
//     System.out.println("Kode        : " + arrayOfMataKuliah[i].kode);
//     System.out.println("Nama        : " + arrayOfMataKuliah[i].nama);
//     System.out.println("SKS         : " + arrayOfMataKuliah[i].sks);
//     System.out.println("Jumlah Jam  : " + arrayOfMataKuliah[i].jumlahJam);
//     System.out.println("---------------------------------------");

// }
