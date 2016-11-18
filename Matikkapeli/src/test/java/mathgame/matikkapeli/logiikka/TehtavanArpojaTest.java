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
    
    
    @Test
    public void palauttaaLuvunTasonMukaanSummaKierroksella() {
        TehtavanArpoja arpoja = new TehtavanArpoja(64);
        assertTrue(arpoja.haeLuku() >= 0 && arpoja.haeLuku() < 320);
    }
    
    @Test
    public void palauttaaLuvunTasonMukaanErotusKierroksella() {
        TehtavanArpoja arpoja = new TehtavanArpoja(54);
        assertTrue(arpoja.haeLuku() >= 0 && arpoja.haeLuku() < 245);
    }
    
    @Test
    public void palauttaaLuvunTasonMukaanTuloKierroksella() {
        TehtavanArpoja arpoja = new TehtavanArpoja(59);
        assertTrue(arpoja.haeLuku() >= 0 && arpoja.haeLuku() < 98);
    }
    @Test
    public void palauttaaOikeanOperaattorin() {
        TehtavanArpoja arpoja = new TehtavanArpoja(18);
        assertEquals("+", arpoja.mitaLasketaan());
        arpoja = new TehtavanArpoja(24);
        assertEquals("-", arpoja.mitaLasketaan());
        arpoja = new TehtavanArpoja(28);
        assertEquals("x", arpoja.mitaLasketaan());
    }
}
