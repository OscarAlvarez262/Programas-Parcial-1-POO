
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*hacer un programa que lea nombre, edad , y el sexo de 5 personas, el programa mostrara el promedio de edades de hombre y mujeres 
 */
/**
 *
 * @author oscar
 */
public class Programa7 {

    public static void main(String[] args) throws IOException {
        BufferedReader datos = new BufferedReader(new InputStreamReader(System.in));
        Scanner leer = new Scanner(System.in);

        String Nombre, Sexo;
        int edad;
        int ch = 0, cm = 0, sh = 0, sm = 0;
        float ph = 0.00f, pm = 0.00f;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa tu nombre");
            Nombre = datos.readLine();
            System.out.println("Escribe tu sexo f/m");
            Sexo = datos.readLine();
            System.out.println("Ingresa tu edad");
            edad = leer.nextInt();
            if (Sexo.equals("m")) {
                ch++;
                sh = sh + edad;
            } else {
                sm = sm + edad;
                cm++;
            }

        }
        ph = ((float) sh) / ch;
        pm = ((float) sm) / cm;
        System.out.println("El promedio de hombres es" + ph + "Edad");
        System.out.println("El promedio de mujeres es" + pm + "Edad");
    }
}
