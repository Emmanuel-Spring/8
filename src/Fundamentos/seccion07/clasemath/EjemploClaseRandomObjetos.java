package Fundamentos.seccion07.clasemath;

import java.util.Random;

/**
 * Java Title
 *
 * @author Emmanuel Nieto Muñoz
 * @version: xx/10/2021/1.0
 * @see <a href = "" />  </a>
 */

public class EjemploClaseRandomObjetos {
    public static void main(String[] args) {

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt();
        System.out.println("randomInt = " + randomInt);

        Random randomObj1 = new Random();
        long randomLong = randomObj1.nextLong();
        System.out.println("randomLong = " + randomLong);

        Random randomObj2 = new Random();
        int randomInt1 =  15 + randomObj2.nextInt(25 - 15 + 1);   // +1 incluye el 25
        System.out.println("randomInt1 = " + randomInt1);



        // Random con los colores
        String [] colores = {"azul", "amarillo", "morado", "verde", "blanco", "negro"};
        double random = Math.random();
        random *= colores.length;


        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);





    }
}
