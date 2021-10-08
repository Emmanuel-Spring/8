package Semana01.Practica;

/** Java Class Constructors
 * Práctica con Varios Parametros de Constructores
 * @author Emmanuel Nieto Muñoz  ||  Ignacio Mena Godoy
 * @version: 07/010/2021/1.0
 * @see <a href = "https://www.w3schools.com/java/java_class_methods.asp" /> https://www.w3schools.com/java/java_class_methods.asp </a>
 */

//Creamos la clase Contructores
public class ConstructoresMultiParameters {
    int modelYear; // Creamos una clase atributo
    String modelName;

    // Creamos una clase constructor para la clase Contructores
    public ConstructoresMultiParameters(int year, String name) {
        modelName = name;
        modelYear = year;
    }


    public static void main(String[] args) {
        ConstructoresMultiParameters myCar = new ConstructoresMultiParameters(1969, "Mustang");
        System.out.println("El resultado del método constructor es: ");
        System.out.println(myCar.modelName + " " + myCar.modelYear);

    }

}
