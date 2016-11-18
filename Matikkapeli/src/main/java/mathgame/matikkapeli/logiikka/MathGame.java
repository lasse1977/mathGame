
package mathgame.matikkapeli.logiikka;

import java.util.HashMap;

public class MathGame {

    public static void main(String[] args) {
        Pelaaja pelaaja = new Pelaaja("Lasse", 1, new HashMap());
        Pelikierros kierros = new Pelikierros(pelaaja);
        kierros.pelaa();
    }
}
