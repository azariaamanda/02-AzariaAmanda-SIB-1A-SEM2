package Pertemuan12;

public class SLLMain02 {
    public static void main(String[] args) {
        SingleLinkedList02 sll = new SingleLinkedList02();

        Mahasiswa02 mhs1 = new Mahasiswa02("1001", "Alvaro", "1A", 3.5);
        Mahasiswa02 mhs2 = new Mahasiswa02("1002", "Bimon", "2B", 3.7);
        Mahasiswa02 mhs3 = new Mahasiswa02("1003", "Cintia", "3C", 3.9);
        Mahasiswa02 mhs4 = new Mahasiswa02("1004", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
