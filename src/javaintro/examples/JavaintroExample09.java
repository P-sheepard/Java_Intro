package javaintro.examples;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExample09 {

    public static void main(String[] args) {
        /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
        bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
        resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.*/

        Scanner read = new Scanner(System.in);
        int num, sum = 0, counter = 1;

        System.out.println("Se le pedira ingresar 20 numeros, es posible finalizar el proceso al ingresar el numero 0.");

        do {
            System.out.println("Ingrese el valor #" + counter + ":");
            num = read.nextInt();

            if (num == 0) {
                System.out.println("Se capturo el numero 0.");
                break;
            } else if (num > 0) {
                sum += num;
            }

            counter++;
        } while (counter < 21);

        if (counter == 20) {
            System.out.println("Se capturaron 20 numeros.");
        }
        System.out.println("La suma total de los numeros ingresados es: " + sum);

    }
}
