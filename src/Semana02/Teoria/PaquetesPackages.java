package Semana02.Teoria;

import java.util.Scanner;

/** Java Packages
 *
 * @author Emmanuel Nieto Muñoz   ||  Ignacio Mena Godoy
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


        System.out.println("Su nombre de usuario es:   "  + nombreUsuario);
        System.out.println("Su apellidos de usuario es:   " + apellidoUsuario);


    }
}
