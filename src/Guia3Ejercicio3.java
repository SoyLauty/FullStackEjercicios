/*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, 
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir 
que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/

import java.util.Scanner;

public class Guia3Ejercicio3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Euros que desea convertir: ");
        double euros = sc.nextDouble();
        
        System.out.println("¿A que Moneda desea hacer el cambio?");
        String moneda = sc.next();
        
        convertirMonedas(euros,moneda);
    }
    
    
    public static void convertirMonedas(double euros, String moneda){
    
        double cambio;
        
        switch(moneda.toLowerCase()){
        
            case "dolares":
                cambio = euros * 128611;
                System.out.println("Usted Tiene " + cambio + " dolares.");
                break;
            
            case "yenes":
                cambio = euros * 129.852;
                System.out.println("Usted Tiene " + cambio + " yenes");
                break;
                
            case "libras":
                cambio = euros * 0.86;
                System.out.println("Usted Tiene " + cambio + " libras.");
                break;
        }
    }
    
}
