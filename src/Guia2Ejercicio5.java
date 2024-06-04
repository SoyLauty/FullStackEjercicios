/*Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.*/

import java.util.Scanner;

public class Guia2Ejercicio5 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite: ");
        int limite = sc.nextInt();
        
        int numero;
        int suma = 0;
        int contador = 0;
        
        while (suma <= limite){
        
            contador++;
            System.out.println("Ingrese el numero que desea sumar: ");
            numero = sc.nextInt();
            suma += numero;
        }
        
        System.out.println("La suma de los numeros introducidos supera el limite.");
        
        System.out.println("Suma Total: " + suma);
    }
    
}
