
package mathgame.matikkapeli.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TarkastajaTest {
    
    Tarkastaja tarkastaja;
    
    @Before
    public void setUp() {
        tarkastaja = new Tarkastaja(2, 6);
    }
    
    @Test
    public void onkoOikeinToimii() {
        assertFalse(tarkastaja.onkoOikein());
    }
    
}
