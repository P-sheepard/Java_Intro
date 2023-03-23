package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise16 {

    public static void main(String[] args) {
        /*Write an algorithm that fills a vector of size N with random numbers ​​and asks
        the user a number to search for inside the vector. The program will show the position
        of the number and if it is repeated*/

        Scanner read = new Scanner(System.in);
        int numSearch, n, counter = 0;
        
        //Since the exercise asks for a N number I ask the user for said number.
        System.out.println("Ingrese la dimension deseada para el vector a utilizar:");
        n = read.nextInt();
        int vector[] = new int[n];
        

        //Making use of the random method I fill the array with numbers up to 99
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100);
        }

        System.out.println("Ingrese un numero para buscar dentro del Arreglo:");
        numSearch = read.nextInt();

        //I loop through the array in search for the requested number, and display a message each time it matches it.
        for (int i = 0; i < n; i++) {
            if (vector[i] == numSearch) {
                counter++;
                System.out.println("El numero " + numSearch + " se encuentra en la posicion: " + i + 1);
            }
        }
        /*If the counter is equal to 0 it means the number wasnt found,
        else the program displays the number of times the number appears*/
        if (counter == 0) {
            System.out.println("El numero " + numSearch + " no se encontro dentro del arreglo.");
        } else {
            System.out.println("El numero " + numSearch + " se encuentra repetido " + counter + "veces.");
        }
    }
}
