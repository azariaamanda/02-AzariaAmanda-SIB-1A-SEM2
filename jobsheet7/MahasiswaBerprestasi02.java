public class MahasiswaBerprestasi02 {
    Mahasiswa02 [] listMhs;
    int idx;

    public MahasiswaBerprestasi02(int jumMhs){
        listMhs = new Mahasiswa02[jumMhs];
        idx = 0;
    }

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

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j=0; j<listMhs.length; j++){
            if (listMhs[j].ipk == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right >= left){
            mid =(left+right)/2;
            if(cari == listMhs[mid].ipk){
                return mid;
            }
            else if (listMhs[mid].ipk < cari){
                return findBinarySearch(cari, left, mid-1);
            }
            else {
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(double x, int pos){
        if (pos!=-1){
            System.out.println("Data mahasiswa dengan IPK: "+x+" ditemukan pada indeks ke-"+pos);
        }
        else {
            System.out.println("Data "+x+" tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos!=-1){
            System.out.println("nim\t : "+listMhs[pos].nim);
            System.out.println("nama\t : "+listMhs[pos].nama);
            System.out.println("kelas\t : "+listMhs[pos].kelas);
            System.out.println("ipk\t : "+x);
        }
        else {
            System.out.println("Data mahasiswa dengan IPK "+x+" tidak ditemukan");
        }
    }
}