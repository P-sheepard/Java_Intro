package javaintro_examples;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class javaintro_example14 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String[] team = new String[8];

        System.out.println("Ingresa los nombres de los compañeros");
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
