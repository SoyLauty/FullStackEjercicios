/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
import java.util.Scanner;

public class Guia1Ejercicio5 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int num = sc.nextInt();
       
        System.out.println(num * 2);
        System.out.println(num * 3);
        System.out.println(Math.sqrt(num));
    }
    
}
