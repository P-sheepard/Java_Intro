package javaintro.extras;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExtra05 {

    public static void main(String[] args) {
        /*Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.*/

        Scanner read = new Scanner(System.in);
        String member;
        int cost;

        System.out.println("Ingrese el tipo de Miembro al que pertenece: ");
        member = read.next().toUpperCase();

        System.out.println("Ingrese el costo de el tratamiento que solicita: ");
        cost = read.nextInt();
        
        switch (member) {
            case "A":
                cost = (cost * 50) / 100;
                break;
            case "B":
                cost = (cost * 65) / 100;
                break;
            case "C":
                break;
            default:
                System.out.println("Ingreso invalido.");
        }
        System.out.println("De un costo de tratamiento de $1,000, la clase " + member + "solo debe pagar: $" + cost);
    }
}
