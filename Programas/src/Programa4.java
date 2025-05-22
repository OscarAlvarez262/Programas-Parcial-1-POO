
import javax.swing.JOptionPane;

// HACER UN PROGRAMA QUE LEA UN DATO MEDIANTE UNA VARIABLE STRING, EL PROGRAMA MOSTRARA SI EL DATO TIENE LETRAS,
//NUMEROS O LETRAS Y NUMEROS MEDIANTE UN MENSAJE EN PANTALLA
//NOTA: LA LECTURA SE UTILIZA LA LIBRARIA JOPTIONPANE
/**
 *
 * @author oscar
 */
public class Programa4 {

    public static void main(String[] args) {
        //letras,numeros, letras y numeros

        int Cl = 0;
        int Cn = 0;
        int Cln = 0;
        String valor = JOptionPane.showInputDialog("Escribe un dato");

        for (int i = 0; i < valor.length(); i++) {

            if (valor.codePointAt(i) >= 48 && valor.codePointAt(i) <= 57) {
                Cn++;
            }
            if (valor.codePointAt(i) >= 65 && valor.codePointAt(i) <= 90) {
                Cl++;
            }
            if (valor.codePointAt(i) >= 97 && valor.codePointAt(i) <= 122) {
                Cl++;
            }
        }
        if (Cn == valor.length()) {
            JOptionPane.showMessageDialog(null, "son numeros");
        }
        if (Cl == valor.length()) {
            JOptionPane.showMessageDialog(null, "son letras");

        }
        if (Cn > 0 && Cl > 0) {
            JOptionPane.showMessageDialog(null, "son numeros y letras");
        }
    }
}
