package p04_if;

import java.util.Random;
import java.util.Scanner;

/* Progam losuje dwie liczby z zakresu od 1 do 10 (później możesz zmienić zakres na większy).
 * Program wypisuje te liczby i zadaje pytaje ile wynosi ich iloczyn (wynik mnożenia).
 * Użytkownik podaje swoją odpowiedź, a program sprawdza czy jest poprawna, czy nie...
 */

public class Zgadywanka1 {

    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(10) + 1;
        int y = random.nextInt(10) + 1;
        // od Javy 17 jest też wersja dla przedziału domkniętego od, do
        // int z = random.nextInt(1, 10);
        
        System.out.println("Ile to jest " + x + " × " + y + " ?");
        Scanner scanner = new Scanner(System.in);
        int odp = scanner.nextInt();
        
        if(odp == x*y) {
            System.out.println("Poprawna odpowiedź");
        } else {
            System.err.println("Błędna odpowiedź");
        }
        System.out.println(x + " × " + y + " = " + x*y);
    }

}
