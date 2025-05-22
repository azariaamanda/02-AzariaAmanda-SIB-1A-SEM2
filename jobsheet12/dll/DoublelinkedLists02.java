package dll;

public class DoublelinkedLists02 {
    Node02 head;
    Node02 tail;

    public DoublelinkedLists02() {
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(Mahasiswa02 data){
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa02 data){
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Node02 search(String nim) {
        Node02 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void insertAfter(String keyNim, Mahasiswa02 data) {
        Node02 current = head;

        //Cari node dengan nim = keyNIm
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node02 newNode = new Node02(data);

        //Jika current adalah tail, cukupk tambahkan di akhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            // Sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked list kosong.");
        }
        Node02 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
        head.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
        tail.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void add(int index, Mahasiswa02 data) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        } 
        Node02 current = head;
        int i = 0;
        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Index melebihi ukuran list.");
            return;
        } else if (current == tail) {
            addLast(data);
        } else {
            Node02 newNode = new Node02(data);
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    public void removeAfter(String key) {
        Node02 current = head;

        //Cari node dengan nim = keyNIm
        while (current != null) {
            if (current.data.nim.equalsIgnoreCase(key)) {
                if (current.next == null) {
                    System.out.println("Tidak ada node setelah " + key);
                } else if (current.next == tail) {
                removeLast();
                } else {
                    Node02 toDelete = current.next;
                    current.next = toDelete.next;
                    toDelete.next.prev = current;
                    System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
                    toDelete.data.tampil();
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Data dengan NIM " + key + " tidak ditemukan.");
    }

    public void remove(int indexs) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (indexs < 0) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (indexs == 0) {
            removeFirst();
            return;
        }

        Node02 current = head;
        int i = 0;
        while (current != null && i < indexs) {
            current = current.next;
            i++;
        }
        if (current == tail) {
            removeLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: ");
            current.data.tampil();
        }
    }
    
    public Mahasiswa02 getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return null;
        }
        return head.data;
    }
    
    public Mahasiswa02 getLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return null;
        }
        return tail.data;
    }

    public Mahasiswa02 getIndex(int index) {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return null;
        }
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return null;
        }
        Node02 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Index melebihi ukuran list.");
            return null;
        }
        return current.data;
    }

    public int getSize() {
        int count = 0;
        Node02 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Jumlah data dalam linked list: " + count);
        return count;
    }
}

