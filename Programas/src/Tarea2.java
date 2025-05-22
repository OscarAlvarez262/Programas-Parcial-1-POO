
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*HACER UN PROGRAMA QUE LEA UNA CADENA, EL PROGRMA CONTARA CUANTAS VOCALES TIENE LA PALABRA EN TOTAL DE CADA UNA
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author oscar
 */
public class Tarea2 {

    public static void main(String[] args) throws IOException {
        int A = 0;
        int E = 0;
        int I = 0;
        int O = 0;
        int U = 0;

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe una palabra");
        String Palabra = leer.readLine();
        Palabra = Palabra.toLowerCase();
        for (int i = 0; i < Palabra.length(); i++) {
            if (Palabra.charAt(i) == 'a') {
                A = A + 1;
            } else if (Palabra.charAt(i) == 'e') {
                E = E + 1;
            } else if (Palabra.charAt(i) == 'i') {
                I = I + 1;
            } else if (Palabra.charAt(i) == 'o') {
                O = O + 1;
            } else if (Palabra.charAt(i) == 'u') {
                U = U + 1;
            }
        }
        System.out.println("TU PALABRA TIENE "+ A+"=A "+E+"=E "+ I+"=I "+ O+"=O "+ U+"=U ");
    }
}
