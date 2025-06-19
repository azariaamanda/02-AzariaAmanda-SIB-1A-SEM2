import java.util.Scanner;

public class BBMMain_02 {
    public static void main(String[] args) {

        TransaksiPengisian_02 trs = new TransaksiPengisian_02();
        Scanner input = new Scanner(System.in);

        int pilih;

        do {
            System.out.println("\n=== Menu SPBU ===");
            System.out.println("1. Tambahkan Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String platNomor = input.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan: ");
                    String tipe = input.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = input.nextLine();
                    Kendaraan_02 kendaraan = new Kendaraan_02(platNomor, tipe, merk);
                    
                    trs.tambahAntrian(kendaraan);
                    System.out.println(">> Kendaraan masuk ke dalam antrian.");
                    break;

                case 2:
                    trs.tampilAntrian();
                    break;

                case 3:
                    trs.jumlahAntrian();
                    break;

                case 4:
                    if (trs.isEmpty()) {
                        System.out.println("Tidak ada kendaraan dalam antrian.");
                        break;
                    }

                    Kendaraan_02 kendaraanBerikutnya = trs.lihatKendaraanDepan();
                    System.out.println("Petugas melayani " + kendaraanBerikutnya.platNomor);
    
                    System.out.print("Masukkan Jenis BBM: ");
                    String namaBBM = input.nextLine();
                    System.out.print("Masukkan Harga per liter: ");
                    double hargaPerLiter = input.nextDouble();
                    System.out.print("Masukkan Jumlah Liter: ");
                    double liter = input.nextDouble();
                    input.nextLine(); 
                    
                    BBM_02 bbm = new BBM_02(namaBBM, hargaPerLiter);
                    Kendaraan_02 kendaraanDilayani = trs.layaniKendaraan(bbm, liter);
                    System.out.println(">> Transaksi berhasil dicatat.");
                    break;

                case 5:
                    trs.tampilkanRiwayatTransaksi();
                    break;

                case 0:
                    System.out.println("Terima Kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
            
        } while (pilih != 0);
    }
}
