/* Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.*/

import java.util.Scanner;

public class Guia2Ejercicio2 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String cadena1 = "eureka";
         
        System.out.println("Ingrese una frase: ");
        String cadena2 = sc.nextLine();
        
        if (cadena2.equals(cadena1)){
        
            System.out.println("CORRECTO");
        } else {
        
            System.out.println("INCORRECTO");
        }
    }
    
}
