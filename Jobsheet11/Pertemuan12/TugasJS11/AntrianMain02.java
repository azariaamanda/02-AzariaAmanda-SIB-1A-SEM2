package Pertemuan12.TugasJS11;

import java.util.Scanner;
public class AntrianMain02 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        QueueAntrian02 antrian = new QueueAntrian02(); 

        int pilih;

        do {
            System.out.println("\n=== MENU LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian (Daftar Mahasiswa)");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Tampilkan Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc2.nextInt();
            sc2.nextLine(); 

            switch (pilih) {
                case 1: // Input data mahasiswa
                    System.out.print("\nMasukkan NIM: ");
                    String nim = sc2.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc2.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc2.nextLine();

                    Mahasiswa02 mhs = new Mahasiswa02(nim, nama, kelas); // Buat objek mahasiswa dan tambahkan ke antrian
                    antrian.enqueue(mhs);
                    System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
                    break;
                case 2:
                    antrian.dequeue(); // Panggil mahasiswa
                    break;
                case 3:
                    antrian.addFirst(); // Lihat depan
                    break;
                case 4:
                    antrian.addLast(); // Lihat belakang
                    break;
                case 5:
                    antrian.printQueue(); // Tampilkan semua
                    break;
                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    antrian.clearQueue(); // Kosongkan
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0); 
    }
}
