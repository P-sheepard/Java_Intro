package javaintro_examples;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class javaintro_example06 {

    public static void main(String[] args) {
        /*Implementar un programa que le pida dos números enteros a usuario
        y determine si ambos o alguno de ellos es mayor a 25.*/
        Scanner read = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Ingrese dos numeros enteros:");
        num1 = read.nextInt();
        num2 = read.nextInt();

        if (num1 > 25 || num2 > 25) {
            System.out.println("ambos o alguno de los numeros son mayores a 25");
        } else {
            System.out.println("ninguno de los numeros es mayor a 25");
        }
        }
    }
