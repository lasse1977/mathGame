
package mathgame.matikkapeli.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TarkastajaTest {
    
    Tarkastaja tarkastaja;
    
    @Test
    public void vaarinToimii() {
        tarkastaja = new Tarkastaja(2, 6);
        assertFalse(tarkastaja.onkoOikein());
    }
    
    @Test
    public void oikeinToimii() {
        tarkastaja = new Tarkastaja(6, 6);
        assertTrue(tarkastaja.onkoOikein());        
    }
    
    @Test
    public void oikeaVastausOnOikein() {
        tarkastaja = new Tarkastaja(15, 25);
        assertEquals(25, tarkastaja.oikeaVastaus());
    }
    
}
