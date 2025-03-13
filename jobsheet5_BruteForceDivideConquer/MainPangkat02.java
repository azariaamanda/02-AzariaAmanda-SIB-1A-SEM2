import java.util.Scanner;
public class MainPangkat02 {
    public static void main(String[] args) {
        
        Scanner input02 = new Scanner (System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input02.nextInt();
 
        Pangkat02[] png = new Pangkat02[elemen];
        for (int i=0; i<elemen; i++){
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
            int basis = input02.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = input02.nextInt();
            png[i] = new Pangkat02(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for (Pangkat02 p : png){
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AN CONQUER: ");
        for (Pangkat02 p : png){
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
