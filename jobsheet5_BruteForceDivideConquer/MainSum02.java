import java.util.Scanner;
public class MainSum02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner (System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input02.nextInt();

        Sum02 sm = new Sum02(elemen);
        for (int i=0; i<elemen; i++){
            System.out.print("Masukkan keuntungan ke-" + (i+1) + ": ");
            sm.keuntungan[i] = input02.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide ang Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
