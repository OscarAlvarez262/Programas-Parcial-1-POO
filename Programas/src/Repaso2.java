
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*HACER UN PROGRAMA QUE LEA NOMBRE Y APELLEIDOS POR SEPARADO DE UNA PERSONA
ADEMAS, DEL DIA Y MES Y AÑO DE NACIMIENTO, EL PROGRAMA DEBE OBTENER DE LOS DATOS ANTERIORES EL RFC
RFC
 */
/**
 *
 * @author oscar
 */
public class Repaso2 {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Scanner dia = new Scanner(System.in);
        String RFC = "";
        String AUX = "";
        System.out.println("Escribe el nombre de una persona");
        String Nombre = leer.readLine();
        System.out.println("Escribe el apellido paterno");
        String Ap = leer.readLine();
        Ap = Ap.toLowerCase();//CONVERIMOS EL APELLIDO PATERNO EN MINUSCULAS
        String[] Palabras = Ap.split(" ");//SI ES COMPUESTO LO DIVIDIMOS EN PALABRAS
        if (Palabras.length == 2) {
            Ap = Palabras[1];
        } else if (Palabras.length == 3) {
            Ap = Palabras[2];
        }
        System.out.println("Escribe el apellido materno");
        String Am = leer.readLine();
        System.out.println("Escribe el dia de nacimiento");
        int D = dia.nextInt();
        System.out.println("Escribe el mes de nacimiento");
        int M = dia.nextInt();
        System.out.println("Escribe el año de nacimiento");
        int A = dia.nextInt();
        RFC = RFC + Ap.toUpperCase().charAt(0);
        if (Ap.charAt(1) == 'a' || Ap.charAt(1) == 'e' || Ap.charAt(1) == 'i' || Ap.charAt(1) == 'o' || Ap.charAt(1) == 'u') {
            RFC = RFC + Ap.toUpperCase().charAt(1);
        } else if (Ap.charAt(2) == 'a' || Ap.charAt(2) == 'e' || Ap.charAt(2) == 'i' || Ap.charAt(2) == 'o' || Ap.charAt(2) == 'u') {
            RFC = RFC + Ap.toUpperCase().charAt(2);
        } else {
            RFC = RFC + Ap.toUpperCase().charAt(3);
        }
        RFC = RFC + Am.toUpperCase().charAt(0);
        RFC = RFC + Nombre.toUpperCase().charAt(0);
        AUX = Integer.toString(A);
        RFC = RFC + AUX.substring(2, 4);
        AUX = Integer.toString(M);
        if (AUX.length() == 1) {
            AUX = "0" + AUX;//AGREGA UN 0 SI EL NUMERO ES DE UN DIGITO
        }
        RFC = RFC + AUX.substring(0, 2);
        AUX = Integer.toString(D);
        if (AUX.length() == 1) {
            AUX = "0" + AUX;//AGREGA UN 0 SI EL NUMERO ES DE UN DIGITO
        }
        RFC = RFC + AUX.substring(0, 2);
        JOptionPane.showMessageDialog(null, RFC);
    }
}
