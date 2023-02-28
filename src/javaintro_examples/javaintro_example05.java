package javaintro_examples;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class javaintro_example05 {

    public static void main(String[] args) {
        /*Define una variable de tipo boolean, double y char.
        Guarda información en ellas a través del Scanner.*/
        Scanner read = new Scanner(System.in);
        boolean flag;
        double dec;
        char lett;

        System.out.println("Ingrese un valor booleano:");
        flag = read.nextBoolean();
        System.out.println("Ingrese un valor decimal:");
        dec = read.nextDouble();
        System.out.println("Ingrese un caracter");
        lett = read.next().charAt(0);

        System.out.println("Valores ingresados: \n Booleano: " + flag + " | Decimal: " + dec + " | Caracter: " + lett);

        //Deteccion de errores:
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();

        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
    }
}
