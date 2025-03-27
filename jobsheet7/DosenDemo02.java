import java.util.Scanner;
public class DosenDemo02 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        DataDosen02 data = new DataDosen02();
        
        Dosen02 dosen1 = new Dosen02("D001", "Budi", true, 40);
        Dosen02 dosen2 = new Dosen02("D002", "Siti", false, 35);
        Dosen02 dosen3 = new Dosen02("D003", "Ani", false, 34);
        Dosen02 dosen4 = new Dosen02("D004", "Rudi", true, 30);
        Dosen02 dosen5 = new Dosen02("D005", "Rina", false, 25);
        Dosen02 dosen6 = new Dosen02("D006", "Budi", true, 42);

        data.tambah(dosen1);
        data.tambah(dosen2);
        data.tambah(dosen3);
        data.tambah(dosen4);
        data.tambah(dosen5);
        data.tambah(dosen6);

        System.out.println("Data awal");
        data.tampil();
        System.out.println("====================");

        System.out.println("--------------------");
        System.out.println("Mengurutkan data berdasarkan usia...");
        data.sortUsia();
        data.tampil(); // Menampilkan data yang sudah terurut
        System.out.println("--------------------");

        System.out.println("Pencarian Data");
        System.out.print("Masukkan Nama Dosen yang dicari: ");
        String cari = sc2.nextLine();
        data.sequentialSearching(cari);

        System.out.println("--------------------");
        System.out.println("Pencarian data dengan binary search");
        System.out.println("--------------------");

        System.out.print("Masukkan Usia Dosen yang dicari: ");
        int cariUsia = sc2.nextInt();
        data.binarySearching(cariUsia);


    }
}

// System.out.println("Data awal");
// data.tampil();
// System.out.println("====================");

// System.out.println("Data sudah diurutkan dengan BUBBLE SORT");
// data.bubbleSort();
// data.tampil();

// System.out.println("Data sudah diurutkan dengan SELECTION SORT");
// data.selectionSort();
// data.tampil();

// System.out.println("Data sudah diurutkan dengan INSERTION SORT");
// data.InsertionSort();
// data.tampil();