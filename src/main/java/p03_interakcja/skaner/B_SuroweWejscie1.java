package p03_interakcja.skaner;

import java.io.IOException;

public class B_SuroweWejscie1 {

    public static void main(String[] args) throws IOException {
        // System.in → "standardowe wejście"
        // System.out → "standardowe wyjście"
        // System.err → "wyjście błędów"
        
        System.out.println("Napisz coś:");
        int bajt = System.in.read();
        System.out.println("Wczytana wartość: " + bajt);
        
        // System.in pozwala czytać surowe dane w postaci pojedynczych bajtów lub tablicy bajtów.
        // Jest to niewygodne. Przydałaby nam się operacja czytania całej linii tekstu albo całych słów, albo liczb zapisanych dziesiętnie...

        // W paktyce korzysta się z tego za pośrednictwem klasy Scanner (lub ewentualnie BufferedReader).
    }

}
