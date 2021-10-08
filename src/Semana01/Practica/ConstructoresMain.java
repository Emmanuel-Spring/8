package Semana01.Practica;

/** Java Class Constructors
 * Práctica con Parametros de Constructores
 * @author Emmanuel Nieto Muñoz  ||  Ignacio Mena Godoy
 * @version: 07/010/2021/1.0
 * @see <a href = "https://www.w3schools.com/java/java_class_methods.asp" /> https://www.w3schools.com/java/java_class_methods.asp </a>
 */

//Creamos la clase Contructores
public class ConstructoresMain {
    int x; // Creamos una clase con un atributo
    int y;
    int z;
    Integer popular;
    Double PI;
    Character letra;
    short e;



    // Creamos una clase constructor para la clase Contructores
    public ConstructoresMain(int y) {
        x = y;
        z = 10000;
        popular = 10000;

        ((Integer) z).byteValue();
    }




    public static void main(String[] args) {
        ConstructoresMain myObj = new ConstructoresMain(66);
        System.out.println("El resultado del método constructor es: ");
        System.out.println(myObj.x);

    }

}
