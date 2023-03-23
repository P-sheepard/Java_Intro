package javaintro.examples;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExample12 {

    public static void main(String[] args) {
        /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
        que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
        segundo, sino informe que no lo son.*/

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
