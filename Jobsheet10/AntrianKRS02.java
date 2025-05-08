public class AntrianKRS02 {
    Mahasiswa02[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahKRS = 0;


    public AntrianKRS02(int max) {
        this.max = max;
        this.data = new Mahasiswa02[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian (Mahasiswa02 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa02 layaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa02 mhs = data[front];
        front = (front + 1) % max;
        size--;
        jumlahKRS++;
        return mhs;
    }

    public void panggilAntrian() {
        if(size < 2) {
            System.out.println("Antrian tidak cukup untuk dipanggil.");
        } else {
            Mahasiswa02 mhs1 = layaniMahasiswa();
            System.out.println("Memanggil antrian mahasiswa 1: ");
            mhs1.tampilkanData();

            Mahasiswa02 mhs2 = layaniMahasiswa();
            System.out.println("Memanggil antrian mahasiswa 2: ");
            mhs2.tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        } 
        System.out.println("Dafrar Mahasiswa dalam Antian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void tampilkanDuaTerdepan() {
        if (size < 2) {
            System.out.println("Antrian tidak cukup untuk ditampilkan.");
        } else {
            System.out.println("Mahasiswa Terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa Terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahKRS() {
        return jumlahKRS;
    }

    public int getSisaKuotaKRS() {
        int kuotaMax = 30;
        return Math.max(0, kuotaMax - jumlahKRS);
    }
    
}
