package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise06 {

    public static void main(String[] args) {
        /*Make a program that given a number determines if it is odd or even.*/

        Scanner read = new Scanner(System.in);
        int num1;

        //Input:
        System.out.println("Ingrese un numero para determinar si es par o impar:");
        num1 = read.nextInt();

        //If the remainder of the division between (num1) and 2 equals to 0, said number is even:
        if (num1 % 2 == 0) {
            System.out.println("El numero " + num1 + " es par.");
        } else {
            System.out.println("El numero " + num1 + " es impar.");
        }
    }
}
