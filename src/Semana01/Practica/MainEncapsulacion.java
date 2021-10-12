package Semana01.Practica;

/** Java Class Encapsulation
 *
 * @author Emmanuel Nieto Muñoz  ||  Ignacio Mena Godoy
 * @version: 10/010/2021/1.0
 * @see <a href = "" />  </a>
 */

public class MainEncapsulacion {
    public static void main(String[] args) {
        PersonEncapsulacion myObj = new PersonEncapsulacion();

        myObj.setNombre("Emmanuel");


        System.out.println(myObj.getNombre());


    }
}
