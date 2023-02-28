package javaintro_examples;
import java.util.Scanner;
/**
 *
 * @author Sheepard
 */
public class javaintro_example08 {
    public static void main(String[] args) {
        /*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.*/
        Scanner read = new Scanner(System.in);
        byte nota;
        
        System.out.println("Ingrese una nota entre 0 y 10:");
        nota = read.nextByte();
        while (nota > 10 || nota < 0) {            
            System.out.println("Por favor ingrese una nota valida:");
            nota = read.nextByte();
        }
            System.out.println("La nota " + nota + " es un valor valido");
        }
    }
