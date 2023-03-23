/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise11 {

    public static void main(String[] args) {
        /*Write a program that asks you to type two positive whole numbers and 
        displays a menu on the screen with the following options:
        1 "Suma", 2 "Resta", 3 "Multiplicacion", 4 "Division" and 5 "Salida".
        The "Salir" option requires confirmation.*/

        Scanner read = new Scanner(System.in);
        int num1, num2, result, option;
        //The "exit" variable works as a validator, it's initialized in an "off" state.
        String exit = "N";

        //Input:
        do {
            System.out.println("Ingrese dos numeros enteros:");
            num1 = read.nextInt();
            num2 = read.nextInt();

            //Menu display and option input:
            System.out.println("Selecione una opcion:");
            System.out.println("|1-Suma|2-Resta|3-Multiplicacion|4-Division|5-Salir|");
            option = read.nextInt();

            switch (option) {
                case 1:
                    result = num1 + num2;
                    System.out.println("La suma de " + num1 + " + " + num2 + " es igual a: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("La resta de " + num1 + " - " + num2 + " es igual a: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("La multiplicacion de " + num1 + " X " + num2 + " es igual a: " + result);
                    break;
                case 4:
                    result = num1 / num2;
                    System.out.println("La division de " + num1 + " / " + num2 + " es igual a: " + result);
                    break;
                case 5:
                    System.out.println("Realmente desea Salir del programa? S/N");
                    //Here the program asks for confirmation to exit.
                    exit = read.next();
                    break;
            }
            //when the user answers "S" the validation changes to "on" and the program ends.
        } while (!exit.equalsIgnoreCase("S"));
    }
}
