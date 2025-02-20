import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nim: ");
        long nim = sc.nextLong();
        System.out.println("===========================");

        long nimAkhir = nim % 100;

        if (nimAkhir < 10) {
            nimAkhir += 10;
        }
        System.out.println("n : " + nimAkhir);

        for (int i = 1; i <= nimAkhir; i++) {

            if (i == 6 || i == 10) {
                System.out.print("* "); 
            } else if (i % 2 == 0 ) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

    }
}
