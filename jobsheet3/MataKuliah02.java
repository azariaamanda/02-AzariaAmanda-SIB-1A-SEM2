import java.util.Scanner;

public class MataKuliah02 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah02() {}

    public MataKuliah02(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(Scanner sc2){
        System.out.print("Kode        : ");
        kode = sc2.nextLine();
        System.out.print("Nama        : ");
        nama = sc2.nextLine();
        System.out.print("SKS         : ");
        sks = sc2.nextInt();
        sc2.nextLine();
        System.out.print("Jumlah Jam  : ");
        jumlahJam = sc2.nextInt();
        sc2.nextLine();
        System.out.println("---------------------------------------");
    }

    void cetakInfo() {
        System.out.println("Kode Mata Kuliah: " + this.kode);
        System.out.println("Nama Mata Kuliah: " + this.nama);
        System.out.println("SKS             : " + this.sks);
        System.out.println("Jumlah Jam      : " + this.jumlahJam);
        System.out.println("---------------------------------------");

    }`
}
