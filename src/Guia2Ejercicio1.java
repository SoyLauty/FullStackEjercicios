
/*Crear un programa que dado un número determine si es par o impar.*/

import java.util.Scanner;


public class Guia2Ejercicio1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        if (num % 2 == 0){
        
            System.out.println("Su numero es Par");
        } else {
        
            System.out.println("Su numero es Impar");
        }
    }
    
}
