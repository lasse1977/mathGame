/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgame.matikkapeli.logiikka;

import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nielasse
 */
public class PelaajaTest {
    Pelaaja pelaaja;
    
    public PelaajaTest() {
        Map<Integer, Integer> tahtikartta = new HashMap();
        tahtikartta.put(1, 3);
        pelaaja = new Pelaaja("Masa", 1, tahtikartta);
    }
    
    @Test
    public void toStringTulostaaOikein() {
        assertEquals("Masa 3 tähteä tasolla 1.", pelaaja.toString());
    }
    
    @Test
    public void tasonVoiAsettaaManuaalisesti(){
        pelaaja.asetaTaso(8);
        assertEquals(8, pelaaja.haeTaso());
    }
    
}
