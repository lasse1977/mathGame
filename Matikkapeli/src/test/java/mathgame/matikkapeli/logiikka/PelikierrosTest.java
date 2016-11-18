/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgame.matikkapeli.logiikka;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PelikierrosTest {
    
    Pelikierros kierros = new Pelikierros(new Pelaaja("Masa", 8, new HashMap()));
    
    @Test
    public void oikeaMaaraPisteita() {
        assertEquals(0, kierros.haePisteet());
    }
    
    @Test
    public void oikeaTulostus() {
        assertEquals("Et läpäissyt tasoa. Yritä uudelleen (k/e)?", kierros.toString());
    }
}
