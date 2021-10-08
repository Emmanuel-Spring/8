package Semana01.Teoria;


/** Java Class Methods
 *
 * @author Emmanuel Nieto Muñoz  ||  Ignacio Mena Godoy
 * @version: 07/010/2021/1.0
 * @see <a href = "https://www.w3schools.com/java/java_class_methods.asp" /> https://www.w3schools.com/java/java_class_methods.asp </a>
 */

public class Metodos {

    //Static Methods
    static void myMethod() {
        System.out.println("Hello World");
    }

    // Static methods
    static void myStaticMethod() {
        System.out.println("Static Methods can be called without creating objects");
    }

    // Public methods
    public void myPublicMethod () {
        System.out.println("Public Methods must be called by creating objects");
    }


    /**
     * Dentro de la clase Metodos llamamos a myMethod
     * @param  myMethod este método es llamado
     */

    public static void main(String[] args) {
        myMethod();

        System.out.println("****************************************");
        System.out.println("****************************************");

        myStaticMethod();  // llamamos al método estático
        // myPublicMethod(); Este se podría compilar con un error

        System.out.println("****************************************");
        System.out.println("****************************************");

        Metodos myObj = new Metodos();  // Creamos un objeto de Metodos
        myObj.myPublicMethod(); // llamamos el método público sobre un objeto
    } // cierre del método Main

    // Outputs :
    // Hello World
    // Static Methods can be called without creating objects
    // Public Methods must be called by creating objects

}
