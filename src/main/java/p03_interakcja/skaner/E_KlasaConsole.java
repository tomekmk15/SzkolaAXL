package p03_interakcja.skaner;

import java.io.Console;
import java.util.Arrays;

public class E_KlasaConsole {

    public static void main(String[] args) {
        System.out.println("Początek");

        Console konsola = System.console();
        System.out.println("System.console() = " + konsola);

        if(konsola == null) {
            System.out.println("Brak możliwości utworzenia konsoli.");
            return;
        }

        String wiersz;
        while((wiersz = konsola.readLine("> ")) != null) {
            konsola.printf("Napisałeś %s %n", wiersz);
            if("koniec".equals(wiersz))
                break;
        }

        System.out.println("KONIEC");

        char[] hasło = konsola.readPassword("Podaj tajne hasło: ");
        konsola.printf("Hasło ma długość %d %n", hasło.length);

        // "zamazuję" hasło w pamięci, żeby inne programy nie mogły go odczytać
        Arrays.fill(hasło, 'X');
    }
}
