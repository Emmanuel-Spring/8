package Semana04.Practica;

/** Class Java Encapsulaciòn
 *
 * @author Emmanuel Nieto Muñoz
 * @author Ignacio Mena Godoy
 * @version: x14/10/2021/1.0
 * @see <a href = "https://www.w3schools.com/java/java_encapsulation.asp" /> Java Encapsulation </a>
 */

public class EncapsulacionLLFunciones {
    private int kilos = 0;
    private int llenadoCompleto = 0;
    private int tipoRopa = 0;
    private int lavadoCompleto = 0;
    private int secadoCompleto = 0;

    public EncapsulacionLLFunciones(int kilos, int tipoRopa) {
        this.kilos = kilos;
        this.tipoRopa = tipoRopa;
    }

    private void Llenado() {
        if (kilos <= 12) {
            llenadoCompleto = 1;
            System.out.println("Llenando ... ");
            System.out.println("Llenado Completo");
        } else {
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
        }
    }

    private void Lavado() {
        Llenado();
        if (llenadoCompleto == 1) {
            if (tipoRopa == 1) {
                System.out.println("Ropa blanca /  Lavado suave");
                System.out.println("Lavando ...");
                lavadoCompleto = 1;

            } else if (tipoRopa == 2) {
                System.out.println("Ropa color /  Lavado intenso");
                System.out.println("Lavando ...");
                lavadoCompleto = 1;

            } else {
                System.out.println("El tipo de ropa no està disponible");
                System.out.println("Se lavarà la ropa de color  //  lavado intenso");
                lavadoCompleto = 1;
            }
        }
    }
    private void Secado () {   // Creamos el método secado en modo privado
        Lavado();
        if (lavadoCompleto == 1) {
            System.out.println("Secando ...");
            secadoCompleto = 1;
        }
    }
    public void CicloFinalizado() {  // Creamos eñ método CicloFinalizado
        Secado();
        System.out.println("Tu ropa está lista !!!1");
    }
}