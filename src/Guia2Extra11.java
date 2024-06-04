/*Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos 
matemáticamente utilizando el operador de división. Nota: recordar que las variables de tipo entero truncan los números o resultados.*/

import java.util.Scanner;

public class Guia2Extra11 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();
        
        // En caso de que el número sea negativo, lo convertimos a positivo
        numero = Math.abs(numero);

        int contador = 0;
        if (numero == 0) {
            contador = 1; // Si el número es 0, tiene exactamente un dígito
        } else {
            while (numero > 0) {
                numero /= 10; // División entera por 10
                contador++;
            }
        }

        System.out.println("El número tiene " + contador + " dígitos.");
        
    }
    
}
