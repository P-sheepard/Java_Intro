package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise01 {

    public static void main(String[] args) {
        /*Write a program that asks you to type two whole numbers and adds them togheter.
        The program must show the result of the addition.*/

        Scanner read = new Scanner(System.in);
        int num1, num2;

        //Input:
        System.out.println("Ingrese dos numeros enteros por teclado, el programa mostrara la suma de estos: ");
        num1 = read.nextInt();
        num2 = read.nextInt();

        //Process + Output:
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
