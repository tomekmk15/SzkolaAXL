package p04_if;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Losowanie {

	public static void main(String[] args) {
		// tworzymy obiekt Random - "generator liczb pseudolosowych"
		Random random = new Random();
		
		double d = random.nextDouble();
		// liczba z zakresu [0.0 , 1.0)
		System.out.println("double: " + d);

		// losowy int z całego zakresu intów (orientacyjnie od -2mld do +2mld)
		int x = random.nextInt();
		
		// int z zakresu od 0 do limit-1, czyli tu od 0 do 99
		int y = random.nextInt(100);
		
		// int z zakresu od 500 włącznie do 1000 wyłączając, czyli od 500 do 999
		// dostępne od niedawna, od Java 17
		int z = random.nextInt(500, 1000);

		System.out.println(x + " " + y + " " + z);
		
		// alternatywnie, bez tworzenia obiektu Random - każdy wątek ma swojego prywatnego randoma
		// Od Java 7
		int r = ThreadLocalRandom.current().nextInt();
		System.out.println(r);
	}

}
