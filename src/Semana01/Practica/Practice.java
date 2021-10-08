package Semana01.Practica;

/** Java Class Methods
 * Práctica con métodos de varias clases
 * @author Emmanuel Nieto Muñoz  ||  Ignacio Mena Godoy
 * @version: 07/010/2021/1.0
 * @see <a href = "https://www.w3schools.com/java/java_class_methods.asp" /> https://www.w3schools.com/java/java_class_methods.asp </a>
 */

// Create Main Class
public class Practice {

    public void fullThrottle () {
        System.out.println("The car is going as fast as it can !");
    }

    //Creamos un metodo speed() y agregamos un parámetro
    public void speed(int maxSpeed) {
        System.out.println("Max Speed is : " + maxSpeed);
    }

    // Dentro de la clase Main, llamamos los métodos sobre el objeto myCar
    public static void main(String[] args) {
        Practice myCar = new Practice();  // creamos el objeto myCar
        myCar.fullThrottle();   // llamamos al  objeto myCar
        myCar.speed(200);  // llamamos al método speed()

    }
}

// Outputs:
// The car is going as fast as it can !
// Max Speed is : 200