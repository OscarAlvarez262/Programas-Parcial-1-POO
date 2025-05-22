
import javax.swing.JOptionPane;

//tarea: hacer un programa que les una cadena y que mencioné si es un palindromo
/**
 *
 * @author oscar
 */
public class Tarea1 {

    public static void main(String[] args) {
        int Cn = 0;////variable para el contador ciclos hasta la longitud de la palabra
        String pa = JOptionPane.showInputDialog("Escribe una palabra");
        int in = pa.length();//contador inverso que empieza con el valor de la longutud de la palabra
        for (int i = 0; i < pa.length(); i++) {
            if (pa.codePointAt(i) == pa.codePointAt(in)) {
                Cn++;
                in--;
            }
        }

        if (Cn == pa.length() && in == 0) {
            JOptionPane.showMessageDialog(null, "La palabra es un palindromo");
        }

    }

}
