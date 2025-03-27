import java.util.Scanner;
public class MahasiswaDemo02 {
    public static void main(String[] args) {
        
        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Masukkan Jumlah mahasiswa: ");
        int jmlMahasiswa = sc2.nextInt();
        sc2.nextLine();

        Mahasiswa02[] arrayOfMhs = new Mahasiswa02[jmlMahasiswa];

        for (int i=0; i<jmlMahasiswa; i++){
            System.out.println("\nMasukkan data mahasiswa ke-"+(i+1));
            System.out.print("Masukkan NIM: ");
            String nim = sc2.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = sc2.nextLine();
            System.out.print("Masukkan Kelas: ");
            String kelas = sc2.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = sc2.nextDouble();
            sc2.nextLine();
            arrayOfMhs[i] = new Mahasiswa02(nim, nama, kelas, ipk);
            list.tambah(arrayOfMhs[i]);
        }
        System.out.println("====================================");
        
        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort(); //sorting berdasarkan ipk
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();
        
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        list.InsertionSort();
        list.tampil();
    }
}

// Mahasiswa02 m1 = new Mahasiswa02("123", "Zidan", "2A", 3.2);
// Mahasiswa02 m2 = new Mahasiswa02("124", "Ayu", "2A", 3.5);
// Mahasiswa02 m3 = new Mahasiswa02("125", "Sofi", "2A", 3.1);
// Mahasiswa02 m4 = new Mahasiswa02("126", "Sita", "2A", 3.9);
// Mahasiswa02 m5 = new Mahasiswa02("127", "Miki", "2A", 3.7);

// list.tambah(m1);
// list.tambah(m2);
// list.tambah(m3);
// list.tambah(m4);
// list.tambah(m5);


