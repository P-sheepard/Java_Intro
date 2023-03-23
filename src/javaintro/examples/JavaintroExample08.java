package javaintro.examples;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExample08 {

    public static void main(String[] args) {
        /*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
        pedirá de nuevo hasta que la nota sea correcta.*/
        
        Scanner read = new Scanner(System.in);
        byte note;

        System.out.println("Ingrese una nota entre 0 y 10:");
        note = read.nextByte();
        
        while (note > 10 || note < 0) {
            System.out.println("Por favor ingrese una nota valida:");
            note = read.nextByte();
        }
        
        System.out.println("La nota " + note + " es un valor valido.");
    }
}
