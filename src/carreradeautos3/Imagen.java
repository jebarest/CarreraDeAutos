package carreradeautos3;


import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jebarest
 */
public class Imagen extends javax.swing.JPanel {
    private int WIDTH,HEIGHT;
    
    Imagen(int WIDTH, int HEIGHT){
    this.setSize(WIDTH, HEIGHT);
    this.WIDTH=WIDTH;
    this.HEIGHT=HEIGHT;
    
    }
    
    public void paint(Graphics g){
        
        ImageIcon fondo = new ImageIcon("src/Imagenes/tablero.jpg"); 
        g.drawImage(fondo.getImage(), 0, 0, WIDTH, HEIGHT, null);
        setOpaque(false);
        super.paint(g);
    
    }
}
