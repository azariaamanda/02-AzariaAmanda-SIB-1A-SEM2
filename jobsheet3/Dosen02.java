public class Dosen02 {
    public String kode;
    public String nama;
    public String jenisKelamin;
    public int usia;
    
    public Dosen02(String kode, String nama, String jenisKelamin, int usia){
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    void cetakInfo(){
        System.out.println("----------------------------------------");
        System.out.println("Kode Dosen    : " + kode);
        System.out.println("Nama Dosen    : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Usia Dosen    : " + usia);
    }
}

