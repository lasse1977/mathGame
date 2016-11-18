/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgame.matikkapeli.logiikka;

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
public class TehtavanArpojaTest {
    TehtavanArpoja arpoja = new TehtavanArpoja(64);
    
    @Test
    public void palauttaaLuvunTasonMukaan() {
        assertTrue(arpoja.haeLuku() >= 0 && arpoja.haeLuku() < 320);
    }
    
    @Test
    public void palauttaaOikeanOperaattorin() {
        assertEquals("+", arpoja.mitaLasketaan());
    }
}
