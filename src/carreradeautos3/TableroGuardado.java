/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreradeautos3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author jebarest
 */
public class TableroGuardado extends javax.swing.JFrame implements ActionListener{
final int WIDTH=1250,HEIGHT=700;
private JPanel tablero;
private int cantidad,turno=0,A0Posx,A0Posy,A1Posx,A1Posy,A2Posx,A2Posy,A3Posx,A3Posy,A4Posx,A4Posy;
private String A1Puntos,A2Puntos,A3Puntos,A4Puntos,A5Puntos;
private JLabel pt0,pt1,pt2,pt3,pt4,pt5,pt1n,pt2n,pt3n,pt4n,pt5n,auto0,auto1,auto2,auto3,auto4,posdado1,posdado2;
private static String name1,name2,name3,name4;
private JButton Lanzar,Parar,Guardar,Volver;
private Dados dd;
private MoverAuto MA;
private static JSONObject jobj;
    
    public TableroGuardado(JSONObject jobj) throws JSONException {
        this.jobj=jobj;
        CargarDatos(this.jobj);
        initComponents();
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Tablero");
        this.setLocationRelativeTo(null);
        llenarTablero();
        MA=new MoverAuto();
    }
   
    private void CargarDatos(JSONObject jobj) throws JSONException{
        inicializartodo();
        String a0px;
        String a0py;
        String a1px;
        String a1py;
        String a2px;
        String a2py;
        String a3px;
        String a3py;
        String a4px;
        String a4py;
        String DatoCantidad=jobj.getJSONObject("CantidadDeJugadores").getString("CJ");
        this.cantidad=Integer.parseInt(DatoCantidad);
        System.out.println(cantidad);
        switch (cantidad) {
            case 1:
                
                this.name1=jobj.getJSONObject("auto1").getString("Nombre");
                this.A1Puntos=jobj.getJSONObject("auto0").getString("Puntos");
                this.A2Puntos=jobj.getJSONObject("auto1").getString("Puntos");
                a0px=jobj.getJSONObject("auto0").getString("Posx");
                a0py=jobj.getJSONObject("auto0").getString("Posy");
                a1px=jobj.getJSONObject("auto1").getString("Posx");
                a1py=jobj.getJSONObject("auto1").getString("Posy");
                this.A0Posx=Integer.parseInt(a0px);
                this.A0Posy=Integer.parseInt(a0py);
                this.A1Posx=Integer.parseInt(a1px);
                this.A1Posy=Integer.parseInt(a1py);
                break;
            case 2:
                this.name1=jobj.getJSONObject("auto1").getString("Nombre");
                this.name2=jobj.getJSONObject("auto2").getString("Nombre");
                this.A1Puntos=jobj.getJSONObject("auto0").getString("Puntos");
                this.A2Puntos=jobj.getJSONObject("auto1").getString("Puntos");
                this.A3Puntos=jobj.getJSONObject("auto2").getString("Puntos");
                a0px=jobj.getJSONObject("auto0").getString("Posx");
                a0py=jobj.getJSONObject("auto0").getString("Posy");
                a1px=jobj.getJSONObject("auto1").getString("Posx");
                a1py=jobj.getJSONObject("auto1").getString("Posy");
                a2px=jobj.getJSONObject("auto2").getString("Posx");
                a2py=jobj.getJSONObject("auto2").getString("Posy");
                this.A0Posx=Integer.parseInt(a0px);
                this.A0Posy=Integer.parseInt(a0py);
                this.A1Posx=Integer.parseInt(a1px);
                this.A1Posy=Integer.parseInt(a1py);
                this.A2Posx=Integer.parseInt(a2px);
                this.A2Posy=Integer.parseInt(a2py);
                break;
            case 3:
                this.name1=jobj.getJSONObject("auto1").getString("Nombre");
                this.name2=jobj.getJSONObject("auto2").getString("Nombre");
                this.name3=jobj.getJSONObject("auto3").getString("Nombre");
                this.A1Puntos=jobj.getJSONObject("auto0").getString("Puntos");
                this.A2Puntos=jobj.getJSONObject("auto1").getString("Puntos");
                this.A3Puntos=jobj.getJSONObject("auto2").getString("Puntos");
                this.A4Puntos=jobj.getJSONObject("auto3").getString("Puntos");
                a0px=jobj.getJSONObject("auto0").getString("Posx");
                a0py=jobj.getJSONObject("auto0").getString("Posy");
                a1px=jobj.getJSONObject("auto1").getString("Posx");
                a1py=jobj.getJSONObject("auto1").getString("Posy");
                a2px=jobj.getJSONObject("auto2").getString("Posx");
                a2py=jobj.getJSONObject("auto2").getString("Posy");
                a3px=jobj.getJSONObject("auto3").getString("Posx");
                a3py=jobj.getJSONObject("auto3").getString("Posy");
                this.A0Posx=Integer.parseInt(a0px);
                this.A0Posy=Integer.parseInt(a0py);
                this.A1Posx=Integer.parseInt(a1px);
                this.A1Posy=Integer.parseInt(a1py);
                this.A2Posx=Integer.parseInt(a2px);
                this.A2Posy=Integer.parseInt(a2py);
                this.A3Posx=Integer.parseInt(a3px);
                this.A3Posy=Integer.parseInt(a3py);
                break;
            case 4:
                this.name1=jobj.getJSONObject("auto1").getString("Nombre");
                this.name2=jobj.getJSONObject("auto2").getString("Nombre");
                this.name3=jobj.getJSONObject("auto3").getString("Nombre");
                this.name4=jobj.getJSONObject("auto4").getString("Nombre");
                this.A1Puntos=jobj.getJSONObject("auto0").getString("Puntos");
                this.A2Puntos=jobj.getJSONObject("auto1").getString("Puntos");
                this.A3Puntos=jobj.getJSONObject("auto2").getString("Puntos");
                this.A4Puntos=jobj.getJSONObject("auto3").getString("Puntos");
                this.A5Puntos=jobj.getJSONObject("auto4").getString("Puntos");
                a0px=jobj.getJSONObject("auto0").getString("Posx");
                a0py=jobj.getJSONObject("auto0").getString("Posy");
                a1px=jobj.getJSONObject("auto1").getString("Posx");
                a1py=jobj.getJSONObject("auto1").getString("Posy");
                a2px=jobj.getJSONObject("auto2").getString("Posx");
                a2py=jobj.getJSONObject("auto2").getString("Posy");
                a3px=jobj.getJSONObject("auto3").getString("Posx");
                a3py=jobj.getJSONObject("auto3").getString("Posy");
                a4px=jobj.getJSONObject("auto4").getString("Posx");
                a4py=jobj.getJSONObject("auto4").getString("Posy");
                this.A0Posx=Integer.parseInt(a0px);
                this.A0Posy=Integer.parseInt(a0py);
                this.A1Posx=Integer.parseInt(a1px);
                this.A1Posy=Integer.parseInt(a1py);
                this.A2Posx=Integer.parseInt(a2px);
                this.A2Posy=Integer.parseInt(a2py);
                this.A3Posx=Integer.parseInt(a3px);
                this.A3Posy=Integer.parseInt(a3py);
                this.A4Posx=Integer.parseInt(a4px);
                this.A4Posy=Integer.parseInt(a4py);
        }
    
    }
    public void llenarTablero(){
        tablero=new JPanel();
        tablero.setSize(WIDTH, HEIGHT);
        tablero.setLayout(null);
        
        llenarpista();
        posicionarAutos();
        Score();
        lineas();
        Dados();
        
        fondodeltablero();
        this.getContentPane().add(tablero);
        
    }
    public void llenarpista(){
        int posx=10;
        int posy=38;
        autosentablero();
        puntostablero(posx,posy);
        posx=10;
        posy=38;
        for (int i = 0; i < 5; i++) {
        for (int z = 0; z < 10; z++) {
            ImageIcon image = new ImageIcon("src/Imagenes/Pista.png");
            JLabel pista = new JLabel();
            pista.setBounds(posx, posy, 100, 95);
            Icon icono = new ImageIcon(image.getImage().getScaledInstance(pista.getWidth(), pista.getHeight(), Image.SCALE_DEFAULT));
            pista.setIcon(icono);
            tablero.add(pista);
            posx=posx+100;
            
        }    
            posx=10;
            posy=posy+96;
        }
            
    }
    public void posicionarAutos(){
        Auto au=new Auto(tablero,cantidad);
    }
    public void Score(){
        
    Font fuente=new Font("Monospaced", Font.BOLD, 12);
    pt0= new JLabel("Puntaje",SwingConstants.CENTER);
    pt1= new JLabel(A1Puntos,SwingConstants.CENTER);
    pt2= new JLabel(A2Puntos,SwingConstants.CENTER);
    pt3= new JLabel(A3Puntos,SwingConstants.CENTER);
    pt4= new JLabel(A4Puntos,SwingConstants.CENTER);
    pt5= new JLabel(A5Puntos,SwingConstants.CENTER);
    pt1n= new JLabel("Computador",SwingConstants.CENTER);
    pt2n= new JLabel(name1 ,SwingConstants.CENTER);
    pt3n= new JLabel(name2 ,SwingConstants.CENTER);
    pt4n= new JLabel(name3 ,SwingConstants.CENTER);
    pt5n= new JLabel(name4 ,SwingConstants.CENTER);
    
    pt0.setBounds(1120, 10, 90, 20);
    pt0.setFont(fuente);
    pt0.setForeground(Color.GREEN);
    pt1.setBounds(1120, 70, 90, 20);
    pt1.setFont(fuente);
    pt1.setForeground(Color.GREEN);
    pt2.setBounds(1120, 170, 90, 20);
    pt2.setFont(fuente);
    pt2.setForeground(Color.GREEN);
    pt3.setBounds(1120, 280, 90, 20);
    pt3.setFont(fuente);
    pt3.setForeground(Color.GREEN);
    pt4.setBounds(1120, 390, 90, 20);
    pt4.setFont(fuente);
    pt4.setForeground(Color.GREEN);
    pt5.setBounds(1120, 500, 90, 20);
    pt5.setFont(fuente);
    pt5.setForeground(Color.GREEN);
    pt1n.setBounds(1120, 50, 90, 20);
    pt1n.setFont(fuente);
    pt1n.setForeground(Color.GREEN);
    pt2n.setBounds(1120, 150, 90, 20);
    pt2n.setFont(fuente);
    pt2n.setForeground(Color.GREEN);
    pt3n.setBounds(1120, 260, 90, 20);
    pt3n.setFont(fuente);
    pt3n.setForeground(Color.GREEN);
    pt4n.setBounds(1120, 370, 90, 20);
    pt4n.setFont(fuente);
    pt4n.setForeground(Color.GREEN);
    pt5n.setBounds(1120, 480, 90, 20);
    pt5n.setFont(fuente);
    pt5n.setForeground(Color.GREEN);
    
    tablero.add(pt0);
    tablero.add(pt1n);
    tablero.add(pt1);
    
    for (int i = 1; i <=cantidad; i++) {        
            switch (i) {
                case 1:
                    tablero.add(pt2n);
                    tablero.add(pt2);
                break;
                case 2:
                    tablero.add(pt3n);
                    tablero.add(pt3);
                break;
                case 3:
                    tablero.add(pt4n);
                    tablero.add(pt4);
                break;
                case 4:
                    tablero.add(pt5n);
                    tablero.add(pt5);
                break;
            }
        }

    }
    public void lineas(){
        LineasTablero lt=new LineasTablero();
        tablero.add(lt);
        tablero.repaint();
    }
    public void Dados(){
    botones();
    CrearDados1();
    }
    public void fondodeltablero(){
    Imagen Imagen = new Imagen(WIDTH,HEIGHT);
        tablero.add(Imagen);
        tablero.repaint();
    }
    public void autosentablero(){
        ImageIcon image = new ImageIcon("src/Imagenes/AT/0a.png");
        auto0 = new JLabel();
        auto0.setBounds(A0Posx, A0Posy, 50, 30);
        Icon icono = new ImageIcon(image.getImage().getScaledInstance(auto0.getWidth(), auto0.getHeight(), Image.SCALE_DEFAULT));
        auto0.setIcon(icono);

        ImageIcon image1 = new ImageIcon("src/Imagenes/AT/1a.png");
        auto1 = new JLabel();
        auto1.setBounds(A1Posx, A1Posy, 51, 31);
        Icon icono1 = new ImageIcon(image1.getImage().getScaledInstance(auto1.getWidth(), auto1.getHeight(), Image.SCALE_DEFAULT));
        auto1.setIcon(icono1);
        
        ImageIcon image2 = new ImageIcon("src/Imagenes/AT/2a.png");
        auto2 = new JLabel();
        auto2.setBounds(A2Posx, A2Posy, 52, 32);
        Icon icono2 = new ImageIcon(image2.getImage().getScaledInstance(auto2.getWidth(), auto2.getHeight(), Image.SCALE_DEFAULT));
        auto2.setIcon(icono2);
        
        ImageIcon image3 = new ImageIcon("src/Imagenes/AT/3a.png");
        auto3 = new JLabel();
        auto3.setBounds(A3Posx, A3Posy, 53, 33);
        Icon icono3 = new ImageIcon(image3.getImage().getScaledInstance(auto3.getWidth(), auto3.getHeight(), Image.SCALE_DEFAULT));
        auto3.setIcon(icono3);        
        
        ImageIcon image4 = new ImageIcon("src/Imagenes/AT/4a.png");
        auto4 = new JLabel();
        auto4.setBounds(A4Posx, A4Posy, 54, 34);
        Icon icono4 = new ImageIcon(image4.getImage().getScaledInstance(auto4.getWidth(), auto4.getHeight(), Image.SCALE_DEFAULT));
        auto4.setIcon(icono4);
        
            tablero.add(auto0);
        
        for (int i = 1; i <=cantidad; i++) {        
            switch (i) {
                case 1:
                    tablero.add(auto1);
                break;
                case 2:
                    tablero.add(auto2);
                break;
                case 3:
                    tablero.add(auto3);
                break;
                case 4:
                    tablero.add(auto4);
                break;
            }
        }
        
            
    }
    public void puntostablero(int posx,int posy){
        String dato1=Integer.toString(1);
            JLabel pista23 = new JLabel(dato1);
            pista23.setBounds(posx+40, posy+5, 20, 15);
            pista23.setForeground(Color.WHITE);
            Font fuentes=new Font("Monospaced", Font.BOLD, 13);
            pista23.setFont(fuentes);
            tablero.add(pista23);
            posx=posx+100; 
        
    for (int i = 2; i <= 10; i++) {
            String dato=Integer.toString(i);
            JLabel pista2 = new JLabel(dato);
            pista2.setBounds(posx+40, posy+5, 20, 15);
            pista2.setForeground(Color.GREEN);
            Font fuente=new Font("Monospaced", Font.BOLD, 13);
            pista2.setFont(fuente);
            tablero.add(pista2);
            posx=posx+100;   
        }
        posx=10;
        posy=posy+96;
        for (int l = 20; l >= 11; l--) {
            String dato=Integer.toString(l);
            JLabel pista2 = new JLabel(dato);
            pista2.setBounds(posx+40, posy+5, 20, 15);
            pista2.setForeground(Color.YELLOW);
            Font fuente=new Font("Monospaced", Font.BOLD, 13);
            pista2.setFont(fuente);
            tablero.add(pista2);
            posx=posx+100;
            
        }
        posx=10;
        posy=posy+96;
        for (int i = 21; i <= 30; i++) {
            String dato=Integer.toString(i);
            JLabel pista2 = new JLabel(dato);
            pista2.setBounds(posx+40, posy+5, 20, 15);
            pista2.setForeground(Color.BLUE);
            Font fuente=new Font("Monospaced", Font.BOLD, 13);
            pista2.setFont(fuente);
            tablero.add(pista2);
            posx=posx+100;   
        }
        posx=10;
        posy=posy+96;
        for (int l = 40; l >= 31; l--) {
            String dato=Integer.toString(l);
            JLabel pista2 = new JLabel(dato);
            pista2.setBounds(posx+40, posy+5, 20, 15);
            pista2.setForeground(Color.ORANGE);
            Font fuente=new Font("Monospaced", Font.BOLD, 13);
            pista2.setFont(fuente);
            tablero.add(pista2);
            posx=posx+100;
        }
        posx=10;
        posy=posy+96;
        for (int i = 41; i < 50; i++) {
            String dato=Integer.toString(i);
            JLabel pista2 = new JLabel(dato);
            pista2.setBounds(posx+40, posy+5, 20, 15);
            pista2.setForeground(Color.PINK);
            Font fuente=new Font("Monospaced", Font.BOLD, 13);
            pista2.setFont(fuente);
            tablero.add(pista2);
            posx=posx+100;   
        }
            String dato=Integer.toString(50);
            JLabel pista2 = new JLabel(dato);
            pista2.setBounds(posx+40, posy+5, 20, 15);
            pista2.setForeground(Color.WHITE);
            Font fuente=new Font("Monospaced", Font.BOLD, 13);
            pista2.setFont(fuente);
            tablero.add(pista2);
            posx=posx+100; 
    }
    public void botones(){
        
    Lanzar=new JButton();
    Lanzar.setText("Lanzar");
    Lanzar.setBounds(510, 620, 50, 20);
    Lanzar.setForeground(Color.DARK_GRAY);
    Lanzar.setOpaque(false);
    Lanzar.setBackground(Color.gray);
    Lanzar.addActionListener(this);
    
    Parar=new JButton();
    Parar.setText("Parar");
    Parar.setBounds(590, 620, 50, 20);
    Parar.setForeground(Color.DARK_GRAY);
    Parar.setOpaque(false);
    Parar.setBackground(Color.gray);
    Parar.addActionListener(this);
    
    Guardar=new JButton();
    Guardar.setBounds(290, 550, 70, 70);
    ImageIcon dado1 = new ImageIcon("src/Imagenes/guardar.png");
    Icon icono1 = new ImageIcon(dado1.getImage().getScaledInstance(Guardar.getWidth(), Guardar.getHeight(), Image.SCALE_DEFAULT));
    Guardar.setIcon(icono1);
    Guardar.setBackground(Color.red);
    Guardar.addActionListener(this);
    
    Volver=new JButton();
    Volver.setText("Volver");
    Volver.setBounds(400, 620, 50, 20);
    Volver.setForeground(Color.DARK_GRAY);
    Volver.setOpaque(false);
    Volver.setBackground(Color.gray);
    Volver.addActionListener(this);
    
    tablero.add(Volver);
    tablero.add(Guardar);
    tablero.add(Lanzar);
    tablero.add(Parar);
    
    }
    public void CrearDados1(){
    ImageIcon dado1 = new ImageIcon("src/Imagenes/dado-1.png");
    posdado1=new JLabel();
    posdado1.setBounds(500, 550, 70, 70);
    posdado2=new JLabel();
    posdado2.setBounds(580, 550, 70, 70);
    Icon icono1 = new ImageIcon(dado1.getImage().getScaledInstance(posdado1.getWidth(), posdado1.getHeight(), Image.SCALE_DEFAULT));
    posdado1.setIcon(icono1);
    posdado2.setIcon(icono1);
    
    tablero.add(posdado1);
    tablero.add(posdado2);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==Lanzar){
            String datov=pt1.getText();
            int datosc=Integer.parseInt(datov);
        
            if(datosc < 51){
                ImageIcon dado1= new ImageIcon("src/Imagenes/dadogif.gif");
                Icon icono1 = new ImageIcon(dado1.getImage().getScaledInstance(posdado1.getWidth(), posdado1.getHeight(), Image.SCALE_DEFAULT));
                posdado1.setIcon(icono1);
        
                ImageIcon dado2= new ImageIcon("src/Imagenes/dadogif.gif");
                Icon icono2 = new ImageIcon(dado2.getImage().getScaledInstance(posdado1.getWidth(), posdado1.getHeight(), Image.SCALE_DEFAULT));
                posdado2.setIcon(icono2);
            }
        }
        if(e.getSource()==Parar){
            String dato1=pt1.getText();
            String dato2=pt2.getText();
            String dato3=pt3.getText();
            String dato4=pt4.getText();
            String dato5=pt5.getText();
            int datos1=Integer.parseInt(dato1);
            int datos2=Integer.parseInt(dato2);
            int datos3=Integer.parseInt(dato3);
            int datos4=Integer.parseInt(dato4);
            int datos5=Integer.parseInt(dato5);
            if(datos1 <= 50 ||datos2 <= 50||datos3 <= 50||datos4 <= 50||datos5 <= 50){
                cmoverAutos();
           }
           turnos();
            
        }
        if(e.getSource()==Guardar){
            guardartablero();
        }
        
