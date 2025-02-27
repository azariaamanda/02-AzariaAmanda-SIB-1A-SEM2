public class Dosen02 {
   
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    
    public Dosen02(){

    }

    public Dosen02(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi(){
        System.out.println("Id Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        if (statusAktif == true) {
            System.out.println("Dosen tersebut AKTIF");
        } else{
            System.out.println("Dosen tersebut TIDAK AKTIF");
        }
    }

    void hitungMasaKerja(int thnSkrg){
        thnSkrg -= tahunBergabung;
        System.out.println("Berapa lama : "+ thnSkrg);
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }

}
