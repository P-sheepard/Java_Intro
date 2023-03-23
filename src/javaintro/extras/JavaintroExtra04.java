package javaintro.extras;

import java.util.Scanner;

/**
 *
 * @author Sheepard
 */
public class JavaintroExtra04 {
 public static void main(String[] args) {
    /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.*/
    
    Scanner read = new Scanner(System.in);
    System.out.print(" Ingrese un numero entero: ");
    
    int num = read.nextInt();
    String roman = "";int i = 0;
    
    if(num > 8)
    {  
       roman = "X"; 
       if(num - 10 < 0){roman = "I"+roman;}
       else{num -= 10;}
    }
    if(num >= 4 && num <=8)
    {  
       roman = "V";
       if(num - 5 < 0){roman = "I"+roman;}
       else{num -= 5;}
    }
    if(num < 4)
    {
        while(i < num){roman += "I";i++;}
        
    }
    System.out.println(" = "+roman);
        }
}
