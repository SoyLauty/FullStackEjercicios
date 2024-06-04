/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura 
y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares. 
Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */

import java.util.Scanner;

public class Guia2Extra8 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int cuenta = 0;
        int cuentaPares = 0;
        int cuentaImpares = 0;
        
        while (true){
        
            System.out.println("Ingrese un numero entero: ");
            int numero = sc.nextInt();
            
            if (numero < 0){
            
                continue; // ignora los numeros negativos
            }
            
            cuenta++; // Si el número no es negativo, se incrementa el contador total count.
            
            if (numero % 5 == 0){
            
                break; // Detener la lectura si el número es múltiplo de 5
            }
            
            if (numero % 2 == 0){
            
                cuentaPares++;
            } else {
            
                cuentaImpares++;
            }
        }
        
        System.out.println("Cantidad de Numero Totales: " + cuenta);
        System.out.println("Cantidad de Numeros Pares: " + cuentaPares);
        System.out.println("Cantidad de Numeros Impares: " + cuentaImpares);
        
    }
    
}
