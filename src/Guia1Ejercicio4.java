/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */

import java.util.Scanner;

public class Guia1Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de Grados Centigrados: ");
        int grados = sc.nextInt();
        
        int formula = 32 + (9 * grados/ 5);
        
        System.out.println("Sus grados en Fahrenheit son: " + formula);
        
    }
    
}
