package Fundamentos.seccion07.clasemath;

/** Java Title
 *
 * @author Emmanuel Nieto Muñoz
 * @version: xx/10/2021/1.0
 * @see <a href = "" />  </a>
 */

public class EjemploClaseMathTrigonometria {
    public static void main(String[] args) {

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raizCuadrada = Math.sqrt(5);
        System.out.println("raizCuadrada = " + raizCuadrada);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("Convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("Convertir de grados a radianes = " + radianes);


        System.out.println("sin(90):  " + Math.sin(radianes));
        System.out.println("cos(90):  " + Math.cos(radianes));
        System.out.println("tan(90):  " + Math.tan(radianes));


        radianes = Math.toRadians(180.00);
        System.out.println("cos(180):  " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0):  " + Math.cos(radianes));




    }
}
