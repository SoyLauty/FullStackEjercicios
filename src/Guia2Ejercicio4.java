
import java.util.Scanner;

/* Escriba un programa que pida una frase o palabra y valide si la primera letra 
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá 
imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.*/


public class Guia2Ejercicio4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una frase/palabra: ");
        String frase = sc.nextLine();
        
        // Obtenemos la primera letra de la frase
        String letra = frase.substring(0, 1);
        
        if (letra.equals("A") || letra.equals("a") ){
        
            System.out.println("CORRECTO");
        } else {
        
            System.out.println("INCORRECTO");
        }
    }
    
}
