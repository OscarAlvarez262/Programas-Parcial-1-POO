
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class Programa9 {

    public static void main(String[] args) {
        double a, b, c;
        double x1 = 0.0, x2 = 0.0, a2 = 0.0;
        double b2 = 0.0, m4ac = 0.0, r = 0.0, Raiz = 0.0;
        char Pregunta = 's';
        while (Pregunta == 's') {
            a = Double.parseDouble(JOptionPane.showInputDialog("Escribe el valor de A"));
            b = Double.parseDouble(JOptionPane.showInputDialog("Escribe el valor de B"));
            c = Double.parseDouble(JOptionPane.showInputDialog("Escribe el valor de C"));

            if (Math.pow(b, 2) > (4 * a * c)) {
                b2 = Math.pow(b, 2);
                m4ac = 4 * a * c;
                r = b2 - m4ac;
                Raiz = Math.sqrt(r);
                a2 = 2 * a;
                x1 = ((-b) + Raiz) / a2;
                x2 = ((-b) - Raiz) / a2;
                JOptionPane.showMessageDialog(null, x1 + "\n" + x2);
            } else {
                JOptionPane.showMessageDialog(null, "ERROR no se puede hacer esta operacion");

            }

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres volver a correr",
                    "confirmacion", JOptionPane.YES_NO_CANCEL_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                Pregunta = 's';
            } else if (respuesta == JOptionPane.NO_OPTION) {
                Pregunta = 'n';
            } else {
                break;
            }
        }
    }
}
