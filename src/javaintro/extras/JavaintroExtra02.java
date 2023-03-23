package javaintro.extras;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExtra02 {

    public static void main(String[] args) {
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
        A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,*/

        Scanner read = new Scanner(System.in);
        int A, B, C, D, temp;

        System.out.println("Ingrese un valor para la variable A:");
        A = read.nextInt();
        System.out.println("Ingrese un valor para la variable B:");
        B = read.nextInt();
        System.out.println("Ingrese un valor para la variable C:");
        C = read.nextInt();
        System.out.println("Ingrese un valor para la variable D:");
        D = read.nextInt();

        System.out.println("Los valores asignados son: ");
        System.out.println("A = " + A + " B = " + B + " C = " + C + " D = " + D);

        temp = B;
        B = C;
        C = temp;

        System.out.println("Tras el proceso de cambio, los valores asignados son: ");
        System.out.println("A = " + A + " B = " + B + " C = " + C + " D = " + D);
    }
}
