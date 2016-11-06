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
public class LukujenArpojaTest {
    LukujenArpoja arpoja;
    
    @Test
    public void palauttaaLuvunTasonMukaan() {
        arpoja = new LukujenArpoja(160);
        assertTrue(arpoja.haeLuku()<10000);
    }
}
