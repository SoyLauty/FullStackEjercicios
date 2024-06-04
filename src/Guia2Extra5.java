/*Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que 
represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
*/

import java.util.Scanner;

public class Guia2Extra5 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la Letra Correspondiente a su Plan: ");
        char letra = sc.next().charAt(0);
        
        System.out.println("Ingrese el Costo del Tratamiento: ");
        double costoTratamiento = sc.nextInt();
        
        double importePagar = costoTratamiento;
        
        
        if ( letra == 'A' || letra == 'a' ){
        
            importePagar = costoTratamiento * 0.5;
            
        } else if (letra == 'B' || letra == 'b'){
        
            importePagar = costoTratamiento * 0.65;
            
        } else if (letra == 'C' || letra == 'c'){
        
            importePagar = costoTratamiento;
            
        } else {
        
            System.out.println("Clase de Socio no Valida");
            return;
        }
                
        System.out.println("Importe a Pagar: " + importePagar);
    }
    
}
