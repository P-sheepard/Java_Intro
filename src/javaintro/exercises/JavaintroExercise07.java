package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise07 {

    public static void main(String[] args) {
        /*Make a program that asks for a sentence and if said sentence is equal to "eureka" the program
        should display a "Correcto" message, otherwise it will show an "Incorrecto" message.*/

        Scanner read = new Scanner(System.in);
        String line;

        //Entrada:
        System.out.println("Ingrese una frase para tratar de adivinar el Password:");
        line = read.nextLine();

        //Password validation, the program ignores caps lock:
        if (line.equalsIgnoreCase("Eureka")) {

            System.out.println("CORRECTO!");
        } else {
            System.out.println("INCORRECTO!");
        }
    }
}
