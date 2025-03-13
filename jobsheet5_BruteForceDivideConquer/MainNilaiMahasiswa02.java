public class MainNilaiMahasiswa02 {
    public static void main(String[] args) {
        String[][] arrDataNilai = {
            {"Ahmad", "220101001", "2022", "78", "82"},
            {"Budi", "220101002", "2022", "85", "88"},
            {"Cindy", "220101003", "2021", "90", "87"},
            {"Dian", "220101004", "2021", "76", "79"},
            {"Eko", "220101005", "2023", "92", "95"},
            {"Fajar", "220101006", "2020", "88", "85"},
            {"Gina", "220101007", "2023", "80", "83"},
            {"Hadi", "220101008", "2020", "82", "84"}
        };

        NilaiMahasiswa02[] mahasiswa = new NilaiMahasiswa02[arrDataNilai.length];

        // Mengisi array mahasiswa dengan objek NilaiMahasiswa02
        for (int i = 0; i < arrDataNilai.length; i++) {
            mahasiswa[i] = new NilaiMahasiswa02(
                arrDataNilai[i][0],
                arrDataNilai[i][1],
                Integer.parseInt(arrDataNilai[i][2]),
                Double.parseDouble(arrDataNilai[i][3]),
                Double.parseDouble(arrDataNilai[i][4])
            );
        }

        // Menampilkan data mahasiswa dalam format tabel
        System.out.println("===========================================================================");
        System.out.printf("| %-20s | %-10s | %-10s | %-10s | %-10s |\n", "Nama", "NIM", "Tahun Masuk", "Nilai UTS", "Nilai UAS");
        System.out.println("===========================================================================");
        for (NilaiMahasiswa02 mhs : mahasiswa) {
            mhs.tampilkanDataNilai();
        }
        System.out.println("===========================================================================");

        System.out.println("\n===========================================================================");
        System.out.println("NILAI UTS TERTINGGI menggunakan Divide and Conquer");
        System.out.println("===========================================================================");
        int indexUTSTertinggi = NilaiMahasiswa02.cariUTSTertinggi(mahasiswa, 0, mahasiswa.length - 1);
        System.out.println("Nama       : " + mahasiswa[indexUTSTertinggi].nama);
        System.out.println("NIM        : " + mahasiswa[indexUTSTertinggi].nim);
        System.out.println("Tahun Masuk: " + mahasiswa[indexUTSTertinggi].tahunMasuk);
        System.out.println("Nilai UTS  : " + mahasiswa[indexUTSTertinggi].nilaiUTS);

        System.out.println("\n===========================================================================");
        System.out.println("NILAI UTS TERENDAH menggunakan Divide and Conquer");
        System.out.println("===========================================================================");
        int indexUTSTerendah = NilaiMahasiswa02.cariUTSTerendah(mahasiswa, 0, mahasiswa.length - 1);
        System.out.println("Nama       : " + mahasiswa[indexUTSTerendah].nama);
        System.out.println("NIM        : " + mahasiswa[indexUTSTerendah].nim);
        System.out.println("Tahun Masuk: " + mahasiswa[indexUTSTerendah].tahunMasuk);
        System.out.println("Nilai UTS  : " + mahasiswa[indexUTSTerendah].nilaiUTS);
        
        System.out.println("\n===========================================================================");
        System.out.println("RATA-RATA NILAI UAS menggunakan Brute Force");
        System.out.println("===========================================================================");
        double rataRataUAS = NilaiMahasiswa02.rataRataUAS(mahasiswa);
        System.out.println("Rata-rata nilai UAS dari semua mahasiswa: " + rataRataUAS);
    }
}