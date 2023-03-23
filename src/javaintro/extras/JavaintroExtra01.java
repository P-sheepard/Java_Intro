package javaintro.extras;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExtra01 {

    public static void main(String[] args) {
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
        usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/

        Scanner read = new Scanner(System.in);
        int minutes, days, hours;

        System.out.println("Ingrese un valor de tiempo en minutos, para convertirlo a Dias y Horas:");
        minutes = read.nextInt();

        days = minutes / 1440;
        hours = (minutes % 1440) / 60;
        System.out.println(days + " Dia/s y " + hours + " Horas.");
    }
}
