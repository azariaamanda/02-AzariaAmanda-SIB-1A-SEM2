public class TransaksiPengisian_02 {
    Kendaraan_02 kendaraan;
    BBM_02 bbm;
    double liter;
    double totalBayar;
    NodeKendaraan_02 head;
    NodeKendaraan_02 tail;
    int MAX = 100;
    String[] transaksi = new String[MAX];
    int front = -1;
    int rear = -1;
    double totalPertamax = 0;
    double totalPertalite = 0;
    double totalSolar = 0;


    public TransaksiPengisian_02() {
    }

    TransaksiPengisian_02(Kendaraan_02 kendaraan, BBM_02 bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = bbm.hargaPerLiter * liter;
    }

    boolean isEmpty() {
        return (head == null);
    }

    public void tambahAntrian(Kendaraan_02 kendaraan) {
        NodeKendaraan_02 newNode = new NodeKendaraan_02(kendaraan, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Kendaraan_02 lihatKendaraanDepan() {
        if (isEmpty()) {
            return null;
        }
        return head.data;
    }

    public Kendaraan_02 removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Kendaraan_02 data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    public Kendaraan_02 layaniKendaraan(BBM_02 bbm, double liter) {
        if (isEmpty()) {
            System.out.println("Tidak ada kendaraan dalam antrian");
            return null;
        }

        Kendaraan_02 kendaraan = removeFirst();
        TransaksiPengisian_02 transaksiBaru = new TransaksiPengisian_02(kendaraan, bbm, liter);

        // Update total per jenis
        if (bbm.namaBBM.equalsIgnoreCase("pertamax")) {
            totalPertamax += liter;
        } else if (bbm.namaBBM.equalsIgnoreCase("pertalite")) {
            totalPertalite += liter;
        } else if (bbm.namaBBM.equalsIgnoreCase("solar")) {
            totalSolar += liter;
        } else {
            System.out.println("Jenis BBM tidak dikenali.");
            return null;
        }

        String data = kendaraan.platNomor + " : "+ transaksiBaru.totalBayar;
        simpanTransaksi(data);

        return kendaraan;
    }

    public void tampilAntrian() {
        if (!isEmpty()) {
            NodeKendaraan_02 tmp = head;
            while (tmp != null) {
                tmp.data.tampilkanInfo();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian Kosong");
        }
    }

    public void jumlahAntrian() {
        int count = 0;
        NodeKendaraan_02 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println(">>> Jumlah Kendaraan dalam Antrian: " + count);
    }

    public void tampilkanRiwayatTransaksi() {
        if (rear == -1) {
        System.out.println("Belum ada transaksi yang tercatat.");
        return;
    }
        System.out.println("=== Riwayat Transaksi ===");
        System.out.println("Daftar Transaksi: ");
        for (int i = front; i <= rear; i++) {
            System.out.println(transaksi[i]);
        }

        // Tampilkan total per jenis
        System.out.println("\n=== Total BBM yang dikeluarkan ===");
        System.out.println("Total pertamax yang dikeluarkan: " + totalPertamax + " liter");
        System.out.println("Total pertalite yang dikeluarkan: " + totalPertalite + " liter");
        System.out.println("Total solar yang dikeluarkan: " + totalSolar + " liter");
    }

    public void simpanTransaksi(String data) {
        if (rear == MAX - 1) {
            System.out.println("Riwayat transaksi penuh!");
            return;
        }
        if (front == -1)
            front = 0;
        transaksi[++rear] = data;
    }
}
