package javaintro.extras;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExtra03 {

    public static void main(String[] args) {
        /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
        Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/

        Scanner read = new Scanner(System.in);
        String input;
        
        do {
            System.out.println("Ingrese solamente un caracter, para detectar si se trata de una vocal o una consonante: ");
        input = read.next().toUpperCase();
        } while (input.length()<1);
        
        System.out.println("Ingrese un caracter, para detectar si se trata de una vocal o una consonante: ");
        input = read.next().toUpperCase();

        if ("A".equals(input) || "E".equals(input) || "I".equals(input) || "O".equals(input) || "U".equals(input)) {
            System.out.println("El caracter ingresado es una vocal.");
        } else {
            System.out.println("El caracter ingresado es una consonante.");
        }
    }
}
