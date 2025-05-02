public class Surat02 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat02() {
    }

    public Surat02(String idSurat, String namaMahasiswa, String kelas) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
    }
    
    public void suratDiproses(char jenisIzin, int durasi){
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
        
    }
}