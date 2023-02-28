package javaintro_examples;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class javaintro_example12 {

    public static void main(String[] args) {
        multiploCheck();
    }

    public static void multiploCheck() {
        Scanner read = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Ingrese dos numeros para saber si el primer numero es multiplo del segundo:");
        num1 = read.nextInt();
        num2 = read.nextInt();
        
        if (num1 % num2 == 0) {
            System.out.println("El numero " + num1 + " es multiplo de" + num2);
        } else {
            System.out.println("El numero " + num2 + " NO es multiplo de " + num2);
        }
    }
}
