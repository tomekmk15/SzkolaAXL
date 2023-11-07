package p04_if;

import java.util.Scanner;

/* Program czyta od użytkownika 3 liczby: wymiary walizki w cm
 * i sprawdza czy walizka mieści się w limitach wymiaru.
 * Warunki:
 * - żaden wymiar nie może przekraczać 50 cm
 * - objętość nie może przekraczać 50_000 cm³
 *
 * W tej wersji:
 * - wszystkie warunki sprawdza są w jednym if, program nie informuje konkretnie dlaczego odrzucił
 * - sprawdzamy warunek "pozytywny", czyli piszemy kiedy jest dobrze; spójnikiem jest &&
 */
public class Bagaz1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj trzy liczby - wymiary walizki w cm:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        if(a <= 50 && b <= 50 && c <= 50 && a*b*c <= 50_000) {
            System.out.println("Bagaż mieści się w wymaganiach");
        } else {
            System.out.println("Bagaż za duży");
        }
    }

}
