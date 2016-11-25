/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgame.matikkapeli.logiikka;

import java.util.Scanner;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PelikierrosTest {
    Pelaaja pelaaja = new Pelaaja("Masa", 8, new HashMap());
    Pelikierros kierros = new Pelikierros(pelaaja);
    
    @Test
    public void oikeaMaaraPisteita() {
        assertEquals(0, kierros.haePisteet());
    }
    
    @Test
    public void tahdetOikein() {
        assertEquals("Masa : 0 tähteä", kierros.toString());
        kierros = new Pelikierros(new Pelaaja("Kake", 10, new HashMap()));
        assertEquals("Kake : 0 tähteä", kierros.toString());
    }
}
