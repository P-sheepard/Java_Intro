package javaintro.examples;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExample05 {

    public static void main(String[] args) {
        /*Define una variable de tipo boolean, double y char.
        Guarda información en ellas a través del Scanner.*/

        Scanner read = new Scanner(System.in);
        boolean flag;
        double decimal;
        char letter;

        System.out.println("Ingrese un valor booleano:");
        flag = read.nextBoolean();
        System.out.println("Ingrese un valor decimal:");
        decimal = read.nextDouble();
        System.out.println("Ingrese un caracter:");
        letter = read.next().charAt(0);

        System.out.println("Valores ingresados: \n Booleano: " + flag + " | Decimal: " + decimal + " | Caracter: " + letter);

        //Deteccion de errores:
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();

        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
    }
}
