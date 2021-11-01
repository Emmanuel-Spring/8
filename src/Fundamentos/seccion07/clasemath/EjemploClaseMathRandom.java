package Fundamentos.seccion07.clasemath;

/**
 * Java Title
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 10/10/2021/1.0
 * @see <a href = "" />  </a>
 */

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        double random = Math.random();
        System.out.println("random = " + random);


        // Random con los colores
        String [] colores = {"azul", "amarillo", "morado", "verde", "blanco", "negro"};
        double random1 = Math.random();
        random1 *= colores.length;

        System.out.println("random1 = " + random1);

        random1 = Math.floor(random1);
        System.out.println("random1 = " + random1);

        System.out.println("colores = " + colores[(int) random1]);





    }
}
