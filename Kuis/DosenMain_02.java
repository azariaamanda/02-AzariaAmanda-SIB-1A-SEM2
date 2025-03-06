import java.util.Scanner;
public class DosenMain_02 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        Dosen_02 dosen1 = new Dosen_02();
        dosen1.nidn = "D001";
        dosen1.nama = "Berlian Kusuma";
        dosen1.tahunMasuk = 2009;
        dosen1.jenjangPendidikan = "S2";
        dosen1.prodi = "Sistem Informasi";
        dosen1.tampilkanInfo();
        dosen1.ubahProdi("Jaringan Komputer");
        dosen1.ubahPendidikan("S3");

        dosen1.tampilkanInfo();


        Dosen_02 dosen2 = new Dosen_02("D002", "Rizky Abdullah", 2010, "S1", "Matematika");
        dosen2.tampilkanInfo();
        dosen2.ubahProdi("Kalkulus");
        dosen2.ubahPendidikan("S3");

        dosen2.tampilkanInfo();

    }      
}
