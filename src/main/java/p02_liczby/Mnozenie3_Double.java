package p02_liczby;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Mnozenie3_Double {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		
		System.out.println("Podaj dwie liczby do pomnożenia: ");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		double wynik = x * y;
		System.out.println("wynik mnożenia: " + wynik);
		
		BigDecimal x_dokladny = new BigDecimal(x);
		BigDecimal y_dokladny = new BigDecimal(y);
		BigDecimal w_dokladny = new BigDecimal(wynik);
		System.out.println("\nDokładnie w pamięci komputera");
		System.out.println("x = " + x_dokladny);
		System.out.println("y = " + y_dokladny);
		System.out.println("w = " + w_dokladny);
	}

}
