package javaintro.exercises;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise21 {

    public static void main(String[] args) {
        /*Given two square matrices of whole numbers, the 10x10 "matrix M" and the
        3x3 matrix P, write a program that checks if the matrix P is contained
        within the matrix M.
        To do this, it must be verified among all the 3x3 submatrices
        that can be formed inside the matrix M, moving by rows or columns, if there 
        exists at least one that matches the matrix P. In that case, the program must indicate the row and the
        column of matrix M at which the first element of submatrix P begins.*/

        int[][] M = {
            {1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
            {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};

        int[][] P = {
            {1 , 26, 36},
            {11, 12, 13},
            {56, 78, 87}};

        //I display both matrixes for reference.
        System.out.println("Matriz M: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("["+M[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("Matriz P: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+P[i][j]+"]");
            }
            System.out.println("");
        }
        /*Since we are goign to loop trough submatrixes we use loops of 7 steps,
        which is the substraction of the number of indexes of the first matrix minus,
        those of the second matrix.
        This is done to avoid iterating outside the dimensions of our biggest matrix.*/
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (compareSubmatrix(M, P, i, j)) {
                    System.out.println("La submatriz P se encuentra dentro de la matriz M en los siguientes indices: ");
                    for (int k = 0; k < 3; k++) {
                        /*The display loop uses only the initial position of the submatrix
                        and since the following positions have to be in sequence the program just adds consecutive numbers
                        to write the next positions.*/
                        for (int l = 0; l < 3; l++) {
                            System.out.print("[" + (i + k) + "," + (j + l) + "]");
                        }
                        System.out.println("");
                    }
                    return;
                }
            }
        }
        System.out.println("La submatriz P no se encuentra dentro de la matriz M.");
    }

    public static boolean compareSubmatrix(int[][] M, int[][] P, int row, int column) {
        /*To compare the matrixes we loop trough all positions of our large matrix comparing them
        to the values of the small one, if one position coincides it has to check for the following
        positions that match the size of the P matrix, if one of the positions is diferent it deactivates a boolean
        telling the program that the submatrix isn't equal to P.*/
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (M[row + i][column + j] != P[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
