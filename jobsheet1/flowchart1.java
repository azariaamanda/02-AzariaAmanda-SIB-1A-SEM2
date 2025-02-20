import java.util.Scanner;

public class flowchart1 {
    public static void main(String[] args) {
        int angka = 15;
        for (int i = 1; i <= angka; i++) {
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
