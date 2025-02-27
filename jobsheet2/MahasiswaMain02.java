public class MahasiswaMain02 {
    public static void main(String[] args) {
        Mahasiswa02 mhs1 = new Mahasiswa02() ;
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2441720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas ("SI 2K") ;
        mhs1.updateIpk(-1) ;
        mhs1.tampilkanInformasi();

        Mahasiswa02 mhs2 = new Mahasiswa02("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa02 mhsAzaria = new Mahasiswa02("Azaria Amanda", "244107060060", 3.46, "SIB 1A");
        mhsAzaria.updateIpk(3.89);
        mhsAzaria.tampilkanInformasi();
    }
}