package p01_zmienne;

public class Zmienne {

	public static void main(String[] args) {
		// Zmienna to jest takie miejsce w pamięci, w którym można coś zapamiętać.
		// Inaczej, niż np. w Pythonie, w Javie zmienną trzeba zadeklarować.
		
		// Deklaracja zmiennych x oraz y o typie int (liczba całkowita):
		int x, y;
		
		// Teraz do zmiennej można wpisać wartość:
		x = 101;
		// można też wartość zmiennej odczytać:
		System.out.println(x);
		
		// W Javie nie można odczytywać zmiennych lokalnych, jeśli nie zostały zainicjowane:
		//ERR System.out.println(y);
		y = 2*x;
		System.out.println(y);

		// Bardzo często w Javie w jednej linii deklaruje się zmienną i od razu wpisuje początkową wartośc:
		int z = x + y - 300;
		System.out.println(z);
		
		// Zmienne mogą się zmieniać:
		z = 505;
		System.out.println(z);
		
		// Istnieją specjalne operatory jak += -= *= /= %= &= ......
		// które powodują zmianę wartości zmiennej:
		x += 20; // x = x + 20, czyli x będzie równy 101 + 20 = 121;
		// Nie mylić z =+ , bo to by znaczyło "do x wpisz liczbę +20"
		System.out.println(x);
		x *= 3;  // x = x * 3, czyli x = 121 * 3 = 363
		System.out.println(x);
		
		// błędem jest wpisanie wartości do zmiennej, która nie istnieje
		//ERR liczba = 1234; // poprawne w Pythonie, niepoprawne w Javie
		
		// ale błędem jest także ponowna deklaracja zmiennej:
		// int x = 999;
		// double x = 3.14;
		
		// gdy chcemy tylko wpisać wartość, to nie powtarza się już typu zmiennej:
		x = 888;
		System.out.println(x);
		
		// do zmiennej jednego typu nie można wpisać wartości innego (niekompaybilnego) typu
		//ERR x = 3.14;
		//ERR x = "Ala ma kota";
		//ERR x = "5432";
		
		// Zmiennych się nie usuwa. Po prostu wychodzimy z danego fragmentu kodu, albo z całego programu i "Java sobie posprząta".
		
	}

}




