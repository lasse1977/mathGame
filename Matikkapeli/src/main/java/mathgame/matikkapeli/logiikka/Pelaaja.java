
package mathgame.matikkapeli.logiikka;

import java.util.Map;
import java.util.HashMap;


public class Pelaaja {
    private String nimimerkki;
    private int taso;
    private Map<Integer, Integer> tahtia;
    
    public Pelaaja(String nimi, int taso, Map<Integer, Integer> tahtia) {
        this.nimimerkki = nimi;
        this.taso = taso;
        this.tahtia = tahtia;
    }

    public int getTaso() {
        return taso;
    }
    
    public void setTaso(int uusiTaso) {
        this.taso = uusiTaso;
    }

    @Override
    public String toString() {
        return nimimerkki + " " + tahtia.get(taso) + " tähteä tasolla " + taso + ".";
    }
    
    
}
