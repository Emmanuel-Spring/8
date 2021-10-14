package Semana02.Teoria;

import java.util.Scanner;

/** Java Packages  --  Scanner de import java.util.Scanner;
 *  Clase Scanner: Introducimos por consola el nombre, apellidos y rut, y nos devuelve los datos
 *  ingresados de forma ordenada.
 *
 * @author Emmanuel Nieto Muñoz
 * @author Ignacio Mena Godoy
 * @version: 13/10/2021/1.0
 * @see <a href = "https://www.w3schools.com/java/java_packages.asp" /> Java Packages </a>
 */

public class PaquetesPackages {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingrese su nombres:    ");
        String nombreUsuario = myObj.nextLine();

        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Ingrese su apellidos:   ");
        String apellidoUsuario = myObj1.nextLine();

        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Ingrese su rut:   ");
        String rutUsuario = myObj2.nextLine();


        System.out.println("*****************************");
        System.out.println("*****************************\n\n");
        System.out.println("Su nombre de usuario es:   "  + nombreUsuario);
        System.out.println("Su apellidos de usuario es:   " + apellidoUsuario);
        System.out.println("El rut del usuario es:   " + rutUsuario);
        System.out.println("\n\n*****************************");
        System.out.println("*****************************");


    }
}
