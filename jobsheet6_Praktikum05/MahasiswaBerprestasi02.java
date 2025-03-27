public class MahasiswaBerprestasi02 {
    Mahasiswa02 [] listMhs = new Mahasiswa02 [2];
    int idx;

    //menambahkan objek dari class Mahasiswa ke dalam atribut listMhs
    void tambah (Mahasiswa02 m){
        if (idx<listMhs.length){
            listMhs[idx] = m; //listmhs ini dinamai m
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for(Mahasiswa02 m:listMhs){
            m.tampilInformasi();
            System.out.println("--------------------");
        }
    }

    void bubbleSort(){
        for (int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length; j++){
                if (listMhs[j].ipk>listMhs[j-1].ipk){
                    Mahasiswa02 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i=0; i<listMhs.length-1; i++){
            int idxMin=i;
            for (int j=i+1; j<listMhs.length; j++){
                if (listMhs[j].ipk<listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            Mahasiswa02 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void InsertionSort(){
        for (int i=1; i<listMhs.length; i++){
            Mahasiswa02 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk < temp.ipk){
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}