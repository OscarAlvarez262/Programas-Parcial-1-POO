
import javax.swing.JOptionPane;
/**
 *
 * @author oscar
 */
public class Programa8 {
    public static void main(String[] args) {
        int ch=0, cm = 0, sh = 0, sm = 0;
        float ph = 0.00f ,pm=0.00f;
        for (int i = 0; i < 5; i++) {
        JOptionPane.showInputDialog("Ingresa tu nombre");
        String Sexo = JOptionPane.showInputDialog("Escribe tu sexo m/f");
        String Edad = JOptionPane.showInputDialog("Escribe tu Edad");
        int En = Integer.parseInt(Edad);
        if (Sexo.equals("m")){
                ch++;
                sh = sh + En;
            }else{
                sm = sm + En;
                cm++;
            }
        }
      ph = ((float)sh)/ch;
      pm = ((float)sm)/cm;
       JOptionPane.showMessageDialog(null,"El promedio de hombres es "+ph+" Edad y "+"El promedio de mujeres es "+pm+" Edad");
    }
}
