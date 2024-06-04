/*Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
El programa debe indicar al usuario si su respuesta es o no correcta. 
En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.*/

import java.util.Scanner;

public class Guia2Extra10 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Generar dos números aleatorios entre 0 y 10
        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);
        
        int resultado = num1 * num2;
        int respuesta;
        
        do {
        
            // Solicitar al usuario que adivine el resultado
            System.out.print("¿Cuál es el resultado de " + num1 + " * " + num2 + "? ");
            respuesta = sc.nextInt();

            // Verificar si la respuesta es correcta
            if (respuesta == resultado) {
                System.out.println("¡Correcto! " + num1 + " * " + num2 + " = " + resultado);
            } else {
                System.out.println("Incorrecto. Intenta de nuevo.");
                
            }
        } while (respuesta != resultado);
        
    }
    
}
