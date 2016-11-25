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
    
    TehtavanArpoja arpoja;
    
    @Test
    public void palauttaaLuvunTasonMukaanSummaKierroksella() {
        arpoja = new TehtavanArpoja(64);
        for (int i = 0; i < 10; i++) {
            int luku = arpoja.haeLuku();
            assertTrue(luku > 0 && luku <= 320);
        }
    }
    
    @Test
    public void palauttaaLuvunTasonMukaanErotusKierroksella() {
        arpoja = new TehtavanArpoja(54);
        for (int i = 0; i < 10; i++) {
            int luku = arpoja.haeLuku();
            assertTrue(luku > 0 && luku <= 245);
        }
    }
    
    @Test
    public void palauttaaLuvunTasonMukaanTuloKierroksella() {
        arpoja = new TehtavanArpoja(59);
        for (int i = 0; i < 10; i++) {
            int luku = arpoja.haeLuku();
            assertTrue(luku > 0 && luku <= 98);
        }
    }
    
    @Test
    public void palauttaaOikeanOperaattorin() {
        arpoja = new TehtavanArpoja(1);
        for (int i = 0; i < 5; i++) {
            assertEquals("+", arpoja.mitaLasketaan());
        }
        arpoja = new TehtavanArpoja(6);
        for (int i = 6; i < 11; i++) {
            assertEquals("-", arpoja.mitaLasketaan());
        }
        arpoja = new TehtavanArpoja(11);
        for (int i = 11; i < 16; i++) {
            assertEquals("x", arpoja.mitaLasketaan());
        }
    }
    
    @Test
    public void oikeaVastaus() {
        arpoja = new TehtavanArpoja(28);
        assertEquals(12, arpoja.tehtavanVastaus(3, 4));
        arpoja = new TehtavanArpoja(6);
        assertEquals(-1, arpoja.tehtavanVastaus(3, 4));
        arpoja = new TehtavanArpoja(4);
        assertEquals(7, arpoja.tehtavanVastaus(3, 4));
    }
    
    @Test
    public void tehtavananto() {
        arpoja = new TehtavanArpoja(15);
        assertEquals(" 2 x 6", arpoja.tehtava(2, 6));
    }
    
}
