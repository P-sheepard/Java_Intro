package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise13 {
    public static void main(String[] args) {
        /*Draw the sides of an (N units) sided square using the character '*'*/
        
        Scanner read = new Scanner(System.in);
        int side;
        
        //Input
        System.out.println("Ingrese el valor de Lado para dibujar un cuadrado:");
        side = read.nextInt();
        
        for (int i = 0; i < side; i++) {
            System.out.println("");
            for (int j = 0; j < side; j++) {
                /* [0,0][0,1][0,2][0,3]
                   [1,0][1,1][1,2][1,3]
                   [2,0][2,1][2,2][2,3]
                   [3,0][3,1][3,2][3,3]
                As seen in this example the sides of the square are accesed every time the j counter becomes 0 
                for the left side and (side-1) for the right side, likewise the top is accesed everytime the i
                counter becomes 0 and the bottom everytime it becomes (side-1).*/
                if (i == 0 || i == side-1 || j == 0 || j == side-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
        }
    }
}
