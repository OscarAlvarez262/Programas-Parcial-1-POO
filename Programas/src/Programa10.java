
import javax.swing.JOptionPane;

/*hacer un programa que lea el nombre de una figura geometrica. que puede ser cuadrado,rectangulo, triangulo o circulo, cualquier otro nombre debe de
mostrar error.
un avez identificada la figura, pedira los datos para calcular el area y perimetro de la figura.
 */
/**
 *
 * @author oscar
 */
public class Programa10 {

    public static void main(String[] args) {
        int B = 0, H = 0, R = 0, la = 0, lb = 0, lc = 0;
        double Area = 0.0, Perimetro = 0.0;
        String Figura = (JOptionPane.showInputDialog(null, "Ingresa el nombre de una figura geometrica" + "\n" + "CUADRADO,CIRCULO" + "\n" + "RECTANGULO,TRIANGULO"));
        Figura = Figura.toLowerCase();
        if (Figura.equals("cuadrado")) {
            String Base = (JOptionPane.showInputDialog(null, "Ingresa el tamaño de un lado"));
            B = Integer.parseInt(Base);
            Area = Math.pow(B, 2);
            Perimetro = B * 4;
            JOptionPane.showMessageDialog(null, "Area = " + Area + "\n" + "Perimetro = " + Perimetro);
        } else if (Figura.equals("rectangulo")) {
            String Base = (JOptionPane.showInputDialog(null, "Ingresa el tamaño de la base"));
            B = Integer.parseInt(Base);
            String Altura = (JOptionPane.showInputDialog(null, "Ingresa el tamaño de la altura"));
            H = Integer.parseInt(Altura);
            Area = H * B;
            Perimetro = ((H * 2) + (B * 2));
            JOptionPane.showMessageDialog(null, "Area = " + Area + "\n" + "Perimetro = " + Perimetro);
        } else if (Figura.equals("circulo")) {
            String Radio = (JOptionPane.showInputDialog(null, "Ingresa el radio de la figura"));
            R = Integer.parseInt(Radio);
            Area = (3.1416 * Math.pow(R, 2));
            Perimetro = (3.1416 * R) * 2;
            JOptionPane.showMessageDialog(null, "Area = " + Area + "\n" + "Perimetro = " + Perimetro);
        } else if (Figura.equals("triangulo")) {
            String Base = (JOptionPane.showInputDialog(null, "Ingresa el tamaño de la base"));
            B = Integer.parseInt(Base);
            String Altura = (JOptionPane.showInputDialog(null, "Ingresa el tamaño de la altura"));
            H = Integer.parseInt(Altura);
            String Ladoa = (JOptionPane.showInputDialog(null, "Ingresa el tamaño del lado A"));
            la = Integer.parseInt(Ladoa);
            String Ladob = (JOptionPane.showInputDialog(null, "Ingresa el tamaño del lado B"));
            lb = Integer.parseInt(Ladob);
            String Ladoc = (JOptionPane.showInputDialog(null, "Ingresa el tamaño del lado C"));
            lc = Integer.parseInt(Ladoc);
            Area = (H * B) / 2;
            Perimetro = (la + lb + lc);
            JOptionPane.showMessageDialog(null, "Area = " + Area + "\n" + "Perimetro = " + Perimetro);
        } else {
            JOptionPane.showMessageDialog(null, "Error intenta con otra figura");
        }
    }

}
