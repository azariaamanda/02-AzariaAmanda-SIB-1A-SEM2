public class BinaryTreeArrayMain02 {
    public static void main(String[] args) {
        
        BinaryTreeArray02 bta = new BinaryTreeArray02();
        Mahasiswa02 mhs1 = new Mahasiswa02("244160121", "Ali", "A", 3.57);
        Mahasiswa02 mhs2 = new Mahasiswa02("244160221", "Badar", "B", 3.85);
        Mahasiswa02 mhs3 = new Mahasiswa02("244160185", "Candra", "C", 3.21);
        Mahasiswa02 mhs4 = new Mahasiswa02("244160220", "Dewi", "B", 3.54);

        Mahasiswa02 mhs5 = new Mahasiswa02("244160131", "Devi", "A", 3.72);
        Mahasiswa02 mhs6 = new Mahasiswa02("244160205", "Ehsan", "D", 3.37);
        Mahasiswa02 mhs7 = new Mahasiswa02("244160170", "Fizi", "B", 3.46);

        Mahasiswa02[] dataMahasiswas = {mhs1,mhs2,mhs3,mhs4,mhs5,mhs6,mhs7,null,null,null};
        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa:");
        bta.traverseInOrder(0);

        // nomor 4
        Mahasiswa02 mhs8 = new Mahasiswa02("244160199", "Gilang", "A", 3.88);
        bta.add(mhs8);
        System.out.println("\nSetelah menambah Gilang:");
        bta.traverseInOrder(0);

        System.out.println("\nPreorder Traversal Mahasiswa:");
        bta.traversePreOrder(0);
    }
}
