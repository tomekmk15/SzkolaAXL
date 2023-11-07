package p01_zmienne;

public class BlokiTekstowe {

    public static void main(String[] args) {
        // Od początku języka Java było tak, że "napis" musiał kończyć się w tej samej linii, co jest ropoczęty
        // "długie teksty czasami zapisywało się tak:
        
        String napis1 = "Ala ma kota\n"
                + "Ola ma psa"
                + " ale nie ma kota";
        System.out.println(napis1);
        System.out.println();
        
        // Od Javy 17 w programach Javy można umieszczać bloki tesktowe podobnie jak w Pythonie.
        String napis2 = """
                Ala ma kota.
                Ola ma psa, hahaha.
                    Ta linia ma wcięcie.
                A ta już nie ma.
                """;
        System.out.println(napis2);

        // Inaczej niż w Pythonie, w Javie po trzech cudzysłowach trzeba przejść do nast linii.
        // Wcięcie w pierwszej linii bloku jest uznawane za poziom 0 i jest ignorowane w Stringu.
        // Dodatkowe spacje powodują pojawienie się wcięć.
        // Wewnątrz takich bloków można swobodnie używać pojedynczych "cudzyłowów", ale nie trzech :)
    }

}
