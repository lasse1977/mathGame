
package mathgame.matikkapeli.logiikka;

import java.util.Random;

public class LukujenArpoja {
    private int taso;
    
    public LukujenArpoja (int taso) {
        this.taso = taso;
    }
    
    public int haeLuku() {
        String luku = "1";
        for (int i = 0; i <= taso/50; i++) {
            luku = luku + "0";
        }
        return new Random().nextInt(Integer.parseInt(luku));
    }
  
}
