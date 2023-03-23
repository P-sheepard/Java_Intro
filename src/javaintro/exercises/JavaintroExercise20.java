package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise20 {

    public static void main(String[] args) {
        /*A 3 x 3 magic square is a 3 x 3 matrix made up of numbers from 1 to 9 where the
        sum of its rows, its columns and its diagonals are identical. Create a program that
        allow to enter a square by keyboard and determine if this square is magic or not.
        The program must verify that the numbers entered are correct, that is,
        They are between 1 and 9.*/

        Scanner read = new Scanner(System.in);
        int matrix[][] = new int[3][3];

        System.out.println("Ingrese valores enteros entre 1 y 9 para rellenar la matriz, el programa averiguara si la matriz resulta ser magica:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    matrix[i][j] = read.nextInt();
                } while (matrix[i][j] < 1 || matrix[i][j] > 9);
                //using a "Do while" loop, the program verifies that the inputted numbers are inside the asked range.
            }
        }
        sum(matrix);
    }

    public static void sum(int[][] mtrx) {
        int sum, counter = 0;
        boolean flag = true;

        //This loop adds up the values of the top row and saves the sum inside a variable.
        for (int j = 0; j < 3; j++) {
            counter += mtrx[0][j];
        }

        /*This loop adds up the sum of the middle and bottom rows, and compares them with the previous variable,
        if the sum is diferent from that of the top row a boolean variable becomes false.*/
        for (int i = 1; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += mtrx[i][j];
            }
            if (sum != counter) {
                flag = false;
            }
        }
        
        //Here the program adds and compares the sums of the columns one by one.
        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += mtrx[j][i];
            }
            if (sum != counter) {
                flag = false;
            }
        }
        sum = 0;
        
        /*This loop makes use of the propiety of the main diagonal of having all its positions be the same index repeated twice,
        making it possible to only use one "for" loop to add its values up.*/
        for (int i = 0; i < 3; i++) {
            sum += mtrx[i][i];
        }
        if (sum != counter) {
            flag = false;
        }
        sum = 0;
        
        /*Accesing the values of the secondary diagonal is a bit more tricky, the second index has to be
        the largest index of the matrix (in this case the number 2, since its a matrix of 3x3) minus the iterator
        resulting in an index of descending order.*/
        for (int i = 0; i < 3; i++) {
            sum += mtrx[i][2 - i];
        }
        if (sum != counter) {
            flag = false;
        }
        
        //To reach our desired outcome we validate the value of our boolean and display a message accordingly.
        if (flag) {
            System.out.println("La matriz es magica pues todos sus lados suman " + counter + ".");
        } else {
            System.out.println("La matriz no es magica.");
        }
    }
}
