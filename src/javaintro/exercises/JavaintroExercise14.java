package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise14 {

    public static void main(String[] args) {
        /*Create an application that given an amount of euros entered by keyboard 
        converts them to another currency through a function, these can be dollars, yen or pounds.
        The function will have as parameters the amount of euros and the currency to be converted, which will be a string,
        The currency exchange is:
        * 0.86 pounds is 1€
        * $1.28611    is 1€
        * 129,852 yen is 1€*/

        Scanner read = new Scanner(System.in);
        double euro;
        String coin;

        //Input:
        System.out.println("Ingrese la cantidad de Euros a convertir: ");
        euro = read.nextDouble();
        System.out.println("Ingrese la moneda a la cual desea convertir la cantidad: ");
        coin = read.next();
        coin = coin.toLowerCase();

        converter(euro, coin);

    }

    public static void converter(double e, String c) {
        //The function recieves the parameters and depending on the case processes the conversion and then displays it.
        switch (c) {
            case "dolar":
                System.out.println(e + " Euros equivalen a " + (e * 1.28611) + " Dolares.");
                break;
            case "libra":
                System.out.println(e + " Euros equivalen a " + (e * 0.86) + " Libras.");
                break;
            case "yen":
                System.out.println(e + " Euros equivalen a " + (e * 129.852) + " Yenes.");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}
