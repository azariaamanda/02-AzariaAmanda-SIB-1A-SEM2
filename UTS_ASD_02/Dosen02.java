public class Dosen02 {
    int nidn;
    String namaDosen;
    String email;
    int tahunMasuk;
    String prodi;

    Dosen02(int nidn, String namaDosen, String email, int tahunMasuk, String prodi) {
        this.nidn = nidn;
        this.namaDosen = namaDosen;
        this.email = email;
        this.tahunMasuk = tahunMasuk;
        this.prodi = prodi;
    }

    void tampilDosen() {
        System.out.println("====Data Dosen====");
        System.out.println("NIDN: " + nidn);
        System.out.println("Nama: " + namaDosen);
        System.out.println("Email: " + email);
        System.out.println("Masa Kerja:" + (2025 - tahunMasuk) + " Tahun");
        System.out.println("Prodi: " + prodi);
        System.out.println("-------------------------");
    }

    void urutkanASC(Dosen02[] dosen) {      // Bubble Sort Ascending
        for (int i = 0; i < dosen.length - 1; i++) {
            for (int j = 0; j < dosen.length - 1; j++) {
                if (dosen[j].nidn > dosen [j+1].nidn) {  
                    Dosen02 temp = dosen[j];
                    dosen[j] = dosen[j + 1];
                    dosen[j + 1] = temp;
                }
            }
        }
    }

    static void searchNama (Dosen02[] dosen, String cari){     //sequensial search
        int letak = -1;
        for (int i = 0; i < dosen.length; i++){
            if (dosen[i].namaDosen.equalsIgnoreCase(cari)){
                dosen[i].tampilDosen();
                letak = i;
            }
        }
        if (letak == -1) {
            System.out.println("Dosen dengan Nama " + cari + " tidak ditemukan.");
        }
    }

    void UrutkanMasaKerja(Dosen02[] dosen) {        // Bubble Sort Descending
        for (int i = 0; i < dosen.length - 1; i++) {
            for (int j = 0; j < dosen.length - 1; j++) {
                if ((2025 - dosen[j].tahunMasuk) < (2025 - dosen[j + 1].tahunMasuk)) {  
                    Dosen02 temp = dosen[j];
                    dosen[j] = dosen[j + 1];
                    dosen[j + 1] = temp;
                }
            }
        }
    }

}