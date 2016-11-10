
package mathgame.matikkapeli.logiikka;

import java.util.Random;

public class LukujenArpoja {
    private int taso;
    
    public LukujenArpoja(int taso) {
        this.taso = taso;
    }
    
    public int haeLuku() {
        int luku = taso * 5;
        if (mitaLasketaan().equals("-")) {
            luku = (taso - 5) * 5;
        } 
        if (mitaLasketaan().equals("x")) {
            luku = (taso - 10) * 2;
        }
        return new Random().nextInt(luku);
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
  
}
