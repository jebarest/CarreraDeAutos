/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreradeautos3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author jebarest
 */
public class LineasTablero extends JComponent {
    final int WIDTH=1250,HEIGHT=650;
    
    public LineasTablero(){
        this.setSize(WIDTH, HEIGHT);
    }
    @Override
    public void paintComponent(Graphics g) {
        
            super.paintComponent(g);
            
            g.setColor(Color.WHITE);
            g.fillRect(10, 36, 1000,3);
            g.fillRect(10, 132, 900,3);
            g.fillRect(110, 228, 900,3);
            g.fillRect(10, 324, 900,3);
            g.fillRect(110, 420, 900,3);
            g.fillRect(10, 516, 1000,3);
            g.fillRect(1010, 36, 3, 385);
            g.fillRect(9, 132, 3, 385);
    }
}
