
package mathgame.matikkapeli.logiikka;

import java.util.Scanner;


public class Pelikierros {
    private Scanner lukija;
    private Pelaaja pelaaja;
    private TehtavanArpoja arpoja;
    private int pisteet;
    
    
    public Pelikierros(Pelaaja pelaaja) {
        this.lukija = new Scanner(System.in);
        this.pelaaja = pelaaja;
        this.arpoja = new TehtavanArpoja(pelaaja.getTaso());
        this.pisteet = 0;
    }
    
    public void pelaa() {
        for (int i = 0; i < 10; i++) {
            int luku1 = arpoja.haeLuku();
            int luku2 = arpoja.haeLuku();
            System.out.println("Paljonko on " + arpoja.tehtava(luku1, luku2) + "?");
            int vastaus = Integer.parseInt(lukija.nextLine());
            Tarkastaja tarkastaja = new Tarkastaja(vastaus, arpoja.tehtavanVastaus(luku1, luku2));
            if (tarkastaja.onkoOikein()) {
                pisteet++;
            } else {
                System.out.println("Väärin, oikea vastaus on " + tarkastaja.oikeaVastaus());
            }
        }
        System.out.println("Sait " + pisteet + "/10 pistettä");
        lopetaKierros();
    }
    
    public void lopetaKierros() {
        toString();
        String syote = lukija.nextLine();
        pisteet = 0;
        if (syote.equals("k")) {
            this.arpoja = new TehtavanArpoja(pelaaja.getTaso());
            pelaa();
        }
    }
    
    public int haePisteet() {
        return this.pisteet;
    }
    
    @Override
    public String toString() {
        int tahdet = 0;
        if (pisteet < 5) {
            return "Et läpäissyt tasoa. Yritä uudelleen (k/e)?";
        } else {
            tahdet = (pisteet - 5) / 2 + 1;
            pelaaja.setTaso(pelaaja.getTaso() + 1);
            return "Taso suoritettu" + tahdet + " tähdellä.\nJatketaanko seuraavalle tasolle (k/e)?";
        }
    }
}
