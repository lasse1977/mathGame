
package mathgame.matikkapeli.main;

import javax.swing.SwingUtilities;
import java.util.HashMap;
import mathgame.matikkapeli.logiikka.Pelaaja;
import mathgame.matikkapeli.logiikka.Pelikierros;
import mathgame.matikkapeli.gui.*;

public class MathGame {

    public static void main(String[] args) {
        MatikkapeliGUI peli = new MatikkapeliGUI();
        SwingUtilities.invokeLater(peli);
        
        Pelaaja pelaaja = new Pelaaja("Lasse", 1, new HashMap());
        Pelikierros kierros = new Pelikierros(pelaaja);
        kierros.pelaa();
    }
}
