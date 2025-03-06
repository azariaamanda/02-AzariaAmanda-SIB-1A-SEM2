import java.util.Scanner;

public class MataKuliahMain_02 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in); 

        Dosen_02[] dosenpengampu = new Dosen_02[2];
        dosenpengampu[0] = new Dosen_02("D001", "Berlian Kusuma", 2009, "S3", "Jaringan Komputer");
        dosenpengampu[1] = new Dosen_02("D002", "Rizky Abdullah", 2010, "S1", "Matematika");

        System.out.println("===== Daftar Dosen =====");
        for (Dosen_02 dosen : dosenpengampu) {
            dosen.tampilkanInfo();
        }

        MataKuliah_02 mk1 = new MataKuliah_02("MK001", "Pemrograman Dasar", 3, "Teknologi Informasi", 2);

        for (Dosen_02 dosen : dosenpengampu) {
            mk1.tambahDosen(dosen);
        }

        mk1.tampilkanInfo();

        System.out.print("\nMasukkan nama mata kuliah baru: ");
        String namaBaru = sc2.nextLine();
        mk1.ubahNamaMK(namaBaru);
        mk1.tampilkanInfo();

        System.out.print("\nMasukkan jumlah SKS baru: ");
        int sksBaru = sc2.nextInt();
        mk1.ubahSKS(sksBaru);
        mk1.tampilkanInfo();

    }
}
