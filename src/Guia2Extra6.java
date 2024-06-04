/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran 
por debajo de 1.60 mts. y el promedio de estaturas en general.
*/

import java.util.Scanner;

public class Guia2Extra6 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una Cantidad de Personas: ");
        int n = sc.nextInt();
        
        double acumularEstaturas = 0;
        double sumaEstaturas = 0;
        int contadorBajo160 = 0;
        
        for (int i = 0; i < n; i++){
        
            System.out.print("Ingrese la estatura de la persona " + (i + 1) + " en metros: ");
            double estatura = sc.nextDouble();
            
             // Esto significa: "Toma el valor actual de sumaEstaturas, súmale el valor de estatura y asigna el resultado 
             //de nuevo a sumaEstaturas".
             acumularEstaturas += estatura;
             
             if (estatura < 1.60){
             
                sumaEstaturas += estatura;
                contadorBajo160++;
             }
        }
        
        double promedioGeneral = sumaEstaturas / n;
        double promedio160 = (contadorBajo160 < 0) ? sumaEstaturas / contadorBajo160 : 0;
        
        System.out.println("El promedio de estaturas en general es: " + promedioGeneral);
        if (contadorBajo160 > 0) {
            System.out.println("El promedio de estaturas por debajo de 1.60 mts es: " + promedio160);
        } else {
            System.out.println("No hay estaturas por debajo de 1.60 mts.");
        }
    }
    
}
