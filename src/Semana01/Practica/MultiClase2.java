package Semana01.Practica;

/** Java Class Methods
 * Práctica con métodos de varias clases
 * @author Emmanuel Nieto Muñoz  ||  Ignacio Mena Godoy
 * @version: 07/010/2021/1.0
 * @see <a href = "https://www.w3schools.com/java/java_class_methods.asp" /> https://www.w3schools.com/java/java_class_methods.asp </a>
 */

public class MultiClase2 {
    public static void main(String[] args) {
        MultiClase1 myCar = new MultiClase1();  // Creamos el objeto myCar
        myCar.fullthrottle();  //Llamamos al método fullThrottle();
        myCar.speed(320);  // Llamamos al método speed();
    }
}
