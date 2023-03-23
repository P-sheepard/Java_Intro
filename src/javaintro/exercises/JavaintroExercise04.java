package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise04 {

    public static void main(String[] args) {
        /*Given a certain temperature expressed on Celsius make the program show it's conversion to Farenheit.
        The conversion factor is: F = 32 + (9 * C / 5).*/

        Scanner read = new Scanner(System.in);
        int temperature;

        //Input:
        System.out.println("Ingrese una cantidad de Grados °C, el programa la convertira a °F:");
        temperature = read.nextInt();

        //Process + Output:
        System.out.println(temperature + "°C es igual a: " + (temperature * 9 / 5 + 32) + "°F");

    }
}
