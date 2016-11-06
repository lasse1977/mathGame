
package mathgame.matikkapeli.logiikka;


public class Tarkastaja {
    private int vastaus;
    private int oikeaVastaus;
    
    public Tarkastaja(int luku1, int luku2) {
        this.vastaus = luku1;
        this.oikeaVastaus = luku2;
    }
    
    public boolean onkoOikein() {
        return vastaus == oikeaVastaus;
    }
        
}
