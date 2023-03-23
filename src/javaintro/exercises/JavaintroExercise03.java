package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise03 {

    public static void main(String[] args) {
        /*Write a program that asks you to write a sentence and shows it in all caps
        and then all characters in lower case*/

        Scanner read = new Scanner(System.in);
        String line;

        //Input:
        System.out.println("Ingrese una frase, el programa la convertira a mayusculas y minusculas: ");
        line = read.nextLine();

        //Output:
        System.out.println(line.toUpperCase());
        System.out.println(line.toLowerCase());
    }

}
