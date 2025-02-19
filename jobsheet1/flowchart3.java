public class flowchart3 {
    // Fungsi untuk menghitung rata-rata nilai
    static double hitungRataRata(int[] nilai) {
        double total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total / nilai.length;
    }
    
    // Fungsi untuk menentukan status kelulusan
    static void tentukanKelulusan(double rataRata) {
        if (rataRata >= 75) {
            System.out.println("Status: LULUS");
        } else {
            System.out.println("Status: TIDAK LULUS");
        }
    }
    public static void main(String[] args) {
        // Data nilai mahasiswa (3 mahasiswa, 4 mata kuliah)
        int[][] nilaiMahasiswa = {
            {85, 90, 78, 88}, // Mahasiswa 0
            {70, 75, 80, 65}, // Mahasiswa 1
            {92, 75, 89, 72}  // Mahasiswa 2
        };
        
        // System.out.println("HASIL ANALISIS NILAI MAHASISWA");
        // System.out.println("==============================");
        
        // Proses setiap mahasiswa
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            // Hitung rata-rata
            double rataRata = hitungRataRata(nilaiMahasiswa[i]);
            
            // Tampilkan hasil
            System.out.println("\nMahasiswa " + (i + 1));
            System.out.printf("Rata-rata nilai: %.2f\n", rataRata);
            
            // Tentukan status kelulusan (langsung cetak dari fungsi)
            tentukanKelulusan(rataRata);
            
        }
    }
}