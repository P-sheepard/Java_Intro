package javaintro.exercises;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise19 {
    public static void main(String[] args) {
        /*Write a program that checks if a given matrix is ​​antisymmetric.
        A matrix A is antisymmetric when it is equal to its own transpose, but with
        the sign of the numbers reversed.
        That is, A is antisymmetric if A = -AT. The transposed matrix of a matrix A is
        denoted by AT.*/
        
        Scanner read = new Scanner(System.in);
        int size;
        boolean flag=true;
        System.out.println("Ingrese un valor para establecer la dimension de la matriz:");
        size = read.nextInt();
        
        int matrix[][] = new int[size][size], matrixB[][] = new int[size][size];

        //The program asks the user to fill the matrix.
        System.out.println("Ingrese los valores para rellenar la matriz, el programa averiguara si la matriz resulta ser antisimetrica:");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                    matrix[i][j] = read.nextInt();
            }
        }
        //Here i save the transposed matrix into a new variable.
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                    matrixB[i][j] = matrix[j][i];
            }
        }
        //Finally i compare the transposition with the negative of the original matrix, and make use of a boolean validator.
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrixB[i][j] != (matrix[i][j]*-1)) {
                    flag=false;
                }
            }
        }
        if (flag) {
            System.out.println("La matriz es antisimetrica.");
        }else {
            System.out.println("LA matriz no es antisimetrica.");
        }
    }
}
