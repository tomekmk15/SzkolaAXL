package p02_liczby;

import java.util.Scanner;

public class Mnozenie1_Int {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podaj dwie liczby do pomnożenia: ");
		long x = scanner.nextLong();
		long y = scanner.nextLong();
		
		long wynik = x * y;
		System.out.println("wynik normalnego mnożenia: " + wynik);
		
		// operacje matematyczne pod większą kontrolą (ale działające wolniej):
		try {
			long wynik2 = Math.multiplyExact(x, y);
			System.out.println("wynik exact mnożenia: " + wynik2);
		} catch(ArithmeticException e) {
			System.out.println("wynik nie mieści się w zakresie");
		}
	}

}
