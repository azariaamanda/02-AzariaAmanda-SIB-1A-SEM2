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
            System.out.println("5. Hapus data setelah data key");
            System.out.println("6. Hapus data berdasarkan indeks tertentu");
            System.out.println("7. Cari Mahasiswa berdasarkan NIM");
            System.out.println("8. Insert After NIM");
            System.out.println("9. Insert After indeks tertentu");
            System.out.println("10. Tampilkan data");
            System.out.println("11. Tampilkan data awal");
            System.out.println("12. Tampilkan data akhir");
            System.out.println("13. Tampilkan data berdasarkan indeks tertentu");
            System.out.println("14. Tampilkan jumlah data");
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
                    System.out.print("Masukkan NIM yang dijadikan key dan dicari: ");
                    String nimKey = scan02.nextLine();
                    list.removeAfter(nimKey);
                    break;
                case 6:
                    System.out.print("Masukkan indeks yang dicari: ");
                    int indexs = scan02.nextInt();
                    scan02.nextLine();
                    list.remove(indexs);
                    break;
                case 7:
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
                case 8:
                    System.out.print("Masukkan data Mahasiswa yang dicari: ");
                    String keyNim = scan02.nextLine();
                    System.out.println("Masukkan data Mahasiswa yang baru: ");
                    Mahasiswa02 newMhs = inputMahasiswa(scan02);
                    list.insertAfter(keyNim, newMhs);
                    break;
                case 9:
                    System.out.print("Masukkan indeks yang dicari: ");
                    int index = scan02.nextInt();
                    scan02.nextLine();
                    System.out.println("Masukkan data Mahasiswa yang baru: ");
                    Mahasiswa02 newMhs2 = inputMahasiswa(scan02);
                    list.add(index, newMhs2);
                    break;
                case 10:
                    list.print();
                    break;
                case 11:
                    Mahasiswa02 dataAwal = list.getFirst();
                    if (dataAwal != null) {
                        System.out.println("Data awal: ");
                        System.out.println("NIM: " + dataAwal.nim + ", Nama: " + dataAwal.nama + ", Kelas: " + dataAwal.kelas + ", IPK: " + dataAwal.ipk);
                    }
                    break;
                case 12:
                    Mahasiswa02 dataAkhir = list.getLast();
                    if (dataAkhir != null) {
                        System.out.println("Data akhir: ");
                        System.out.println("NIM: " + dataAkhir.nim + ", Nama: " + dataAkhir.nama + ", Kelas: " + dataAkhir.kelas + ", IPK: " + dataAkhir.ipk);
                    }
                    break;
                case 13:
                    System.out.print("Masukkan indeks yang dicari: ");
                    int index2 = scan02.nextInt();
                    scan02.nextLine();
                    Mahasiswa02 dataByIndex = list.getIndex(index2);
                    if (dataByIndex != null) {
                        System.out.println("Data pada indeks " + index2 + ": ");
                        System.out.println("NIM: " + dataByIndex.nim + ", Nama: " + dataByIndex.nama + ", Kelas: " + dataByIndex.kelas + ", IPK: " + dataByIndex.ipk);
                    }
                    break;
                case 14:
                    list.getSize();
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