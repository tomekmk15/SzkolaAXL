package p03_interakcja.skaner;

import java.util.Locale;

public class A_Print {

    public static void main(String[] args) {

        // println wypisuje coś i potem przechodzi do nast. linii
        System.out.println("Wypisuję pierwszą linię");
        System.out.println("Wypisuję drugą linię");

        System.err.println("To jest niby błąd");

        // pusty println - pusta linia
        System.out.println();

        // print - wypisuje coś i nie przechodzi do nowej linii
        System.out.print("Ala");
        System.out.print("Ola");
        System.out.print("Ela");
        System.out.println("Koniec");

        int x = 50;
        String s = "Ala";

        // print, println przyjmują dowolne parametry
        System.out.println(x);

        // ale przyjmują tylko jeden parametr
        //System.out.println("Liczba:", x);

        // Jeśli chcemy wypisać kilka rzeczy, to najczęściej łączy się je znakiem +
        // Do napisu można dodać także inne wartoścu (liczby, obiekty...)
        System.out.println("Liczba: " + x);
        System.out.println();

        // W Javie dostępne jest też printf, prawie takie samo jak w C i podobne jak % w Pythonie.
        // Pierwszym parametrem jest wzorzec (pattern), w którym są normalne fragmenty tekstu oraz znaczniki %X,
        // na które są wstawiane wartości podane później po przecinku.
        // %s - string lub dowolna wartość przekonwertowana na tekst tak, jakbyśmy wypisali ją printem
        // %d - liczba całkowita
        // %f - liczba z ułamkiem
        // %x - liczba szesnastkowo
        System.out.printf("Osoba %s ma %d lat.\n", s, x);
        double pi = Math.PI;
        // Zostaną użyte "lokale" z ustawień systemu, u mnie polskie - liczba wypisuje się z przecinkiem
        System.out.printf("|%10s|%4d|%-4d|%04d|%6.3f|%n", s, x, x, x, pi);

        // Wskazuję lokale amerykańskie - liczba wypisze się z kropką
        System.out.printf(Locale.US, "|%10s|%4d|%-4d|%04d|%6.3f|%n", s, x, x, x, pi);
        System.out.println();

        // Jeśli bardzo potrzebujemy, to na standadowe wyjście można wypisywać też dane binarne.
        System.out.write(65);
        System.out.write(66);
        System.out.write(67);
        System.out.write(10);
    }

}
