public class Dosen_02 {
    String nidn;
    String nama;
    int tahunMasuk;
    String jenjangPendidikan;
    String prodi;

    public Dosen_02() {
    }

    public Dosen_02(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi){
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }
    
    void tampilkanInfo (){
        System.out.println("============= Data Dosen =============");
        System.out.println("NIDN Dosen               : " + nidn);   
        System.out.println("Nama Dosen               : " + nama);
        System.out.println("Tahun Masuk              : " + tahunMasuk);
        System.out.println("Jenjang Pendidikan       : " + jenjangPendidikan);
        System.out.println("Program Studi            : " + prodi);
    }
    public void ubahProdi(String prodiBaru) {
        this.prodi = prodiBaru;
        System.out.println("Program Studi dosen " + nama + " diubah menjadi: " + prodi);
    }

    public void ubahPendidikan(String pendidikanBaru) {
        this.jenjangPendidikan = pendidikanBaru;
        System.out.println("Jenjang Pendidikan dosen " + nama + " diubah menjadi: " + jenjangPendidikan);
    }
}

