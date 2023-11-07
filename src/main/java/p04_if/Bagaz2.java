package p04_if;

import java.util.Scanner;

/* W tej wersji:
 * - wszystkie warunki sprawdza są w jednym if, program nie informuje konkretnie dlaczego odrzucił
 * - sprawdzamy warunek "negatywny", czyli piszemy kiedy jest źle; spójnikiem jest ||
 */
public class Bagaz2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj trzy liczby - wymiary walizki w cm:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        if(a > 50 || b > 50 || c > 50 || a*b*c > 50_000) {
            System.out.println("Bagaż za duży");
        } else {
            System.out.println("Bagaż mieści się w wymaganiach");
        }
    }

}
