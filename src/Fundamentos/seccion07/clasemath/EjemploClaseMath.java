package Fundamentos.seccion07.clasemath;

/** Java Clase Math
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @see <a href = "" />  </a>
 */

public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2) ;
        System.out.println("min = " + min);

        // Redondea hacia arriba
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        // Redondea hacia abajo
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        long entero = Math.round(3.4);
        System.out.println("entero = " + entero);

        long enteroPi = Math.round(Math.PI);
        System.out.println("enteroPi = " + enteroPi);

    }
}
