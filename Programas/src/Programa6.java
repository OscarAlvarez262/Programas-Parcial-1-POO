
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class Programa6 {

    public static void main(String[] args) {
        //substring
        String nombre = "anita lava la tina";
        String nc = "";
        String ca = "";
        nombre = JOptionPane.showInputDialog("Escribe una cadena");
        nombre = nombre.toLowerCase();
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) != ' ') {
                nc += nombre.charAt(i);
            }

        }
        System.out.println(nc);
        for (int i = nc.length() - 1; i >= 0; i--) {
            ca += nc.charAt(i);

        }
        if (ca.endsWith(ca)) {
            JOptionPane.showMessageDialog(null, "Es un palindromo");
        } else {
            JOptionPane.showMessageDialog(null, "No es un palindromo");
        }
    }
}
