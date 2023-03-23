package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise10 {
    public static void main(String[] args) {
        /*Write a program that given a positive limit value,
        prompts the user to type numbers until the sum of said numbers
        exceeds the initial limit.*/
        
        Scanner read = new Scanner(System.in);
        int num, sum = 0, limit = 15;
        
        System.out.println("Ingrese numeros hasta sobrepasar el 15:");
        /*Input + as long as the addition of inputted numbers doesn't surpass the value of 15,
        the loop will continue asking for more numbers. In the end it displays the result of said addition*/
        while (sum < limit){
            num = read.nextInt();
            sum += num;
        }
                System.out.println("El total: " + sum + " ha sobrepasado el numero 15.");
    }
}
