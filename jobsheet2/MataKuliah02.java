public class MataKuliah02 {
    
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah02() {
    }

    public MataKuliah02(String kodeMk, String nm, int sks, int jumlahJam){
        this.kodeMk = kodeMk;
        nama = nm;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMk);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jam > jumlahJam) {
            System.out.println("Pengurangan tidak dapat dilakukan");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi, sisa jam: " + jumlahJam);
        }
        
    }
}
