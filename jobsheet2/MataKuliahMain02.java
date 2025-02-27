public class MataKuliahMain02 {
    public static void main(String[] args) {
        MataKuliah02 mhs1 = new MataKuliah02();
        mhs1.kodeMk = "ITO321";
        mhs1.nama = "Algoritma Struktur Data";
        mhs1.sks = 3;
        mhs1.jumlahJam = 6;

        mhs1.tampilInformasi();
        mhs1.ubahSKS(2);
        mhs1.tambahJam(1);
        mhs1.kurangiJam(3);
        mhs1.tampilInformasi();

        MataKuliah02 mhs2 = new MataKuliah02("ITA890", "Sistem Operasi", 3,6);
        mhs2.ubahSKS(5);
        mhs2.tambahJam(1);
        mhs2.kurangiJam(3);
        mhs2.tampilInformasi();

    }
}
