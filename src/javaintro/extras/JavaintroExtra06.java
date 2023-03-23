package javaintro.extras;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExtra06 {

    public static void main(String[] args) {
        /*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
        debajo de 1.60 mts. y el promedio de estaturas en general.*/

        Scanner read = new Scanner(System.in);
        int people;
        double general = 0, shorter = 0;

        System.out.println("Ingrese la cantidad de personas de las cuales capturara su estatura:");
        people = read.nextInt();

        double[] vector = new double[people];

        for (int i = 0; i < people; i++) {
            System.out.println("Ingrese la estatura de la persona #" + (i + 1));
            vector[i] = read.nextDouble();

            if (vector[i] < 1.60) {
                shorter++;
            }
            general+=vector[i] ;
        }
        System.out.println("El promedio de estaturas general es: " + (general / people));
        System.out.println("El promedio de estaturas menores a 1.60 es: " + ( people / shorter));
    }
}
