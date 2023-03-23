package javaintro.exercises;

/**
 *
 * @author Sheepard
 */
public class JavaintroExercise17 {

    public static void main(String[] args) {
        /*Loop through an array of N whole numbers and count how many numbers have
        1 digit, 2 digits, 3 digits etc. up to 5 digits.*/

        int vector[] = new int[100], counter[] = new int[5];
        int length;

        //I fill the vector with values up tp 99999 in order to have numbers with up to 5 digits.
        for (int i = 0; i < 100; i++) {
            vector[i] = (int) (Math.random() * 100000);
        }
        
        for (int i = 0; i < 100; i++) {
            length = 0;
            
            //I use a while vector to count up the digits of a number by finding how many times it can be divided by 10.
            while (vector[i] != 0) {
                vector[i] /= 10;
                length++;
            }

            //Depending on the digit count I increase a counter located inside an array.
            switch (length) {
                case 1:
                    counter[0]++;
                    break;
                case 2:
                    counter[1]++;
                    break;
                case 3:
                    counter[2]++;
                    break;
                case 4:
                    counter[3]++;
                    break;
                case 5:
                    counter[4]++;
                    break;
                default:
                    break;
            }
        }
        //Output:
        System.out.println("Se encontraron: " + counter[0] + " numeros de 1 digito, " + counter[1] + " numeros de 2 digitos, " + counter[2] + " numeros de 3 digitos, " + counter[3] + " numeros de 4 digitos y " + counter[4] + " numeros de 5 digitos.");
    }
}
