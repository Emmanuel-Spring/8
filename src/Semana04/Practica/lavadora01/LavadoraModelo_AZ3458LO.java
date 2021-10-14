package Semana04.Practica.lavadora01;

import Semana04.Practica.libreria.EncapsulacionLLFunciones;
import java.util.Scanner;

/** Class Java Encapsulaciòn
 *  Importamos nuestra clase .java encapsulada para utilizarla
 *
 * @author Emmanuel Nieto Muñoz
 * @author Ignacio Mena Godoy
 * @version: x14/10/2021/1.0
 * @see <a href = "https://www.w3schools.com/java/java_encapsulation.asp" /> Java Encapsulation </a>
 */
public class LavadoraModelo_AZ3458LO {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("De qué color es la ropa ?");
        System.out.println("Presiona 1 - Ropa Blanca  /  2 - Ropa de Color");
        int tipoDeRopa = entrada.nextInt();


        System.out.println("Cuántos kilos de ropa ?");
        int kilos = entrada.nextInt();

        EncapsulacionLLFunciones mensajero = new EncapsulacionLLFunciones(kilos, tipoDeRopa);

        System.out.println("\n\n\n");
        mensajero.CicloFinalizado();


    }
}
