package Semana01.Teoria;

/** Java Class Encapsulation
 *
 * @author Emmanuel Nieto Muñoz  ||  Ignacio Mena Godoy
 * @version: 10/010/2021/1.0
 * @see <a href = "https://www.w3schools.com/java/java_encapsulation.asp" /> Java Class Encapsulation </a>
 */

public class Encapsulacion {
    private String name;    // Private : acceso restringido

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
