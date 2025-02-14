import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("================ KODE PLAT MOBIL INDONESIA ================");
        char [] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        System.out.print("Masukkan kode plat nomor (A, B, D, E, F, G, H, L, N, T): ");
        char inputKODE = sc2.next().charAt(0);

        boolean ditemukan = false;
        for(int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKODE) {
                ditemukan = true;
                System.out.print("Kota dari kode plat tersebut adalah kota: ");
                for (char abjad : KOTA[i]) {
                    System.out.print(abjad);
                }
                System.out.println();
                break;
            }
        }

        if (!ditemukan){
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
