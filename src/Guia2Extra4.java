/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
*/

import java.util.Scanner;

public class Guia2Extra4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entre 1 y 10: ");
        int numero = sc.nextInt();
        
        switch(numero){
        
            case 1:
                System.out.println("En Numeros romanos es : I");
                break;
            case 2:
                System.out.println("En Numeros romanos es : II");
                break;
            case 3:
                System.out.println("En Numeros romanos es : III");
                break;
            case 4:
                System.out.println("En Numeros romanos es : IV");
                break;
            case 5:
                System.out.println("En Numeros romanos es : V");
                break;                   
            case 6:
                System.out.println("En Numeros romanos es : VI");
                break;
            case 7:
                System.out.println("En Numeros romanos es : VII");
                break;
            case 8:
                System.out.println("En Numeros romanos es : VIII");
                break;
            case 9:
                System.out.println("En Numeros romanos es : IX");
                break;
            case 10:
                System.out.println("En Numeros romanos es : X");
                break;    
            default:
                System.out.println("Por favor ingrese un numero en el rango estipulado");
        }
        
    }
    
}
