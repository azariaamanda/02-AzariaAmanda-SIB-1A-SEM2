public class DataDosen02 {
    Dosen02 [] listDosen = new Dosen02 [6];
    int idx;

    void tambah (Dosen02 d){
        if (idx<listDosen.length){
            listDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for(Dosen02 dsn:listDosen){
            dsn.tampil();
            System.out.println("--------------------");
        }
    }

    void bubbleSort(){
        for (int i=0; i<listDosen.length-1; i++){
            for(int j=1; j<listDosen.length; j++){
                if (listDosen[j].usia<listDosen[j-1].usia){
                    Dosen02 tmp = listDosen[j];
                    listDosen[j] = listDosen[j-1];
                    listDosen[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i=0; i<listDosen.length-1; i++){
            int idxMin=i;
            for (int j=i+1; j<listDosen.length; j++){
                if (listDosen[j].usia > listDosen[idxMin].usia){
                    idxMin = j;
                }
            }
            Dosen02 tmp = listDosen[idxMin];
            listDosen[idxMin] = listDosen[i];
            listDosen[i] = tmp;
        }
    }

    void InsertionSort(){
        for (int i=1; i<listDosen.length; i++){
            Dosen02 temp = listDosen[i];
            int j = i;
            while (j >= 0 && listDosen[j-1].usia < temp.usia){
                listDosen[j] = listDosen[j-1];
                j--;
            }
            listDosen[j] = temp;
        }
    }

    void sortUsia() {
        for (int i = 0; i < listDosen.length - 1; i++) {
            for (int j = 0; j < listDosen.length - 1 - i; j++) {
                if (listDosen[j].usia > listDosen[j + 1].usia) {
                    Dosen02 temp = listDosen[j];
                    listDosen[j] = listDosen[j + 1];
                    listDosen[j + 1] = temp;
                }
            }
        }
    }
    

    void sequentialSearching(String nama) {
        int jumlahDitemukan = 0; 
        String hasil = ""; 
    
        for (int j = 0; j < listDosen.length; j++) {
            if (listDosen[j].nama.equalsIgnoreCase(nama)) { 
                hasil += j + " "; 
                jumlahDitemukan++; 
            }
        }
    
        if (jumlahDitemukan == 0) {
            System.out.println("Data: " + nama + " tidak ditemukan.");
        } else if (jumlahDitemukan == 1) {
            System.out.println("Data: " + nama + " ditemukan pada indeks ke-" + hasil.trim());
        } else {
            System.out.println("Peringatan! Data: " + nama + " ditemukan lebih dari satu kali pada indeks: " + hasil.trim());
        }
    }

    void binarySearching(int usia){
        int posisi = -1;
        int awal = 0;
        int akhir = listDosen.length-1;
        int tengah;
        while (awal <= akhir){
            tengah = (awal + akhir)/2;
            if (listDosen[tengah].usia == usia){
                posisi = tengah;
                break;
            } else if (listDosen[tengah].usia < usia){
                awal = tengah + 1;
            } else {
                akhir = tengah - 1;
            }
        }
        if (posisi != -1){
            System.out.println("Data: "+usia+" ditemukan pada indeks ke-"+posisi);
        } else {
            System.out.println("Data: "+usia+" tidak ditemukan");
        }
    }

}
