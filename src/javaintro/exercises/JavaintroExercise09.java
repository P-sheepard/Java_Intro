package javaintro.exercises;
import java.util.Scanner;
/**
 *
 * @author Sheepard
 */
public class JavaintroExercise09 {
    public static void main(String[] args) {
        /*Write a program that asks for a sentence or word and checks if 
        the first letter of that sentence it's an 'A'.
        If the first letter is an 'A', a message should be displayed on the screen
        saying "CORRECTO", otherwise, it should display "INCORRECTO".
        Note: investigate Java's substring and equals() functions.*/
        
        Scanner read = new Scanner(System.in);
        String line;
        
        //Input:
        System.out.println("Ingrese una frase que inicie con la letra A:");
        line = read.nextLine();
        
        /*Validation of the first character of a string using the substring method,
        the program ignores caps lock.*/
        if (line.substring(0,1).equalsIgnoreCase("A")) {
            System.out.println("CORRECTO!");
        } else{
            System.out.println("INCORRECTO!");
        }
    }
}
