package Pertemuan12;

import java.util.Scanner;
public class SLLMain02 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        SingleLinkedList02 sll = new SingleLinkedList02();
                
        int pilih;
        do {
            System.out.println("\n==============================================");
            System.out.println("               MENU LINKED LIST               ");
            System.out.println("==============================================");
            System.out.println("1. Tambah data mahasiswa di awal");
            System.out.println("2. Tambah data mahasiswa di akhir");
            System.out.println("3. Tambah data mahasiswa setelah nama tertentu");
            System.out.println("4. Tambah data di index tertentu");
            System.out.println("5. Tampilkan semua data");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc2.nextInt();
            sc2.nextLine();
            
            switch (pilih) {
                case 1:
                    Mahasiswa02 awal = inputMahasiswa(sc2);
                    sll.addFirst(awal);
                    break;
                case 2:
                    Mahasiswa02 akhir = inputMahasiswa(sc2);
                    sll.addLast(akhir);
                    break;
                case 3:
                    System.out.print("Masukkan nama setelah siapa datanya ditambahkan: ");
                    String key = sc2.nextLine();
                    Mahasiswa02 input = inputMahasiswa(sc2);
                    sll.insertAfter(key, input);
                    break;
                case 4:
                    System.out.print("Masukkan index: ");
                    int index = sc2.nextInt();
                    sc2.nextLine();
                    Mahasiswa02 indeks = inputMahasiswa(sc2);
                    sll.insertAt(index, indeks);
                    break;
                case 5:
                    sll.print();
                    break;
                case 6:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 6);
    }

    public static Mahasiswa02 inputMahasiswa(Scanner sc2){
    
        System.out.print("Masukkan Nama: ");
        String nama = sc2.next();
        System.out.print("Masukkan NIM: ");
        String nim = sc2.next();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc2.next();
        System.out.print("Masukkan IPK: ");
        double ipk = sc2.nextDouble();
        sc2.nextLine();
    
        Mahasiswa02 mhs = new Mahasiswa02(nim, nama, kelas, ipk);
        System.out.println("Data mahasiswa berhasil ditambahkan.\n");
        return mhs;
    }
}

// Mahasiswa02 mhs1 = new Mahasiswa02("1001", "Alvaro", "1A", 3.5);
// Mahasiswa02 mhs2 = new Mahasiswa02("1002", "Bimon", "2B", 3.7);
// Mahasiswa02 mhs3 = new Mahasiswa02("1003", "Cintia", "3C", 3.9);
// Mahasiswa02 mhs4 = new Mahasiswa02("1004", "Dirga", "4D", 3.6);

// sll.print();
// sll.addFirst(mhs4);
// sll.print();
// sll.addLast(mhs1);
// sll.print();
// sll.insertAfter("Dirga", mhs3);
// sll.insertAt(2, mhs2);
// sll.print();