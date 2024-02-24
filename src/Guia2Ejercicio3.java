/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */

import java.util.Scanner;

public class Guia2Ejercicio3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una Frase: ");
        
        /*next() y nextLine() son métodos utilizados para leer entrada de texto desde el usuario a través 
        de la consola utilizando un objeto Scanner. La diferencia principal entre ellos radica en cómo 
        manejan los espacios en blanco y los saltos de línea.*/
        frase = sc.nextLine();
        
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        
    }
    
}