        if(e.getSource()==Volver){
            Inicio ini=new Inicio();
            ini.setVisible(true);
            this.dispose();
        }
        
    }
    public void cmoverAutos(){
            
            switch(cantidad){
             case 1:
                if(turno==0){ 
                    dd=new Dados(posdado1,posdado2,pt1);
                    moverauto(auto0,pt1,"0");
                }
                if(turno==1){
                    dd=new Dados(posdado1,posdado2,pt2);
                    moverauto(auto1,pt2,"1");
               
                }
             break;
             case 2:
                if(turno==0){
                    dd=new Dados(posdado1,posdado2,pt1);
                    moverauto(auto0,pt1,"0");
                }
                if(turno==1){
                    dd=new Dados(posdado1,posdado2,pt2);
                    moverauto(auto1,pt2,"1");

                }
                if(turno==2){
                    dd=new Dados(posdado1,posdado2,pt3);
                    moverauto(auto2,pt3,"2");
                }
             break;
             case 3:
                if(turno==0){
                    dd=new Dados(posdado1,posdado2,pt1);
                    moverauto(auto0,pt1,"0");
                }
                if(turno==1){
                    dd=new Dados(posdado1,posdado2,pt2);
                    moverauto(auto1,pt2,"1");

                }
                if(turno==2){
                    dd=new Dados(posdado1,posdado2,pt3);
                    moverauto(auto2,pt3,"2");
                }
                if(turno==3){
                    dd=new Dados(posdado1,posdado2,pt4);
                    moverauto(auto3,pt4,"3");
                }
                break;
                case 4:
                if(turno==0){
                    dd=new Dados(posdado1,posdado2,pt1);
                    moverauto(auto0,pt1,"0");
                }
                if(turno==1){
                    dd=new Dados(posdado1,posdado2,pt2);
                    moverauto(auto1,pt2,"1");
                }
                if(turno==2){
                    dd=new Dados(posdado1,posdado2,pt3);
                    moverauto(auto2,pt3,"2");
                }
                if(turno==3){
                    dd=new Dados(posdado1,posdado2,pt4);
                    moverauto(auto3,pt4,"3");
                }
                if(turno==4){
                    dd=new Dados(posdado1,posdado2,pt5);
                    moverauto(auto4,pt5,"4");
                }
           }
            
 }
    public void turnos(){
       
        switch(cantidad){
            case 1:
                if(turno==0){
                turno=turno+1;
                }else{
                turno=0;
                }
                break;
            case 2:
            if(turno==0){
            turno=turno+1;
            }else if(turno==1){
            turno=turno+1;
            }else if(turno==2){
            turno=0;
            }
            break;
            case 3:
            if(turno==0){
            turno=turno+1;
            }else if(turno==1){
            turno=turno+1;
            }else if(turno==2){
            turno=turno+1;
            }else if(turno==3){
            turno=0;
            }
            break;
            case 4:
            if(turno==0){
            turno=turno+1;
            }else if(turno==1){
            turno=turno+1;
            }else if(turno==2){
            turno=turno+1;
            }else if(turno==3){
            turno=turno+1;
            }else if (turno==4){
            turno=0;
            }
        } 
   }
    public void guardartablero(){
       NombreArchivoGTablero na = new NombreArchivoGTablero(auto0, auto1, auto2, auto3, auto4,pt1,pt2,pt3,pt4,pt5,cantidad,name1,name2,name3,name4);
       na.setVisible(true);
} 
    public void moverauto(JLabel autox,JLabel pt,String nomauto){
            String punto=pt.getText();
            int valorpuntos=Integer.parseInt(punto);
            int posx=45;
            int posy=68;
            if(valorpuntos <= 10){
              ImageIcon image = new ImageIcon("src/Imagenes/AT/"+nomauto+"a.png");
            for (int i = 1; i <= valorpuntos ; i++) {
                MA.MoverAuto0(autox, posx, posy, image);
                
                posx=posx+100;
            }
            }
           
            if(valorpuntos>10 && valorpuntos<21){
                posy=164;
                posx=950;
                ImageIcon image = new ImageIcon("src/Imagenes/AT/"+nomauto+"b.png");
            for (int i = 1; i <=(valorpuntos%10); i++) {
                MA.MoverAuto0(autox, posx, posy, image);
                
                posx=posx-100;
            }
            }
            
            if(valorpuntos>20 && valorpuntos<31){
                posx=45;
                posy=260;
              ImageIcon image = new ImageIcon("src/Imagenes/AT/"+nomauto+"a.png");
            for (int i = 1; i <= (valorpuntos%10) ; i++) {
                MA.MoverAuto0(autox, posx, posy, image);
                
                posx=posx+100;
            }
            }
            if(valorpuntos>30 && valorpuntos<41){
                posx=950;
                posy=356;
                ImageIcon image = new ImageIcon("src/Imagenes/AT/"+nomauto+"b.png");
            for (int i = 1; i <=(valorpuntos%10); i++) {
                MA.MoverAuto0(autox, posx, posy, image);
                
                posx=posx-100;
            }
            }
            if(valorpuntos>40 && valorpuntos<51){
                posx=45;
                posy=452;
              ImageIcon image = new ImageIcon("src/Imagenes/AT/"+nomauto+"a.png");
            for (int i = 1; i <= (valorpuntos%10) ; i++) {
                MA.MoverAuto0(autox, posx, posy, image);
                posx=posx+100;
            }
            }
            if(valorpuntos > 50){
                posx=950;
                posy=452;
                ImageIcon image = new ImageIcon("src/Imagenes/AT/"+nomauto+"a.png");
                MA.MoverAuto0(autox, posx, posy, image);
                pt1.setText("50");
            }
            
}   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TableroGuardado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableroGuardado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableroGuardado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroGuardado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TableroGuardado(jobj).setVisible(true);
                } catch (JSONException ex) {
                    Logger.getLogger(TableroGuardado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
 private void inicializartodo(){
    this.A0Posx=0;
    this.A0Posy=0;
    this.A1Posx=0;
    this.A1Posy=0;
    this.A2Posx=0;
    this.A2Posy=0;
    this.A3Posx=0;
    this.A3Posy=0;
    this.A4Posx=0;
    this.A4Posy=0;
    this.A1Puntos="0";
    this.A2Puntos="0";
    this.A3Puntos="0";
    this.A4Puntos="0";
    this.A5Puntos="0";
    this.name1="0";
    this.name2="0";
    this.name3="0";
    this.name4="0";
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
