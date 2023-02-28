package javaintro_examples;
import java.util.Scanner;
/**
 *
 * @author Sheepard
 */
public class javaintro_example09 {
    public static void main(String[] args) {
        /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.*/
        Scanner read = new Scanner(System.in);
        int num, sum=0, cont=1;
        
        do {
            System.out.println("Ingreseel valor numero " + cont);
        num = read.nextInt();
            if (num == 0) {
                System.out.println("Se capturo el numero 0");
                break;
            } else if (num > 0) {
                sum += num;
            }
                cont++;
    } while(cont < 21);
       if (cont == 20){
           System.out.println("Se ingresaron 20 numeros");
       }
        System.out.println("La suma de los numeros ingresados es: " + sum);
        
}
}