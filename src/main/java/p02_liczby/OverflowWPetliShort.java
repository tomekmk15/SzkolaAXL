package p02_liczby;

public class OverflowWPetliShort {

	public static void main(String[] args) {
		// przy okazji: pętla nieskończona to nie tylko while(true), ale też for(;;)
		short x = 0;
		for(;;) {
			System.out.println(x++);
		}

	}

}
