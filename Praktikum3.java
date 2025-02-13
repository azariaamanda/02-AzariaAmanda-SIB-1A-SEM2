import java.util.Scanner;
public class Praktikum3 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        
        String [] matkul = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", 
                            "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        int[] sks = {3, 2, 2, 3, 3, 3, 2, 3};
        double[] nilaiAngka = new double[matkul.length];
        String[] nilaiHuruf = new String[matkul.length];
        double[] nilaiSetara = new double[matkul.length];

        for (int i = 0; i < 8; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + matkul[i] + ": ");
            nilaiAngka[i] = sc2.nextDouble();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiSetara[i] = 4;
                nilaiHuruf[i] = "A";
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiSetara[i] = 3.5;
                nilaiHuruf[i] = "B+";
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiSetara[i] = 3;
                nilaiHuruf[i] = "B";
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiSetara[i] = 2.5;
                nilaiHuruf[i] = "C+";
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiSetara[i] = 2;
                nilaiHuruf[i] = "C";
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiSetara[i] = 1;
                nilaiHuruf[i] = "D";
            } else {
                nilaiSetara[i] = 0;
                nilaiHuruf[i] = "E";
            }
        }

        double nilaiTotal = 0, totalSKS = 0;

        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-40s %-12s %-10s %-10s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");


        for (int i = 0; i < 8; i++) {
            System.out.printf("%-40s %-14.2f %-12s %-14.2f\n", matkul[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);

            nilaiTotal += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ipSemester = nilaiTotal / totalSKS;

        System.out.println("==============================");
        System.out.printf("Indeks Prestasi Semester (IP): %.2f\n", ipSemester);
        
    }
}


