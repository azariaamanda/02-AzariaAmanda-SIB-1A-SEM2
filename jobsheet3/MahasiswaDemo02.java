import java.util.Scanner;
public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        Mahasiswa02[] arrayOfMahasiswa = new Mahasiswa02[3];
        String dummy;

        for(int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa02();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim = sc2.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama = sc2.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = sc2.nextLine();
            System.out.print("IPK   : ");
            dummy = sc2.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------------");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke- " + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
            System.out.println("-----------------------------------");
        }
    }
} 