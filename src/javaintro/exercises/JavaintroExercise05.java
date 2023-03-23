package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise05 {

    public static void main(String[] args) {
        /*Write a program that reads a given number and shows said number doubled, tripled,
        and it's square root on the screen.*/

        Scanner read = new Scanner(System.in);
        int num1;

        //Input:
        System.out.println("Ingrese un numero entero, el programa mostrara el doble, el triple y su raiz cuadrada:");
        num1 = read.nextInt();

        //Output:
        System.out.println("Doble: " + (num1 * 2) + " | Triple: " + (num1 * 3) + " | Raiz cuadrada: " + (Math.sqrt(num1)));
    }
}
