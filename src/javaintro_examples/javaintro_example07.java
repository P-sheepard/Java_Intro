package javaintro_examples;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class javaintro_example07 {

    public static void main(String[] args) {
        /*Definir una variable tipoMotor y permitir que el usuario ingrese 
        un valor entre 1 y 4. El programa debe mostrar lo siguiente:*/
        Scanner read = new Scanner(System.in);
        byte tipoMotor;
        System.out.println("Ingrese un valor entre 1 y 4 para definir el tipo de motor:");

        tipoMotor = read.nextByte();

        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("no existe un valor para tipo de bomba");

        }

    }
}
