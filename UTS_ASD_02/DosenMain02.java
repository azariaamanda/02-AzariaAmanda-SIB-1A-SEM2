import java.util.Scanner;
public class DosenMain02 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        int menu2 = 0;

        Dosen02[] dosen = {
            new Dosen02(11002, "Dr. Ahmad","ahmad01@gmail.com",2015, "Informatika"),
            new Dosen02(11005, "Dr. Budi", "budi02@gmail.com", 2016, "Sistem Informasi"),
            new Dosen02(11003, "Dr. Citra","citra03@gmail.com",2017, "Teknik Komputer"),
            new Dosen02(11001, "Dr. Dewi", "dewi04@gmail.com", 2018, "Sistem Informasi Bisnis"),
        };

        do {
            System.out.println("====MENU DATA DOSEN====");
            System.out.println("1. Tampilkan Data Dosen");
            System.out.println("2. Urutkan dosen berdasarkan NIDN (ascending)");
            System.out.println("3. Cari Dosen berdasarkan Nama Dosen");
            System.out.println("4. Urutkan data dosen berdasarkan masa kerja dosen (descending)");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu: ");
            menu2 = sc2.nextInt();
            
            switch (menu2) {
                case 1:
                    for (Dosen02 dsn : dosen) {
                        dsn.tampilDosen();
                    }
                    break;
                case 2: 
                    System.out.println("Data Dosen diurutkan berdasarkan NIDN (ascending)");
                    System.out.println("=================================================");
                    dosen[0].urutkanASC(dosen);
                    for (Dosen02 dsn : dosen) {
                        dsn.tampilDosen();
                    }
                    break;
                case 3:
                sc2.nextLine();
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String cari = sc2.nextLine();
                    dosen[0].searchNama(dosen, cari);
                    break;
                case 4:
                    System.out.println("Data Dosen diurutkan berdasarkan masa kerja (descending)");
                    System.out.println("========================================================");
                    dosen[0].UrutkanMasaKerja(dosen);
                    for (Dosen02 dsn : dosen) {
                        dsn.tampilDosen();
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (menu2 != 0);
    }
}
