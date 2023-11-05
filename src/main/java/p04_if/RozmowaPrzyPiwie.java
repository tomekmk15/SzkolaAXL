package p04_if;

import javax.swing.JOptionPane;

public class RozmowaPrzyPiwie {

    public static void main(String[] args) {
        String imie = JOptionPane.showInputDialog("Jak masz na imię?");
        int wiek = Integer.parseInt(JOptionPane.showInputDialog("Ile masz lat, " + imie + "?"));
        
        if(wiek >= 18) {
            JOptionPane.showMessageDialog(null, "To chodź na piwo");
        } else {
            JOptionPane.showMessageDialog(null, "Nie możesz jeszcze pić alkoholu");
            JOptionPane.showMessageDialog(null, "18 lat będziesz mieć za lat " + (18 - wiek));
        }
        JOptionPane.showMessageDialog(null, "Bajo jajo!");
    }

}
