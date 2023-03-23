package javaintro.examples;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExample13_14 {

    public static void main(String[] args) {
        /*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
        define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.*/

        String[] team = new String[8];

        /*Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo*/
        Scanner read = new Scanner(System.in);

        System.out.println("Ingresa los nombres de los compañeros de equipo:");

        for (int i = 0; i < 8; i++) {
            team[i] = read.nextLine();
        }

        System.out.println("Equipo 7:");
        for (int i = 0; i < 8; i++) {
            System.out.print("[" + team[i] + "]");
        }
        System.out.println("");
    }
}
