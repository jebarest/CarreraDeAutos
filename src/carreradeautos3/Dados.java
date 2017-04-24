/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreradeautos3;

import java.awt.Image;
import javax.swing.*;


public class Dados{
    int ram1,ram2;
    
    public Dados(JLabel posdado1,JLabel posdado2,JLabel puntos){
        
        ram1=(int)(Math.random()*6+1);
        ram2=(int)(Math.random()*6+1);
        ImageIcon dado1 = new ImageIcon("src/Imagenes/dado-"+ram1+".png");
        Icon icono1 = new ImageIcon(dado1.getImage().getScaledInstance(posdado1.getWidth(), posdado1.getHeight(), Image.SCALE_DEFAULT));
        posdado1.setIcon(icono1);
        ImageIcon dado2 = new ImageIcon("src/Imagenes/dado-"+ram2+".png");
        Icon icono2 = new ImageIcon(dado2.getImage().getScaledInstance(posdado1.getWidth(), posdado1.getHeight(), Image.SCALE_DEFAULT));
        posdado2.setIcon(icono2);
        String punto=puntos.getText();
        int valorpuntos=Integer.parseInt(punto);
        int suma=ram1+ram2+valorpuntos;
        String dato=Integer.toString(suma);
        puntos.setText(dato);
        
    }  
    
}
