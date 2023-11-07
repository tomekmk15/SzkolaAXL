package p03_interakcja.skaner;

import java.util.Scanner;

/* Użytkownik podaje wymiary pomieszczenia: wysokość i szerokość.
   Program oblicza pole powierzchni oraz obwód.
   (można wykorzystać np. podczas kupowania paneli i listew podłogowych)
 */
public class WymiaryPokoju {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wymiary pomieszczenia");
        System.out.print(" * długość: ");
        int a = sc.nextInt();
        System.out.print(" * szerokość: ");
        int b = sc.nextInt();
        
        int pole = a * b;
        int obwod = 2*a + 2*b;

        System.out.printf("Pole jest równe %d m² a obwód %d mb.\n", pole, obwod);
    }

}
