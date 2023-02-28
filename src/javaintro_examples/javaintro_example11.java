package javaintro_examples;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class javaintro_example11 {

    public static void main(String[] args) {
        /*Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.*/
        Scanner read = new Scanner(System.in);

        int i = 0;

        System.out.println("Ingrese una frase");
        String str = read.nextLine();

        do {
            char lett = str.charAt(i);
            if (lett == '.') {
                i = str.length()+1;
            }
            replace(lett);
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
