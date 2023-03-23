package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise12 {

    public static void main(String[] args) {
        /*Simulate the operation of an RS232 device, it must recieve continuous
        text string inputs with a fixed format: they have to be a maximum of 5
        characters long, the first character has to be X and the last one has to be an O.
        The special sequence “&&&&&” marks the end of the inputs (let's call it FDE).
        At the end of the process, a report is displayed indicating the number of correct 
        and incorrect readings received.*/
        
        Scanner read = new Scanner(System.in);
        String sequence, fde = "&&&&&";
        //The incorrect counter is set at -1 in order for it to not count the FDE as an input.
        int correct = 0, incorrect = -1;
        
        //Input inside a "do while" loop to keep recieving sequences until the FDE is entered.
        do {
            System.out.println("Ingrese una cadena de 5 caracteres:");
            sequence = read.next();
            //An "if else" validates the format of the sequence, and adds one to the corresponding counter.
            if (sequence.length() == 5 && sequence.substring(0,1).equalsIgnoreCase("x") && sequence.substring(4,5).equalsIgnoreCase("o")) {
                correct ++;
            } else {
                incorrect ++;
            }
    } while(!fde.equals(sequence));
        //Output:
        System.out.println("Informe de secuencias ingresadas: Correctas = " + correct + " Incorrectas = " + incorrect);
}
}