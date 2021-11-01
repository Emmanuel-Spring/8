package Semana03.Practica;

/** Java Método String compareTo Java
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @see <a href = "https://www.discoduroderoer.es/metodo-string-compareto-java/" /> Método String compareTo Java </a>
 */

public class PruebaApp {
    public static void main(String[] args) {

     String cadena1 = "americano";
     String cadena2 = "coche";
     System.out.println(cadena1.compareTo(cadena2));

     String cadena3 = "coche";
     String cadena4 = "coche";
     System.out.println(cadena3.compareTo(cadena4));

     String cadena5 = "moto";
     String cadena6 = "MOTO";
     System.out.println(cadena5.compareToIgnoreCase(cadena6));


    }
}
