package p01_zmienne;

import java.time.LocalDateTime;

public class PrzegladTypow {

	public static void main(String[] args) {
		// 8 typów prostych:
		// liczby calkowite: byte, short, int, long
	    // typy różnią się dostępnym zakresem wartości
		byte b = 100;   // 1 bajt, zakres od -128 do +127
		short s = 1000; // 2 bajty, zakres od ok -32k do + 32k
		int i = 23;     // 4 bajty, zakres od - 2mld do + 2mld
		long l = 333;   // liczby 18-19 cyfrowe
		// nie opłaca się używać pojedynczych zmiennch typu bye i short, bo i tak sa w pamięci zaokgrąglane do 4 bajtów
		// dość często używa się typu byte[] "tablica bajtów"
		System.out.println(b * s * i * l);
		
		// 2 typy dla liczb z ułamkiem. liczby "zmiennopozycyjne" / "zmiennoprzecinkowe" (floating point)
		float f = 3.14F;
		double d = 123.456;
		System.out.println(f * d);
		System.out.println();
		
		// char - pojedynczy znak, ale patrząc technicznie, to jest liczba 16-bitowa, która może być kodem znaku
		char c = 'A';
		System.out.println(c);
		System.out.println((int)c); // 65
		System.out.println(c+1); // kodem litery A jest 65
		c++;
		// teraz jednak "przesuwamy znak" o jedną pozycję do przodu
		System.out.println(c);
		
		boolean warunek = true;
		System.out.println(warunek);
		warunek = f < 3;
		System.out.println(warunek);
		// przy okazji dwa sposoby umieszczania egzotycznych znaków w napisach:
		if(warunek) {
			System.out.println("\u03C0 jest małe");
		} else {
			System.out.println("π jest duże");
		}
		System.out.println();
		
		// Typy obiektowe: klasa, interfejs, enum, rekord oraz tablice
		// Sama Java definiuje ich kilka tysięcy, a programiści mogą tworzyć własne
		String napis = "Ala ma kota";
		System.out.println(napis);
		System.out.println(napis.toUpperCase());
		
		LocalDateTime czas = LocalDateTime.now();
		System.out.println(czas);
		System.out.println("Godzina " + czas.getHour() + " minut " + czas.getMinute());
		// itd, jest tego bardzo dużo
	}

}
