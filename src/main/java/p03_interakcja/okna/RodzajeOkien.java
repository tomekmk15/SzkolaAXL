package p03_interakcja.okna;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class RodzajeOkien {

	public static void main(String[] args) {
    	JOptionPane.showMessageDialog(null, "To jest zwykły MessageDialog");
    	JOptionPane.showMessageDialog(null, "To jest MessageDialog typu WARNING", "Uwaga", JOptionPane.WARNING_MESSAGE);
    	// są też inne typy: PLAIN_MESSAGE, INFORMATION_MESSAGE, QUESTION_MESSAGE, WARNING_MESSAGE, ERROR_MESSAGE

    	String cos = JOptionPane.showInputDialog("To jest inputDialog.\nNapisz coś:");
    	String data = JOptionPane.showInputDialog("To jest inputDialog z początkową wartością.", LocalDateTime.now());
    	// Rozbudowana wersja showInputDialog pozwala wybrać wartość z rozwijanej listy
    	// Należy przekazać tablicę wartości do wyboru
    	String[] opcje = {"wiosna", "lato", "jesień", "zima"};
    	String poraRoku = (String)JOptionPane.showInputDialog(null, "Którą porę roku lubisz najbardziej?",
    			"Pytanie", JOptionPane.QUESTION_MESSAGE, null, opcje, "jesień");
    	
    	int pora2 = JOptionPane.showOptionDialog(null, "A której pory nie lubisz?",
    			"Pytanie 2", 0, JOptionPane.QUESTION_MESSAGE, null, opcje, "zima");
    	// dostajemy numer wybranej opcji, od 0
    	
    	int wybor = JOptionPane.showConfirmDialog(null, "Czy chcesz " + cos + " o godzinie " + data + "?");
    	switch(wybor) {
	    	case JOptionPane.YES_OPTION ->
	        	JOptionPane.showMessageDialog(null, "TAK");
	    	case JOptionPane.NO_OPTION ->
	        	JOptionPane.showMessageDialog(null, "NO");
	    	case JOptionPane.CANCEL_OPTION ->
	        	JOptionPane.showMessageDialog(null, "Cancel");
	        default ->
	            JOptionPane.showMessageDialog(null, "Inna wartość: " + wybor);
	            // zamknięcie okna daje wynik -1 czyli CLOSED_OPTION
    	}
	}

}
