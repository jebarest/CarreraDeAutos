/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreradeautos3;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jebarest
 */
public class Auto {
    private JLabel Dodge_Challenger, Ferrari, Nissan_Skyline, Toyota_Supra, Policia;
    
    
    public Auto(JPanel tablero,int cantidad){
        
    ImageIcon Dodge_Challengerimage = new ImageIcon("src/Imagenes/Dodge_Challenger.png");
    ImageIcon Ferrariimage = new ImageIcon("src/Imagenes/Ferrari.png");
    ImageIcon Nissan_Skylineimage = new ImageIcon("src/Imagenes/Nissan_Skyline.png");
    ImageIcon Toyota_Supraimage = new ImageIcon("src/Imagenes/Toyota_Supra.png");
    ImageIcon Policiaimage = new ImageIcon("src/Imagenes/Policia.png");
    
    Dodge_Challenger = new JLabel();
    Ferrari = new JLabel();
    Nissan_Skyline = new JLabel();
    Toyota_Supra = new JLabel();
    Policia = new JLabel();
    
    Policia.setBounds(1040, 30, 50, 100);
    Dodge_Challenger.setBounds(1040, 138, 50, 100);
    Ferrari.setBounds(1045, 248, 50, 100);
    Nissan_Skyline.setBounds(1040, 358, 50, 100);
    Toyota_Supra.setBounds(1040, 468, 50, 100);
    
    Dodge_Challenger.setIcon(Dodge_Challengerimage);
    Ferrari.setIcon(Ferrariimage);
    Nissan_Skyline.setIcon(Nissan_Skylineimage);
    Toyota_Supra.setIcon(Toyota_Supraimage);
    Policia.setIcon(Policiaimage);
    
    tablero.add(Policia);
    
    for (int i = 1; i <=cantidad; i++) {        
            switch (i) {
                case 1:
                    tablero.add(Dodge_Challenger);
                break;
                case 2:
                    tablero.add(Ferrari);
                break;
                case 3:
                    tablero.add(Nissan_Skyline);
                break;
                case 4:
                    tablero.add(Toyota_Supra);
                    
                break;
            }
        }
    
    }
}
