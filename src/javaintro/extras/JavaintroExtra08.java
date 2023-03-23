package javaintro.extras;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExtra08 {

    public static void main(String[] args) {
        /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/

        Scanner read = new Scanner(System.in);
        int num, par = 0, impar = 0;

        do {
            System.out.println("Ingrese numeros enteros, si es multiplo de 5 el programa finalizara: ");
            num = read.nextInt();

            if (num > 0) {
                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
            if (num % 5 == 0) {
                System.out.println("Se capturo un multiplo de 5");
                break;
            }
        } while (true);

        System.out.println("Ingreso finalizado total de numeros ingresados: " +(par+impar)+ ", cantidad de Pares: " + par + " Cantidad de Impares: " + impar);
    }
}
