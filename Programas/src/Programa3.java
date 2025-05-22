
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author oscar
 */
public class Programa3 {

    public static void main(String[] args) throws IOException {
        //Metodos de la clase string
        //Conversion a Ascii
        String nombre = ""; //variable para analizar el dato introducido
        int cn = 0;//variable para el contador de numeros
        int b = 0;//variable de valor final
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ESCRIBE UN NUMERO");
        nombre = leer.readLine();
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.codePointAt(i) >= 48 && nombre.codePointAt(i) <= 57) {
                cn++;
            }
        }
        if (cn == nombre.length()) {
            System.out.println("Si se puede convertir");
            b = Integer.parseInt(nombre);
        } else {
            System.out.println("Error no todos son numeros");
        }

    }

}
