package javaintro.examples;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExample11 {

    public static void main(String[] args) {
        /*Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
        correspondiente: a = @, e = #, i = $, o = %, u = *. 
        Utilice la estructura “según” para la transformación.*/

        Scanner read = new Scanner(System.in);

        int i = 0;
        char letter;
        System.out.println("Ingrese una frase terminada en punto.");
        String str = read.nextLine();

        System.out.println("Codificacion:");

        do {
            letter = str.charAt(i);
            if (letter == '.') {
                i = str.length() + 1;
            }

            replace(letter);
            i++;
        } while (i < str.length());

    }

    public static void replace(char lett) {
        switch (lett) {
            case 'a':
                System.out.print("@");
                break;
            case 'e':
                System.out.print("#");
                break;
            case 'i':
                System.out.print("$");
                break;
            case 'o':
                System.out.print("%");
                break;
            case 'u':
                System.out.print("*");
                break;
            default:
                System.out.print(lett);
        }
    }
}
