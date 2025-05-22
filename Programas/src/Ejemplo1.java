
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class Ejemplo1 {
    public static void main(String[] args)  throws IOException {
     //   JOptionPane.showMessageDialog(null,"Hola mundo",
      //  "Mensaje", JOptionPane.PLAIN_MESSAGE);
        
        
       String nombre= JOptionPane.showInputDialog(null,"¿cual es tu nombre?",
               "Entrada", 
               JOptionPane.QUESTION_MESSAGE);
        
        
        
    }
    
}
