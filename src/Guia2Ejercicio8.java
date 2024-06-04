/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:

* * * *
*     *
*     *
* * * *

 */

import java.util.Scanner;

public class Guia2Ejercicio8 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del Cuadrado: ");
        int num = sc.nextInt();
        
        // Dibujar la primera fila de asteriscos
        for (int i = 0 ; i < num; i++) {
            System.out.print("* ");
        }
        System.out.println(); // Nueva línea después de la primera fila
        
        // Dibujar las filas intermedias con asteriscos y espacios
        for (int i = 0; i < num - 2; i++) {
            System.out.print("* "); // Asterisco al principio de la fila
        }
        
        // Espacios en medio de la fila
            for (int j = 0; j < num - 2; j++) {
                System.out.print("  "); // Dos espacios para dejar espacio para el asterisco en la última columna
            }
            
            System.out.println("*"); // Asterisco al final de la fila
            
            
            // Dibujar la última fila de asteriscos
        for (int i = 0; i < num; i++) {
            System.out.print("* ");
        }
        
    }
    
}
