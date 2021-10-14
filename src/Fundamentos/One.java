package Fundamentos;

/**
 * Java Title
 *
 * @author Emmanuel Nieto Muñoz
 * @version: xx/10/2021/1.0
 * @see <a href = "" />  </a>
 */

public class One {
    public static String reverseString(String str) {
        char ch [] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i > 0; i--) {
            rev += ch[1];
        }
        return rev;
    }

    public static void main(String[] args) {
        One o = new One();
        System.out.println("o = " + o.reverseString("soi"));
    }
}
