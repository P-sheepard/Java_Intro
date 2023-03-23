package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise08 {

    public static void main(String[] args) {
        /*Make a program that only allows typing sentences or words 8 characters long.
        If the user enters a sentence or word 8 characters long, a "CORRECTO" message should be displayed
        on the screen, otherwise, it should display "INCORRECTO".*/

        Scanner read = new Scanner(System.in);
        String line;

        //Input:
        System.out.println("Ingrese una palabra o frase de 8 caracteres de largo:");
        line = read.nextLine();

        //Validation of the length of the String using a Java method:
        if (line.length() == 8) {
            System.out.println("CORRECTO!");
        } else {
            System.out.println("INCORRECTO!");
        }
    }
}
