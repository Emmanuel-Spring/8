package Semana01.Teoria;

/** Java Class Attributes
 *
 * @author Emmanuel Nieto Muñoz  ||  Ignacio Mena Godoy
 * @version: 07/010/2021/1.0
 * @see <a href = "https://www.w3schools.com/java/java_class_attributes.asp" /> Java Class Attributes </a>
 * @see <a href = "" />  </a>
 */


public class Atributos {
        int x = 5;
        int y = 3;
        final int z = 50;


    public static void main(String[] args) {
        Atributos myObj = new Atributos();   // Creamos un objeto llamado "myObj" e impriminmos el valor d ela x
        System.out.println("myObj = " + myObj.x);

        System.out.println("*************************************");
        System.out.println("*************************************");

        Atributos myObj2 = new Atributos();
        myObj2.y = 10;  // y ahora vale 10, por eso es una variable
        System.out.println("myObj2 = " + myObj2.y);

        System.out.println("*************************************");
        System.out.println("*************************************");

        Atributos myObj3 = new Atributos();
        // myObj3.z = 10;  // En esta línea de código se genera  un error: No se le puede asignar un valor
        // variable a una constante FINAL. El valor z vale 50
        System.out.println("myObj3 = " + myObj3.z);

    }

}
