import java.util.Scanner;
public class DosenDemo02 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);
        int jumlahDosen, usia;
        String kode, nama, jenisKelamin;
        System.out.print("Masukkan jumlah dosen: ");
        jumlahDosen = sc02.nextInt();
        sc02.nextLine();
        Dosen02[] arrayOfDosen = new Dosen02[jumlahDosen];

        for (int i = 0; i < jumlahDosen ; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode Dosen    : ");
            kode = sc02.nextLine();
            System.out.print("Nama Dosen    : ");
            nama = sc02.nextLine();
            System.out.print("Jenis Kelamin : ");
            jenisKelamin = sc02.nextLine();
            System.out.print("Usia Dosen    : ");
            usia = sc02.nextInt();
            
            arrayOfDosen[i] = new Dosen02(kode, nama, jenisKelamin, usia);
            sc02.nextLine();
        }
        for (Dosen02 dsn : arrayOfDosen) {
            dsn.cetakInfo();
        }

        DataDosen02.dataSemuaDosen(arrayOfDosen);
        DataDosen02.infoDosenPalingTua(arrayOfDosen);
        DataDosen02.infoDosenPalingTua(arrayOfDosen);
        DataDosen02.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen02.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
    }
}
