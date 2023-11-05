package p04_if;

import java.util.Scanner;

public class TeoriaIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj liczbę: ");
		int liczba = scanner.nextInt();
		
		System.out.println("Wczytana liczba: " + liczba);
		
		if(liczba < 10) {
			System.out.println("liczba mniejsza niż 10");
			System.out.println("czyli jednocyfrowa (albo ujemna)");
		} else {
			System.out.println("liczba nie była malutka");
		}
		
		// Jeśli za if-em lub else-em do wykonania jest tylko jedna instrukcja,
		// to teoretycznie nie trzeba brać jej w nawiasy klamrowe
		if(liczba % 2 == 0)
			System.out.println("liczba jest parzysta");
		else
			System.out.println("liczba jest nieparzysta");
		
		// Ale ze względu na czytelność kodu oraz perspektywę dalszej modyfikacji
		// lepiej od początku stosować nawiasy klamrowe.
		
		// Za instrukcjami strukturalnymi (if, switch, while, for) w praktyce nie stawia się średnika ;
		
		// if może istnieć bez części else.
		// Wtedy: jeśli warunek prawdziwy: wykonujemy instrukcje z podanego bloku
		// jeśli nieprawdziwy - to ich nie wykonujemy (program idzie dalej)
		
		if(liczba == 21) {
			System.out.println("BINGO!");
			System.out.println("To jest dokładnie 21");
		}
		
		System.out.println("To się zawsze wypisze");
		
		// Jeśli do rozpatrzenia mam więcej niż 2 sytuacje, to typowy zapis jest taki:
		if(liczba > 0) {
			System.out.println("Liczba dodatnia");
		} else if(liczba < 0) {
			System.out.println("Liczba ujemna");
		} else {
			System.out.println("Równa zero");
		}
		
		// W Javie, inaczej niż w C, nie można do ifa przekazywać liczb.
		// Ani, inaczej niż w Pythonie, napisów, list itp rzeczy. W Javie tylko boolean.
//		if(liczba) {
//			System.out.println("nie zero");
//		} else {
//			System.out.println("zero");
//		}

		System.out.println("Koniec programu");
	}

}
