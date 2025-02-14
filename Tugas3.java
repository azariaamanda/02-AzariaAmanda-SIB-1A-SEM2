import java.util.Scanner;
public class Tugas3 {

    static String[] mataKuliah;
    static int[] jumlahSKS;
    static int[] semester;
    static String[] hariKuliah;
    static int jumlahMatkul;

    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        while(true) {
            System.out.println("====================================");
            System.out.println("   SISTEM MANAJEMEN JADWAL KULIAH   ");
            System.out.println("====================================");
            System.out.println("1. Input Mata Kuliah");
            System.out.println("2. Lihat Jadwal Kuliah");
            System.out.println("3. Cari Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");

            int pilihMenu = sc2.nextInt();
            sc2.nextLine();

            switch (pilihMenu) {
                case 1:
                    inputDataMatkul(sc2);
                    break;
                case 2:
                    tampilkanJadwal(sc2);
                    break;
                case 3:
                    cariMataKuliah(sc2);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    return; 
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    public static void inputDataMatkul(Scanner sc2){
        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlahMatkul = sc2.nextInt();
        sc2.nextLine();

        mataKuliah = new String[jumlahMatkul];
        jumlahSKS = new int[jumlahMatkul];
        semester = new int[jumlahMatkul];
        hariKuliah = new String[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("\nData untuk Mata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            mataKuliah[i] = sc2.nextLine();
            System.out.print("Jumlah SKS: ");
            jumlahSKS[i] = sc2.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc2.nextInt();
            sc2.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc2.nextLine();
        }
        System.out.println("\nSemua data berhasil ditambahkan!");
    }

    public static void tampilkanJadwal(Scanner sc2){
        if (jumlahMatkul == 0) {
            System.out.println("Belum ada data mata kuliah yang ditambahkan.");
            return;
        }

        System.out.println("\nPilih cara menampilkan jadwal ");
        System.out.println("1. Seluruh jadwal perkuliahan");
        System.out.println("2. Berdasarkan hari tertentu");
        System.out.println("3. Berdasarkan semester");
        System.out.print("Masukkan pilihan anda: ");
        int pilih = sc2.nextInt();
        sc2.nextLine();

        switch (pilih) {
            case 1:
                tampilkanSemuaJadwal();
                break;
            case 2:
                tampilkanBerdasarkanHari(sc2);
                break;
            case 3:
                tampilkanBerdasarkanSemester(sc2);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
    
    public static void tampilkanSemuaJadwal() {
        System.out.println("\nDaftar Jadwal Mata Kuliah:");
        System.out.printf("%-25s %-5s %-10s %-10s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("--------------------------------------");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.printf("%-25s %-5d %-10d %-10s\n", mataKuliah[i], jumlahSKS[i], semester[i], hariKuliah[i]);
        }
    }

    public static void tampilkanBerdasarkanHari(Scanner sc2) {
        System.out.print("Masukkan nama hari yang dicari: ");
        String cariHari = sc2.nextLine();
        boolean ditemukan = false;
        
        System.out.println("\nJadwal Kuliah untuk Hari: " + cariHari);
        System.out.printf("%-25s %-5s %-10s %-10s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("--------------------------------------");

        for (int i = 0; i < jumlahMatkul; i++) {
            if (hariKuliah[i].equalsIgnoreCase(cariHari)) {
                System.out.printf("%-25s %-5d %-10d %-10s\n", mataKuliah[i], jumlahSKS[i], semester[i], hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah pada hari tersebut.");
        }
    }

    public static void tampilkanBerdasarkanSemester(Scanner sc2) {
        System.out.print("Masukkan semester yang dicari: ");
        int cariSemester = sc2.nextInt();
        boolean ditemukan = false;
        
        System.out.println("\nJadwal Kuliah untuk Semester " + cariSemester + ":");
        System.out.printf("%-25s %-5s %-10s %-10s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("--------------------------------------");

        for (int i = 0; i < jumlahMatkul; i++) {
            if (semester[i] == cariSemester) {
                System.out.printf("%-25s %-5d %-10d %-10s\n", mataKuliah[i], jumlahSKS[i], semester[i], hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah pada semester tersebut.");
        }
    }

    public static void cariMataKuliah(Scanner sc2) {
        System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
        String matkulDicari = sc2.nextLine();
        boolean ditemukan = false;

        System.out.println("\nHasil Pencarian Mata Kuliah:");
        System.out.printf("%-25s %-5s %-10s %-10s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < jumlahMatkul; i++) {
            if (mataKuliah[i].equalsIgnoreCase(matkulDicari)) {
                System.out.printf("%-25s %-5d %-10d %-10s\n", mataKuliah[i], jumlahSKS[i], semester[i], hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan dalam daftar.");
        }
    }
}
