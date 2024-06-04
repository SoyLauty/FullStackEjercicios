/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
*/

import java.util.Scanner;

public class Guia2Extra3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una Letra: ");
        String letra = sc.next();
        
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U") ){
        
            System.out.println("Su Letra es una Vocal");
            
        } else {
        
            System.out.println("Su Letra no es una Vocal");
        }
        
    }
    
}

// Otra forma de resolverlo es con un Switch
/* 
switch (letra){
        
            case "a" :
                System.out.println("Su letra es una vocal");
                break;
            case "e" :
                System.out.println("Su letra es una vocal");
                break;
            case "i" :
                System.out.println("Su letra es una vocal");
                break;
            case "o" :
                System.out.println("Su letra es una vocal");
                break;
            case "u" :
                System.out.println("Su letra es una vocal");
                break;  
            default:
                System.out.println("Su Letra no es una vocal");
        } */