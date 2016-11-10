
package mathgame.matikkapeli.logiikka;

import java.util.Scanner;


public class Pelikierros {
    private Pelaaja pelaaja;
    private LukujenArpoja arpoja;
    
    public Pelikierros(Pelaaja pelaaja) {
        this.pelaaja = pelaaja;
        this.arpoja = new LukujenArpoja(pelaaja.getTaso());
    }
    
    public void pelaa() {
        Scanner lukija = new Scanner(System.in);
        int pisteet = 0;
        for (int i = 0; i < 10; i++) {
            int luku1 = arpoja.haeLuku();
            int luku2 = arpoja.haeLuku();
            System.out.println("Paljonko on " + luku1 + arpoja.mitaLasketaan() + luku2 + "?");
            int vastaus = Integer.parseInt(lukija.nextLine());
            int lasku = luku1 + luku2;
            if (arpoja.mitaLasketaan().equals("-")) {
                lasku = luku1 - luku2;
            }
            if (arpoja.mitaLasketaan().equals("x")) {
                lasku = luku1 * luku2;
            }
            Tarkastaja tarkastaja = new Tarkastaja(vastaus, lasku);
            if (tarkastaja.onkoOikein()) {
                System.out.println("Oikein");
                pisteet++;
            } else {
                System.out.println("Väärin, oikea vastaus on " + tarkastaja.oikeaVastaus());
            }
        }
        System.out.println("Sait " + pisteet + "/10 pistettä.");
    }
}
