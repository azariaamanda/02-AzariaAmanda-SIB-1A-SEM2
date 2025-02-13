import java.util.Scanner;
public class Praktikum4 {
    
    static String[] cabangToko = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    static String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    static int[][] stokBunga = {
        {10, 5, 15, 7},   
        {6, 11, 9, 12},   
        {2, 10, 10, 5},   
        {5, 7, 12, 9}    
    };

    static int[] hargaBunga = {75000, 50000, 60000, 10000};
    static int[] bungaMati = {-1, -2, 0, -5};

    public static void hitungPendapatan() {
        System.out.println("\n=== Pendapatan Setiap Cabang ===");
        System.out.printf("%-15s | %-12s%n", "Cabang", "Pendapatan");
        System.out.println("--------------------------------");

        for (int i = 0; i < cabangToko.length; i++) {
            int totalPendapatan = 0;
            int[] stokCabang = stokBunga[i];

            for (int j = 0; j < namaBunga.length; j++) {
                totalPendapatan += stokCabang[j] * hargaBunga[j];
            }

            System.out.printf("%-15s | Rp %,12d%n", cabangToko[i], totalPendapatan);
        }
    }

    public static void tampilkanStokCabang4() {
        System.out.println("\n=== Stok RoyalGarden 4 Sebelum Pengurangan ===");
        tampilkanStok(stokBunga[3]);
    }

    public static void kurangiStokCabang4() {
        int[] stokCabang4 = stokBunga[3];

        for (int i = 0; i < namaBunga.length; i++) {
            stokCabang4[i] += bungaMati[i];
            if (stokCabang4[i] < 0) stokCabang4[i] = 0; 
        }

        System.out.println("\n=== Stok RoyalGarden 4 Setelah Pengurangan ===");
        tampilkanStok(stokCabang4);
    }

    public static void tampilkanStok(int[] stok) {
        System.out.printf("%-10s | %-10s%n", "Bunga", "Jumlah");
        System.out.println("-----------------------");
        for (int i = 0; i < namaBunga.length; i++) {
            System.out.printf("%-10s | %-10d%n", namaBunga[i], stok[i]);
        }
    }
    public static void main(String[] args) {
        hitungPendapatan();    
        tampilkanStokCabang4(); 
        kurangiStokCabang4();  
    }
}
