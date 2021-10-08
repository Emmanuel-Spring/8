package Semana01.Teoria;

/** Java Class Constructors
 * Trabajando con constructores
 * @author Emmanuel Nieto Muñoz  ||  Ignacio Mena Godoy
 * @version: 07/010/2021/1.0
 * @see <a href = "https://www.w3schools.com/java/java_class_methods.asp" /> https://www.w3schools.com/java/java_class_methods.asp </a>
 */

//Creamos la clase Contructores
public class Constructores {
    int x; // Creamos una clase atributo

    // Creamos una clase constructor para la clase Contructores
    public Constructores() {
        x = 5;
    }


    public static void main(String[] args) {
        Constructores myObj = new Constructores();
        System.out.println("El resultado del método constructor es: ");
        System.out.println(myObj.x);

    }

}
