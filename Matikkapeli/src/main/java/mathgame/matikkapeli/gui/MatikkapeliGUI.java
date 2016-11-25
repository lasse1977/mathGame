
package mathgame.matikkapeli.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;



public class MatikkapeliGUI implements Runnable {
    
    private JFrame kehys;
    
    @Override
    public void run() {
        kehys = new JFrame("MATIKKAPELI");
        kehys.setPreferredSize(new Dimension(600, 500));
        kehys.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        luoPaavalikko(kehys.getContentPane());

        kehys.pack();
        kehys.setVisible(true);
    }
    
    private void luoPaavalikko(Container ulkoasu) {
        ulkoasu.setLayout(new GridLayout(4, 1));
        
        JLabel ylin = new JLabel();
        JLabel otsikko = new JLabel("PÄÄVALIKKO");
        
        ylin.setLayout(new GridLayout(1, 3));
        
        otsikko.setFont(new Font("Garamond", Font.BOLD, 20));
        ulkoasu.add(ylin);
        ylin.add(new JLabel());
        ylin.add(otsikko);
        ylin.add(new JLabel());
        
        ulkoasu.add(new JButton("Uusi pelaaja"));
        ulkoasu.add(new JButton("Palaava pelaaja"));
        ulkoasu.add(new JButton("Lopeta"));
        
        
        
    }
    
    public JFrame getFrame() {
        return kehys;
    }

    
}
