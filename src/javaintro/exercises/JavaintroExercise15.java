package javaintro.exercises;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise15 {
    public static void main(String[] args) {
        /*Make an algorithm that fills a vector with the first 100 whole numbers
        and then displays them on the screen in descending order.*/
        
        int vector [] = new int [100];
        //For loop to fill the Array
        for (int i = 0; i < 100; i++) {
            vector[i] = i+1;
        }
        //To display it on the opossite order we start the loop at 99 and use a negative step.
        for (int i = 99; i >= 0; i--) {
            System.out.println("[" + vector[i] + "]");
        }
    }
}
