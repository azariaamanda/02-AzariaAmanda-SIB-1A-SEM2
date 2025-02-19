public class flowchart2 {
    public static void main(String[] args) {
        int[][] rating = {
            {4, 3, 4, 4},
            {1, 1, 2, 3},
            {1, 2, 3, 4}
        };

        double[] rataRataFilm = hitungRataRata(rating);
        int filmTertinggi = cariFilmTertinggi(rataRataFilm);
        int filmTerendah = cariFilmTerendah(rataRataFilm);

        System.out.println("Rata-rata rating setiap film:");
        for (int i = 0; i < rataRataFilm.length; i++) {
            System.out.printf("Film %d: %.2f\n", i, rataRataFilm[i]);
        }

        System.out.println("\nFilm dengan rating tertinggi: Film " + filmTertinggi);
        System.out.println("Film dengan rating terendah: Film " + filmTerendah);
    }

     // Fungsi untuk menghitung rata-rata rating setiap film
     static double[] hitungRataRata(int [][] rating) {
        int jumlahPenonton = rating.length;
        int jumlahFilm = rating[0].length;
        double[] rataRata = new double[jumlahFilm]; 

        for (int film = 0; film < jumlahFilm; film++) {
            double total = 0;
            for (int penonton = 0; penonton < jumlahPenonton; penonton++) {
                total += rating[penonton][film];
            }
            rataRata[film] = total / jumlahPenonton;
        }
        return rataRata;
    }

    // Fungsi untuk mencari film dengan rating tertinggi
    static int cariFilmTertinggi(double [] rataRata) {
        int filmTertinggi = 0;
        for (int i = 1; i < rataRata.length; i++) {
            if (rataRata[i] > rataRata[filmTertinggi]) {
                filmTertinggi = i;
            }
        }
        return filmTertinggi;
    }
    
    // Fungsi untuk mencari film dengan rating terendah
    static int cariFilmTerendah(double [] rataRata) {
        int filmTerendah = 0;
        for (int i = 1; i < rataRata.length; i++) {
            if (rataRata[i] < rataRata[filmTerendah]) {
                filmTerendah = i;
            }
        }
        return filmTerendah;
    }
}
