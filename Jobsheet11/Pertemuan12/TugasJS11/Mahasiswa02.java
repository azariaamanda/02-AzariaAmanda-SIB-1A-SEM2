package Pertemuan12.TugasJS11;

public class Mahasiswa02 {
    String nim;
    String nama;
    String kelas;

    Mahasiswa02(){
    }

    Mahasiswa02 (String nm, String name, String kls){
        nim = nm;
        nama = name;
        kelas = kls;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("");
    }
}