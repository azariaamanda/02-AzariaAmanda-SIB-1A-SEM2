import java.util.Scanner;
public class LayananKRS02 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        AntrianKRS02 antrian = new AntrianKRS02 (10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Antrian Mahasiswa");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Mahasiswa Terdepan");
            System.out.println("5. Lihat Antrian paling akhir");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Jumlah mahasiswa yang sudah melakukan KRS");
            System.out.println("8. Jumlah mahasiswa yang belum melakukan KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc2.nextInt(); sc2.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc2.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc2.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc2.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc2.nextLine();
                    Mahasiswa02 mhs = new Mahasiswa02(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah Mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa yang sudah melakukan proses KRS: " + antrian.getJumlahKRS());
                    break;
                case 8:
                    System.out.println("Sisa kuota mahasiswa yang belum proses KRS (maks 30): " + antrian.getSisaKuotaKRS());
                    break;
                case 0:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);   
    }
}