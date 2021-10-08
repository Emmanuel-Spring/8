import java.util.ArrayList;
import java.util.Random;

/** Titulo Aqui  ||  desarrollo del código
 *
 * @author Emmanuel Nieto Muñoz  ||  Ignacio Mena Godoy
 * @version: 07/010/2021/1.0
 * @see <a href = "" />  </a>
 */

public class plantilla {

    //Campos de la clase
    private ArrayList<Integer> serieAleatoria;

    /**
     * Constructor para la serie de números aleatorios
     * @param numeroItems El parámetro numeroItems define el número de elementos que va a tener la serie aleatoria
     */

    public plantilla (int numeroItems) {

        serieAleatoria = new ArrayList<Integer>();

        for (int i=0; i<numeroItems; i++) {  serieAleatoria.add(0);  }

        System.out.println ("Serie inicializada. El número de elementos en la serie es: " + getNumeroItems() );

    } //Cierre del constructor

    /**
     * Método que devuelve el número de ítems (números aleatorios) existentes en la serie
     * @return El número de ítems (números aleatorios) de que consta la serie
     */

    public int getNumeroItems() { return serieAleatoria.size(); }

    /**
     * Método que genera la serie de números aleatorios
     */

    public void generarSerieDeAleatorios () {

        Random numAleatorio;
        numAleatorio = new Random ();
        for (int i=0; i < serieAleatoria.size(); i++) { serieAleatoria.set(i, numAleatorio.nextInt(1000) ); }
        System.out.print ("Serie generada! ");

    } //Cierre del método
} //Cierre de la clase y del ejemplo aprenderaprogramar.com