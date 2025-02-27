public class DosenMain02 {
    public static void main(String[] args) {

        Dosen02 dosen1 = new Dosen02();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Berlian Kusuma";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Sistem Informasi";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("Jaringan Komputer");
        dosen1.tampilInformasi();

        Dosen02 dosen2 = new Dosen02("D002", "Prof. Budi Santoso", true, 2015, "Machine Learning");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        dosen2.hitungMasaKerja(2025);
        dosen2.ubahKeahlian("Kalkulus");
        dosen2.tampilInformasi();
    }
}
