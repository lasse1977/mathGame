
package mathgame.matikkapeli.logiikka;

import java.util.Random;

/**
 * Luokka arpoo pelattavan tason mukaiset laskutehtävät pelaajalle.
 * Jokaisella tasolla 10 tehtävää, joista saavutetut pisteet vaikuttavat
 * etenemiseen.
 */
public class TehtavanArpoja {
    private int taso;
    
    public TehtavanArpoja(int taso) {
        this.taso = taso;
    }
    
    /**
     * Metodi arpoo laskettavat luvut.
     * 
     * @return  Laskettava luku.
     */
    public int haeLuku() {
        int luku = taso * 5;
        if (mitaLasketaan().equals("-")) {
            luku = (taso - 5) * 5;
        } 
        if (mitaLasketaan().equals("x")) {
            luku = (taso - 10) * 2;
        }
        return new Random().nextInt(luku) + 1;
    }
    
    public String mitaLasketaan() {
        String merkit = "+-x";
        int merkki = 0;
        if (taso % 15 > 5) {
            merkki = 1;
        }
        if (taso % 15 == 0 || taso % 15 > 10) {
            merkki = 2;
        }
        return "" + merkit.charAt(merkki);
    }
    
    public String tehtava(int luku1, int luku2) {
        return " " + luku1 + " " + mitaLasketaan() + " " + luku2;
    }
    
    public int tehtavanVastaus(int luku1, int luku2) {
        int vastaus = luku1 + luku2;
        if (mitaLasketaan().equals("-")) {
            vastaus = luku1 - luku2;
        }
        if (mitaLasketaan().equals("x")) {
            vastaus = luku1 * luku2;
        }
        return vastaus;
    }
  
}
