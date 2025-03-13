public class NilaiMahasiswa02 {
    String nama, nim;
    int tahunMasuk;
    double nilaiUTS, nilaiUAS;

    public NilaiMahasiswa02(String nama, String nim, int tahunMasuk, double nilaiUTS, double nilaiUAS){ 
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public NilaiMahasiswa02(){
    }

    public void tampilkanDataNilai(){
        System.out.printf("| %-20s | %-10s | %-10s | %-10s | %-10s |\n", nama, nim, tahunMasuk, nilaiUTS, nilaiUAS);
    }

    // mencari nilai UTS tertinggi dengan Divide and Conquer
    public static int cariUTSTertinggi(NilaiMahasiswa02[] mahasiswa, int left, int right) {
        if (left == right) {
            return left;
        }
        int mid = (left + right) / 2;
        int leftIndex = cariUTSTertinggi(mahasiswa, left, mid);
        int rightIndex = cariUTSTertinggi(mahasiswa, mid + 1, right);

        return (mahasiswa[leftIndex].nilaiUTS > mahasiswa[rightIndex].nilaiUTS) ? leftIndex : rightIndex;
    }

    // mencari nilai UTS terendah dengan Divide and Conquer
    public static int cariUTSTerendah(NilaiMahasiswa02[] mahasiswa, int left, int right) {
        if (left == right) {
            return left;
        }
        int mid = (left + right) / 2;
        int leftIndex = cariUTSTerendah(mahasiswa, left, mid);
        int rightIndex = cariUTSTerendah(mahasiswa, mid + 1, right);

        return (mahasiswa[leftIndex].nilaiUTS < mahasiswa[rightIndex].nilaiUTS) ? leftIndex : rightIndex;
    }

    // Menghitung rata-rata nilai UAS dengan Brute Force
    public static double rataRataUAS(NilaiMahasiswa02[] mahasiswa) {
        double total = 0;
        for (NilaiMahasiswa02 mhs : mahasiswa) {
            total += mhs.nilaiUAS;
        }
        return total / mahasiswa.length;
    }
}
