import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        int pilihMenu=0;
        double s;
        
        while (pilihMenu !=4){
            System.out.println("\n===== PROGRAM PENGHITUNG KUBUS ====");
            System.out.println("1. Menghitung Volume Kubus");
            System.out.println("2. Menghitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus (Total Panjang Rusuk)");
            System.out.println("4. Keluar");
            System.out.println("----------------------------------------------");
            System.out.print("Pilih Menu (1-4): ");
            pilihMenu = sc2.nextInt();
            sc2.nextLine();

            if (pilihMenu >= 1 && pilihMenu <= 3) {
                System.out.print("Masukkan panjang sisi kubus: ");
                s = sc2.nextDouble();
                sc2.nextLine();
                
                if (s <= 0) {
                    System.out.println("Panjang sisi harus lebih dari 0!");
                } else {
                    if (pilihMenu == 1) {
                       System.out.println("Volume Kubus: " + hitungVolume(s));
                    } else if (pilihMenu == 2) {
                        System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(s));
                    } else if (pilihMenu == 3) {
                        System.out.println("Keliling Kubus (Total Panjang Rusuk): " + hitungKeliling(s));
                    }
                }
            } else if (pilihMenu == 4) {
                System.out.println("Terima kasih! Program selesai.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih angka 1-4.");
            }
        }
    }

    public static double hitungVolume(double s) {
        double volume = s * s * s;
        return volume;
    }

    public static double hitungLuasPermukaan(double s) {
        double luasPermukaan = 6 * (s * s);
        return luasPermukaan;
    }

    public static double hitungKeliling(double s){
        double keliling = 12 * s;
        return keliling;
    }

}
