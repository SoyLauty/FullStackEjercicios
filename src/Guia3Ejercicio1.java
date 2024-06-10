/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, 
multiplicar y dividir. La aplicación debe tener una función para cada operación matemática y deben 
devolver sus resultados para imprimirlos en el main. 
*/

import java.util.Scanner;

public class Guia3Ejercicio1 {

    // La directiva static permite el acceso a métodos y variables de clase sin la necesidad de instanciar un objeto de dicha clase
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        System.out.println("Ingrese el primer numero: ");
        int a = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int b = sc.nextInt();
        
        System.out.println("Elija su operacion matematica: ");
        String variable = sc.next();
        
        
        switch(variable){
        
            case "suma":
                System.out.println(suma(a, b));
               break;
            
            case "resta":
                System.out.println(resta(a,b));
                break;
              
            case "multiplicacion":
                System.out.println(multiplicacion(a,b));
                break;
                
            case "division":
                System.out.println(division(a,b));
                break;
        }
        
        
    }
    
    public static int suma(int num1,int num2){
        
        int resultado = num1 + num2;
        
        return resultado;
    }
    
    public static int resta(int num1,int num2){
    
        int resultado = num1 - num2;
        
        return resultado;
    }
    
    public static int multiplicacion(int num1,int num2){
    
        int resultado = num1 * num2;
        
        return resultado;
    }
    
    public static int division(int num1,int num2){
    
        int resultado = num1 / num2;
        
        return resultado;
    }
    
}
