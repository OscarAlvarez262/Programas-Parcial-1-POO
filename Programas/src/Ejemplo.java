
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/**
 *
 * @author oscar
 */
public class Ejemplo {
    public static void main(String[] args) throws IOException {
        //libreria BuferedReader
        //casting o convension
        int edad;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe una edad");
        edad = Integer.parseInt(JOptionPane.showInputDialog ("Escribe una edad"));
      JOptionPane.showMessageDialog(null,edad);    
    }
}

