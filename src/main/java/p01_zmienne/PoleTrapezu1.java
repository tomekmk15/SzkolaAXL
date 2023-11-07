package p01_zmienne;

public class PoleTrapezu1 {

    public static void main(String[] args) {
        // Program oblicza i wypisuje pole trapezu o podstawach 10 i 15, a wysokości 7
        // (a + b) * h / 2
        
        // pierwszy pomysł: wpisujemy konkretne liczby do wzoru i umieszczamy w println
        System.out.println((10 + 15) / 2 * 7); // 84
        // zmiana kolejności zapisu, matematycznie równoważna, w Javie daje inne wynik:
        System.out.println((10 + 15) * 7 / 2); // 87
        // a tak naprawdę powinno wyjść 87.5
        System.out.println((10 + 15) * 7 * 0.5); // 87.5
        
        // Wyjaśnienie: Gdy wartości są typu int, to dzielenie (/) daje wynik obcięty do części całkowitej
        // Jeśli jednak po jednej ze stron operatora (w tym przypadku *) wystepuje wartość z ułamkniem (float albo double)
        // to wtedy wynik też jest tego wypu i zawiera cz. ułamkową.
        
    }

}
