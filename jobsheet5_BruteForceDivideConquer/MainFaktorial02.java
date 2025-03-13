import java.util.Scanner;

public class MainFaktorial02 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input02.nextInt();

        Faktorial02 fk = new Faktorial02();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialBF(nilai));
    }
}
