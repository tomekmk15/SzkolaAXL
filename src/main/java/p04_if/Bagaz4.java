package p04_if;

import java.util.Scanner;

/* W tej wersji:
 * - rozbijamy warunki do oddzielnych if-ów, aby program napisał dlaczego bagaż został odrzucony
 * - program wypisuje tylko pierwszą przyczynę odrzucenia
 * - dzięki sprawdzaniu warunków negatywnych, możemy zastosować schemat else-if
 *   i napisać to na zasadzie: sprawdź czy jest źle z 1. powodu, czy z 2. powodu itd.
 *   a jeśli nie było żadnego problemu, to na samym końcu jest wykonana operacja w przypadku braku błędów
 */

public class Bagaz4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj trzy liczby - wymiary walizki w cm:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double obj = a * b * c;

        if(a > 50) {
            System.out.println("Zbyt duża długość");
        } else if(b > 50) {
            System.out.println("Zbyt duża szerokość");
        } else if(c > 50) {
            System.out.println("Zbyt duża wysokość");
        } else if(obj > 50_000) {
            System.out.println("Zbyt duża objętość");
        } else {
            System.out.println("Bagaż mieści się w wymaganiach");
        }
    }

}
