package javaintro.examples;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExample10 {

    public static void main(String[] args) {
        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
        ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:*/

        Scanner read = new Scanner(System.in);
        byte num, counter = 0;

        System.out.println("Se le pedira ingresar 4 numeros comprendidos entre 1 y 20.");
        
        for (int i = 1; i < 5; i++) {

            System.out.println("Ingrese el valor #" + i + ":");
            num = read.nextByte();

            while (num > 20 || num < 1) {
                System.out.println("el numero debe estar entre 1 y 20:");
                num = read.nextByte();
            }

            System.out.print(num);

            do {
                System.out.print("*");
                counter++;
            } while (counter < num);

            System.out.println("");
            counter = 0;
        }
    }
}
