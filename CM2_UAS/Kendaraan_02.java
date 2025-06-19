public class Kendaraan_02 {
    String platNomor;
    String tipe;
    String merk;

    public Kendaraan_02(String plat, String tipe, String merk) {
        this.platNomor = plat;
        this.tipe = tipe;
        this.merk = merk;
    }

    void tampilkanInfo() {
        System.out.println("-- Antrian Kendaraan --");
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Tipe      : " + tipe);
        System.out.println("Merk      : " + merk);
    }
}
