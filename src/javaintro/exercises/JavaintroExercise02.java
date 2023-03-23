package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise02 {

    public static void main(String[] args) {
        /*Write a progran that asks you to type your name,
        saves it to a variable and shows it on the screen.*/

        Scanner read = new Scanner(System.in);
        String name;

        //Input:
        System.out.println("Ingrese su nombre, el programa lo almacenara: ");
        name = read.nextLine();

        //Output:
        System.out.println("Nombre: " + name);
    }
}
