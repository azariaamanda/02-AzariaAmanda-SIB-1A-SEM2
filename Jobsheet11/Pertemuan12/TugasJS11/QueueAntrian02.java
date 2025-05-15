package Pertemuan12.TugasJS11;

public class QueueAntrian02 {
    NodeMahasiswa02 front, rear;
    int size;

    public QueueAntrian02() {
        front = rear = null;
        size = 0;
    }

    // Mengecek apakah antrian kosong
    public boolean isEmpty() {
        return front == null;
    }

    // Cek apakah antrian penuh Dalam implementasi linked list, antrian tidak pernah penuh
    public boolean isFull() {
        return false; 
    }

    // Mengosongkan antrian
    public void clearQueue() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    // Menambahkan mahasiswa ke antrian
    public void enqueue(Mahasiswa02 mhs) {
        NodeMahasiswa02 newNode = new NodeMahasiswa02(mhs, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Memanggil mahasiswa 
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dipanggil.");
            return;
        }
        System.out.println("Memanggil mahasiswa");
        front.data.tampilInformasi();
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
    }

    // Menampilkan data mahasiswa di depan antrian
    public void addFirst() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan: ");
            front.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    // Menampilkan data mahasiswa di belakang antrian
    public void addLast() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir: ");
            rear.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    // Menampilkan seluruh antrian
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Tidak ada antrian.");
            return;
        }

        System.out.println("Daftar antrian mahasiswa:");
        NodeMahasiswa02 current = front;
        while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
    }

    // Mengembalikan jumlah elemen antrian
    public int getJumlahAntrian() {
        return size;
    }
}