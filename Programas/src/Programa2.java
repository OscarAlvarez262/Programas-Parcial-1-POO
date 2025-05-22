
/**
 *
 * @author oscar
 */
public class Programa2 {
        public static void main(String[] args) {
        //tipos de datos
        //ENTEROS
        //int,byte,long,short abarcan de 8 a 32 bits
        //DECIMAL
        //float,double abarcan de 16 a 32 bits
        //conversion implicita y explicita
        //caracter o caracter String
        String Dia2 = "100";
        int Dia= 7;
        float D = 1.0f;
        D =(float)Dia;
        Dia = (int)D;
        Dia = Integer.parseInt(Dia2);
        D = Float.parseFloat(Dia2);
        //Math.pow ELEVAR A POTENCIA
        //Math.sqrt RAIZ CUADRADA*/
        
        // la division
        int a = 5;
        int b = 2;
        float c = 0;
        c = (float)a  / (float)b ;
        System.out.println(c);
    }
}