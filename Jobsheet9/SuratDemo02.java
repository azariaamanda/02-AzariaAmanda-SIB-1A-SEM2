import java.util.Scanner;
public class SuratDemo02 {
    public static void main(String[] args) {
        StrackSurat02 stack = new StrackSurat02(5);
        Scanner scan02 = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan02.nextInt();
            scan02.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Id Surat\t: ");
                    String idSurat = scan02.nextLine();
                    System.out.print("Nama\t\t: ");
                    String namaMahasiswa = scan02.nextLine();
                    System.out.print("Kelas\t\t: ");
                    String kelas = scan02.nextLine();
                    Surat02 srt = new Surat02(idSurat, namaMahasiswa, kelas);
                    stack.push(srt);
                    System.out.printf("Surat %s berhasil diajukan\n", srt.namaMahasiswa);
                    break;
                case 2:
                    Surat02 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Proses surat dari " + diproses.namaMahasiswa);
                        System.out.print("Jenis Izin (S/I) : ");
                        char jenisIzin = scan02.next().charAt(0);
                        System.out.print("Durasi           : ");
                        int durasi = scan02.nextInt();
                        diproses.suratDiproses(jenisIzin, durasi);
                        System.out.println("Surat " + diproses.namaMahasiswa + " telah diproses.");
                        System.out.println("ID Surat\tNama\tKelas\tJenis Izin\tDurasi");
                        System.out.println(diproses.idSurat + "\t\t" + diproses.namaMahasiswa + "\t" + diproses.kelas + "\t" + diproses.jenisIzin + "\t\t" + diproses.durasi);
                    } 
                    break;
                case 3:
                    Surat02 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dikumpulkan oleh " + lihat.namaMahasiswa);;
                    }
                    break;
                case 4:
                    System.out.print("Nama Mahasiswa yang dicari: ");
                    String nama = scan02.nextLine();
                    stack.cariNama(nama);
                    break;
                case 0:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}