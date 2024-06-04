/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
El programa deberá después mostrar el resultado de la suma
 */

import java.util.Scanner;

public class Guia1Ejercicio1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese 2 numeros enteros: ");
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        System.out.println(num1 + num2);
        
    }
    
}


