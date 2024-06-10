/*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas 
ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa 
debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
*/

import java.util.Scanner;

public class Guia3Ejercicio2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String respuesta = "Si";
        
        while (respuesta.equalsIgnoreCase("Si")){
        
            System.out.println("Introduzca el Nombre de la Persona: ");
            String nombre = sc.next();
            
            System.out.println("Ingrese la Edad de la Persona: ");
            int edad = sc.nextInt();
            
              if (edad >= 18){
              
                  System.out.println("La persona " + nombre + " de " + edad + " años es mayor de edad");
              } else {
              
                  System.out.println("La persona " + nombre + " de " + edad + " años es menor de edad");
              }
              
              System.out.println("¿Desea agregar otra personas? (Si/No)");
              respuesta = sc.next();
        }
    }
    
}
