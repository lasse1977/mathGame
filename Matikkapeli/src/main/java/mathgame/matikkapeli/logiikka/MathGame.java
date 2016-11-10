
package mathgame.matikkapeli.logiikka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LukujenArpoja arpoja = new LukujenArpoja(222);
        Scanner lukija = new Scanner(System.in);
        int luku1 = arpoja.haeLuku();
        int luku2 = arpoja.haeLuku();
        System.out.println("Paljonko on " + luku1 + " + " + luku2 + "?");
        int vastaus = Integer.parseInt(lukija.nextLine());
        Tarkastaja tarkastaja = new Tarkastaja(vastaus, luku1 + luku2);
        
        if (tarkastaja.onkoOikein()) {
            System.out.println("Jippii");
        } else {
            System.out.println("Sattanan typerys");
        }
    }
    
}
