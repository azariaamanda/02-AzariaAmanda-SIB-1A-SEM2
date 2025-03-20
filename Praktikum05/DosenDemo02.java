public class DosenDemo02 {
    public static void main(String[] args) {

        DataDosen02 data = new DataDosen02();
        
        Dosen02 dosen1 = new Dosen02("D001", "Budi", true, 30);
        Dosen02 dosen2 = new Dosen02("D002", "Siti", false, 25);
        Dosen02 dosen3 = new Dosen02("D003", "Ani", false, 35);
        Dosen02 dosen4 = new Dosen02("D004", "Rudi", true, 40);
        Dosen02 dosen5 = new Dosen02("D005", "Rina", false, 45);
        
        dosen1.tampil();
        dosen2.tampil();
        dosen3.tampil();
        dosen4.tampil();
        dosen5.tampil();
        System.out.println("====================");


        data.tambah(dosen1);
        data.tambah(dosen2);
        data.tambah(dosen3);
        data.tambah(dosen4);
        data.tambah(dosen5);

        System.out.println("Data awal");
        data.tampil();
        System.out.println("====================");

        System.out.println("Data sudah diurutkan dengan BUBBLE SORT");
        data.bubbleSort();
        data.tampil();

        System.out.println("Data sudah diurutkan dengan SELECTION SORT");
        data.selectionSort();
        data.tampil();

        System.out.println("Data sudah diurutkan dengan INSERTION SORT");
        data.InsertionSort();
        data.tampil();
    }
}
