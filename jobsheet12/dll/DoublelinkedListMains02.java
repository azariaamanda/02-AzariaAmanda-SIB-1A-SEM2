package dll;

import java.util.Scanner;

public class DoublelinkedListMains02 {
    public static void main(String[] args) {
        DoublelinkedLists02 list = new DoublelinkedLists02();
        Scanner scan02 = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Insert After");
            System.out.println("0. Keluar");
            System.out.print("pilih Menu: ");
            pilihan = scan02.nextInt();
            scan02.nextLine();

            switch (pilihan) {
                case 1:    
                    Mahasiswa02 mhs = inputMahasiswa(scan02);
                    list.addFirst(mhs);
                    break;
                case 2:
                    Mahasiswa02 mhs2 = inputMahasiswa(scan02);
                    list.addLast(mhs2);
                    break;
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                    list.removeLast();
                    break;
                case 5:
                    list.print();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan02.nextLine();
                    Node02 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                case 7:
                    System.out.print("Masukkan data Mahasiswa yang dicari: ");
                    String keyNim = scan02.nextLine();
                    System.out.println("Masukkan data Mahasiswa yang baru: ");
                    Mahasiswa02 newMhs = inputMahasiswa(scan02);
                    list.insertAfter(keyNim, newMhs);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 0);
    }
    public static Mahasiswa02 inputMahasiswa(Scanner scan02) {
        System.out.print("Masukkan NIM: ");
        String nim = scan02.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan02.nextLine();
        System.out.print("Masukkan Kelas: "); 
        String kelas = scan02.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan02.nextDouble();
        return new Mahasiswa02(nim, nama, kelas, ipk);
    }
}