/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreradeautos3;





import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import org.json.*;
/**
 *
 * @author jebarest
 */
public class GuardarTablero {
    
    public void gtablero1(JLabel auto0,JLabel auto1,JLabel PuntosA0,JLabel PuntosA1,String Nombre,String name1) throws JSONException{
        
        String NombreArchivo=Nombre;
        
        JSONObject tablero=new JSONObject();
        JSONObject auto0n=new JSONObject();
        JSONObject auto1n=new JSONObject();
        JSONObject CantidadDeJugadores=new JSONObject();
        JSONObject Reglas=new JSONObject();
        
        auto0n.put("Nombre", "Auto0");
        auto0n.put("Posx", auto0.getX());
        auto0n.put("Posy", auto0.getY());
        auto0n.put("Height", auto0.getHeight());
        auto0n.put("Width", auto0.getWidth());
        auto0n.put("Puntos", PuntosA0.getText());
        
        auto1n.put("Nombre", name1);
        auto1n.put("Posx", auto1.getX());
        auto1n.put("Posy", auto1.getY());
        auto1n.put("Height", auto1.getHeight());
        auto1n.put("Width", auto1.getWidth());
        auto1n.put("Puntos", PuntosA1.getText());
        
        CantidadDeJugadores.put("CJ", "1");
        
        tablero.put("CantidadDeJugadores", CantidadDeJugadores);
        //tablero.put("Reglas", Reglas);
        tablero.put("auto0", auto0n);
        tablero.put("auto1", auto1n);
        
         FileWriter file;
        try {
            file = new FileWriter(NombreArchivo+".json");
            file.write(tablero.toString());
            file.close();
            
            System.out.println(Nombre + "fin");
        } catch (IOException ex) {
            Logger.getLogger(GuardarTablero.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    public void gtablero2(JLabel auto0,JLabel auto1,JLabel auto2,JLabel PuntosA0,JLabel PuntosA1,JLabel PuntosA2,String Nombre,String name1,String name2) throws JSONException{
        
        String NombreArchivo=Nombre;
        
        
        JSONObject tablero=new JSONObject();
        JSONObject auto0n=new JSONObject();
        JSONObject auto1n=new JSONObject();
        JSONObject auto2n=new JSONObject();
        JSONObject CantidadDeJugadores=new JSONObject();
        JSONObject Reglas=new JSONObject();
        
        auto0n.put("Nombre", "Auto0");
        auto0n.put("Posx", auto0.getX());
        auto0n.put("Posy", auto0.getY());
        auto0n.put("Height", auto0.getHeight());
        auto0n.put("Width", auto0.getWidth());
        auto0n.put("Puntos", PuntosA0.getText());
        
        auto1n.put("Nombre", name1);
        auto1n.put("Posx", auto1.getX());
        auto1n.put("Posy", auto1.getY());
        auto1n.put("Height", auto1.getHeight());
        auto1n.put("Width", auto1.getWidth());
        auto1n.put("Puntos", PuntosA1.getText());
        
        auto2n.put("Nombre", name2);
        auto2n.put("Posx", auto2.getX());
        auto2n.put("Posy", auto2.getY());
        auto2n.put("Height", auto2.getHeight());
        auto2n.put("Width", auto2.getWidth());
        auto2n.put("Puntos", PuntosA2.getText());
        
        CantidadDeJugadores.put("CJ", "2");
        
        tablero.put("CantidadDeJugadores", CantidadDeJugadores);
        //tablero.put("Reglas", Reglas);
        tablero.put("auto0", auto0n);
        tablero.put("auto1", auto1n);
        tablero.put("auto2", auto2n);
        
        FileWriter file;
        try {
            file = new FileWriter(NombreArchivo+".json");
            file.write(tablero.toString());
            file.close();
            
        } catch (IOException ex) {
            Logger.getLogger(GuardarTablero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void gtablero3(JLabel auto0,JLabel auto1,JLabel auto2,JLabel auto3,JLabel PuntosA0,JLabel PuntosA1,JLabel PuntosA2,
            JLabel PuntosA3,String Nombre,String name1,String name2,String name3) throws JSONException{
        FileWriter file=null;
        try {
        
        String NombreArchivo=Nombre;
        
            
            JSONObject tablero=new JSONObject();
            JSONObject auto0n=new JSONObject();
            JSONObject auto1n=new JSONObject();
            JSONObject auto2n=new JSONObject();
            JSONObject auto3n=new JSONObject();
            JSONObject CantidadDeJugadores=new JSONObject();
            JSONObject Reglas=new JSONObject();
            
            auto0n.put("Nombre", "Auto0");
            auto0n.put("Posx", auto0.getX());
            auto0n.put("Posy", auto0.getY());
            auto0n.put("Height", auto0.getHeight());
            auto0n.put("Width", auto0.getWidth());
            auto0n.put("Puntos", PuntosA0.getText());
            
            auto1n.put("Nombre", name1);
            auto1n.put("Posx", auto1.getX());
            auto1n.put("Posy", auto1.getY());
            auto1n.put("Height", auto1.getHeight());
            auto1n.put("Width", auto1.getWidth());
            auto1n.put("Puntos", PuntosA1.getText());
            
            auto2n.put("Nombre", name2);
            auto2n.put("Posx", auto2.getX());
            auto2n.put("Posy", auto2.getY());
            auto2n.put("Height", auto2.getHeight());
            auto2n.put("Width", auto2.getWidth());
            auto2n.put("Puntos", PuntosA2.getText());
            
            auto3n.put("Nombre", name3);
            auto3n.put("Posx", auto3.getX());
            auto3n.put("Posy", auto3.getY());
            auto3n.put("Height", auto3.getHeight());
            auto3n.put("Width", auto3.getWidth());
            auto3n.put("Puntos", PuntosA3.getText());
            
            CantidadDeJugadores.put("CJ", "3");
        
            tablero.put("CantidadDeJugadores", CantidadDeJugadores);
            //tablero.put("Reglas", Reglas);
            tablero.put("auto0", auto0n);
            tablero.put("auto1", auto1n);
            tablero.put("auto2", auto2n);
            tablero.put("auto3", auto3n);
            
            
            
            
            file = new FileWriter(NombreArchivo+".json");
            file.write(tablero.toString());
        } catch (IOException ex) {
            Logger.getLogger(GuardarTablero.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(GuardarTablero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void gtablero4(JLabel auto0,JLabel auto1,JLabel auto2,JLabel auto3,JLabel auto4,JLabel PuntosA0,JLabel PuntosA1,
            JLabel PuntosA2,JLabel PuntosA3,JLabel PuntosA4,String Nombre,String name1,String name2,String name3,String name4) throws JSONException{
        
        String NombreArchivo=Nombre;
        
        
        JSONObject tablero=new JSONObject();
        JSONObject auto0n=new JSONObject();
        JSONObject auto1n=new JSONObject();
        JSONObject auto2n=new JSONObject();
        JSONObject auto3n=new JSONObject();
        JSONObject auto4n=new JSONObject();
        JSONObject CantidadDeJugadores=new JSONObject();
        JSONObject Reglas=new JSONObject();
        
        auto0n.put("Nombre", "Auto0");
        auto0n.put("Posx", auto0.getX());
        auto0n.put("Posy", auto0.getY());
        auto0n.put("Height", auto0.getHeight());
        auto0n.put("Width", auto0.getWidth());
        auto0n.put("Puntos", PuntosA0.getText());
        
        auto1n.put("Nombre", name1);
        auto1n.put("Posx", auto1.getX());
        auto1n.put("Posy", auto1.getY());
        auto1n.put("Height", auto1.getHeight());
        auto1n.put("Width", auto1.getWidth());
        auto1n.put("Puntos", PuntosA1.getText());
        
        auto2n.put("Nombre", name2);
        auto2n.put("Posx", auto2.getX());
        auto2n.put("Posy", auto2.getY());
        auto2n.put("Height", auto2.getHeight());
        auto2n.put("Width", auto2.getWidth());
        auto2n.put("Puntos", PuntosA2.getText());
        
        auto3n.put("Nombre", name3);
        auto3n.put("Posx", auto3.getX());
        auto3n.put("Posy", auto3.getY());
        auto3n.put("Height", auto3.getHeight());
        auto3n.put("Width", auto3.getWidth());
        auto3n.put("Puntos", PuntosA3.getText());
        
        auto4n.put("Nombre", name4);
        auto4n.put("Posx", auto4.getX());
        auto4n.put("Posy", auto4.getY());
        auto4n.put("Height", auto4.getHeight());
        auto4n.put("Width", auto4.getWidth());
        auto4n.put("Puntos", PuntosA4.getText());
        
        CantidadDeJugadores.put("CJ", "4");
        
        tablero.put("CantidadDeJugadores", CantidadDeJugadores);
        //tablero.put("Reglas", Reglas);
        tablero.put("auto0", auto0n);
        tablero.put("auto1", auto1n);
        tablero.put("auto2", auto2n);
        tablero.put("auto3", auto3n);
        tablero.put("auto4", auto4n);
        
         FileWriter file;
        try {
            
            file = new FileWriter(NombreArchivo+".json");
            file.write(tablero.toString());
            file.close();
            
        } catch (IOException ex) {
            Logger.getLogger(GuardarTablero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
