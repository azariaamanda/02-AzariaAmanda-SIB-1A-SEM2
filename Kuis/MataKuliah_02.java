public class MataKuliah_02 {
    public String kodeMK;
    public String namaMK;
    public int SKS;
    public String jurusan;
    public Dosen_02[] dosenPengampu;
    public int jumlahDosen = 0;

    public MataKuliah_02(String kodeMK, String namaMK, int SKS, String jurusan, int kapasitasDosen) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.SKS = SKS;
        this.jurusan = jurusan;
        this.dosenPengampu = new Dosen_02[kapasitasDosen];
    }

    public void tambahDosen(Dosen_02 dosen) {
        if (jumlahDosen < dosenPengampu.length) {
            dosenPengampu[jumlahDosen] = dosen;
            jumlahDosen++;
            System.out.println("Dosen berhasil ditambahkan: " + dosen.nama);
        } else {
            System.out.println("Kapasitas dosen penuh, tidak bisa menambahkan dosen baru.");
        }
    }

    public void tampilkanInfo() {
        System.out.println("===== Informasi Mata Kuliah =====");
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + namaMK);
        System.out.println("SKS: " + SKS);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Dosen Pengampu:");
        for (int i = 0; i < jumlahDosen; i++) {
            dosenPengampu[i].tampilkanInfo();
        }
    }

    public void ubahNamaMK(String namaBaru) {
        this.namaMK = namaBaru;
        System.out.println("Nama mata kuliah diubah menjadi: " + namaMK);
    }

    public void ubahSKS(int sksBaru) {
        this.SKS = sksBaru;
        System.out.println("Jumlah SKS diubah menjadi: " + SKS);
    }
}
