package p03_interakcja.skaner;

import java.util.Scanner;

public class C_Skaner1 {

    public static void main(String[] args) {
        // Scanner to jest obiekt, który pobiera dane ze wskazanego źródła i na żądanie zwraca kolejne elementy
        // kórymi mogą być: całe linie, pojedyncze słowa, liczby, ...
        
        // Deklarujemy zmienną scanner typu Scanner i wpisujemy do niej nowy obiekt klasy Scanner.
        // Ten obiekt skanera będzie czytał dane ze standardowego wejścia.
        Scanner scanner = new Scanner(System.in);
        
        // Typowa interakcja z użytkownikiem: za pomocą print zadajemy pytania,
        // a poprzez skaner wczytujemy odpowiedź.
        
        System.out.println("Wpisz linię tekstu:");
        String linia = scanner.nextLine();
        System.out.println("Napisałeś: " + linia);
        
        // Scanner potrafi bezpośrednio (bez żadnego parseInt itp) wczytywać liczby
        System.out.print("Podaj dwie liczby: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(x + " razy " + y + " = " + x*y);
        System.out.printf("%d razy %d = %d\n", x, y, x*y);
        
        System.out.println("Wpisz liczbę z przecinkiem (!):");
        double d = scanner.nextDouble();

        System.out.println("Liczby: " +x + " , " + d);

        System.out.print("Wpisz dwa słowa: ");
        String slowo1 = scanner.next();
        String slowo2 = scanner.next();

        System.out.println("Pierwsze: " + slowo1);
        System.out.println("Drugie  : " + slowo2);

        // Gdy teraz wczytam "linię" co tam będzie? Reszta linii wpisana za tymi ↑ dwoma słowami
        linia = scanner.nextLine();
        System.out.println("Linia zawiera: " + linia);

        System.out.println("KONIEC");

        // Teoretycznie Scanner jest zasobem i należałoby go zamknąć,
        // ale w praktyce, jeśli chodzi o System.in, to niezamknięcie nie jest błędem; nic złego by się nie stało.
        scanner.close();
    }

}
