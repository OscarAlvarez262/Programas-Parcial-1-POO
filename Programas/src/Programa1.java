//HACER UN PROGRAMA QUE PIDA O LEA UN NUMERO MEDIANTE LAS VENTANAS DE JOPTION PANE, 
//CONVIERTA ESE NUMERO A ENTERO Y MUESTRE MEDIANTE OTRA VENTANA SU TABLA DE MULTIPLICAR, 
//PERO HASTA LA MULTIPLICACION DEL 1 AL 5.
import javax.swing.JOptionPane;
/**
 *
 * @author oscar
 */
public class Programa1 {
    public static void main(String[] args) {
        String N1;
        int R=0;
        N1 = JOptionPane.showInputDialog("Escribe un numero");
        R = Integer.parseInt(N1);
       
       JOptionPane.showMessageDialog (null, "1 * "+N1 +" = " +(R*1)
               +"\n 2 *"+N1 + " = " +(R*2)
               +"\n 3 *"+N1 + " = " +(R*3)
               +"\n 4 *"+N1 + " = " +(R*4)
               +"\n 5 *"+N1 + " = " +(R*5));
       
}
}