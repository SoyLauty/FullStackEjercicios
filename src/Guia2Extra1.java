/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 
1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/

import java.util.Scanner;

public class Guia2Extra1 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de minutos para calcular si equivalencia: ");
        int minutosTotales = sc.nextInt();
        
        int minutosPorDia = 1440;
        int minutosPorHora = 60;
        
        int dias = minutosTotales / minutosPorDia;        
        //Necesito saber cuanto sobra de la operacion dias para convertirlo en horas
        int horas = (minutosTotales % minutosPorDia) / minutosPorHora;
        
        System.out.println("Dias: " + dias + " Horas: " + horas);
                
    }
    
}
