import java.util.Scanner;
public class MataKuliahDemo02 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        MataKuliah02[] arrayOfMataKuliah = new MataKuliah02[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            kode = sc2.nextLine();
            System.out.print("Nama        : ");
            nama = sc2.nextLine();
            System.out.print("SKS         : ");
            dummy = sc2.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy =sc2.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------------");

            arrayOfMataKuliah[i] = new MataKuliah02(kode, nama, sks, jumlahJam);   
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            System.out.println("Kode        : " + arrayOfMataKuliah[i].kode);
            System.out.println("Nama        : " + arrayOfMataKuliah[i].nama);
            System.out.println("SKS         : " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMataKuliah[i].jumlahJam);
            System.out.println("---------------------------------------");

        }
    }
}
