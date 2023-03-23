package javaintro.exercises;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise18 {

    public static void main(String[] args) {
        /*Write a program that fills a 4 x 4 matrix with random values ​​and displays the
        matrix transpose.
        The transposed matrix of a matrix A is denoted by B and is
        obtained by exchanging the rows with the columns (or vice versa).*/

        int matrix[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        //After filling the matrix with random numbers I display it.
        System.out.println("Matriz original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
        //In order to display the transposed matrix i swap the places of the 'i' and 'j' iterators.
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrix[j][i] + "]");
            }
            System.out.println("");
        }
    }
}
