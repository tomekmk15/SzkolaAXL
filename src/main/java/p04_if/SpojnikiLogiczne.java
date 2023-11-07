package p04_if;

import java.util.Random;

public class SpojnikiLogiczne {

	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt(20);
		int y = random.nextInt(20);
		System.out.println("x = " + x + " , y = " + y);
		
		// && - koniunkcja, "i", "and"
		// warunek jest prawdziwy tylko gdy obie części są prawdziwe
		if(x >= 10 && y >= 10) {
			System.out.println("AAA obie liczby są dwucyfrowe");
		} else {
			System.out.println("BBB nieprawda, że obie na raz są dwucyfrowe");			
		}
		
		// || - alternatywa, "lub", "or"
		// warunek jest prawdziwy gdy co najmniej jedna część jest prawdziwa
		if(x >= 10 || y >= 10) {
			System.out.println("CCC któraś z liczb jest dwucyfrowa");
		} else {
			System.out.println("DDD obie liczby są jednocyfrowe");			
		}
		
		// Istnieje też ^ - to jest alternatywa rozłączna, tzw. "xor",
		// Jest prawdą, gdy dokładnie jedna z części jest prawdą.
		// Inaczej mówiąc ^ sprawdza czy warunki składowe dają różne wyniki.
		// W praktyce nieużywane
		if(x >= 10 ^ y >= 10) {
			System.out.println("EEE tylko jedna z liczb jest dwucyfrowa");
		} else {
			System.out.println("FFF warunki są jednakowe dla obu liczb");
		}
	}

}
