/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreradeautos3;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jebarest
 */
public class MoverAuto {
   
    public void  MoverAuto0(JLabel auto0,int posx0,int posy0,ImageIcon image0){
        
        auto0.setBounds(posx0, posy0, 50, 30);
        Icon icono = new ImageIcon(image0.getImage().getScaledInstance(auto0.getWidth(), auto0.getHeight(), Image.SCALE_DEFAULT));
        auto0.setIcon(icono);
    
    }
    public void  MoverAuto1(JLabel auto1,int posx1,int posy1,ImageIcon image1){
        auto1.setBounds(posx1, posy1, 50, 30);
        Icon icono = new ImageIcon(image1.getImage().getScaledInstance(auto1.getWidth(), auto1.getHeight(), Image.SCALE_DEFAULT));
        auto1.setIcon(icono);
    
    }
    public void  MoverAuto2(JLabel auto2,int posx2,int posy2,ImageIcon image2){
        auto2.setBounds(posx2, posy2, 50, 30);
        Icon icono = new ImageIcon(image2.getImage().getScaledInstance(auto2.getWidth(), auto2.getHeight(), Image.SCALE_DEFAULT));
        auto2.setIcon(icono);
    }
    
    public void MoverAuto3(JLabel auto3,int posx3,int posy3,ImageIcon image3){
        auto3.setBounds(posx3, posy3, 50, 30);
        Icon icono = new ImageIcon(image3.getImage().getScaledInstance(auto3.getWidth(), auto3.getHeight(), Image.SCALE_DEFAULT));
        auto3.setIcon(icono);
    
    }
    public void MoverAuto4(JLabel auto4,int posx4,int posy4,ImageIcon image4){
        auto4.setBounds(posx4, posy4, 50, 30);
        Icon icono = new ImageIcon(image4.getImage().getScaledInstance(auto4.getWidth(), auto4.getHeight(), Image.SCALE_DEFAULT));
        auto4.setIcon(icono);
    }
}
