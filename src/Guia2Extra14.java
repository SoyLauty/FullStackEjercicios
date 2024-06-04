/*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. 
Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos para averiguar 
la media de edad de los hijos de todas las familias.*/

import java.util.Scanner;

public class Guia2Extra14 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la cantidad de familias:");
        int numFamilias = sc.nextInt();

        int totalHijos = 0;
        int totalEdad = 0;

        for (int i = 0; i < numFamilias; i++) {
            System.out.println("Introduce la cantidad de hijos de la familia " + (i + 1) + ":");
            int numHijos = sc.nextInt();

            System.out.println("Introduce la edad de cada hijo de la familia " + (i + 1) + " separados por espacios:");
            int[] edades = new int[numHijos];
            for (int j = 0; j < numHijos; j++) {
                edades[j] = sc.nextInt();
            }

            totalHijos += numHijos;
            for (int edad : edades) {
                totalEdad += edad;
            }
        }

        double mediaEdad = (double) totalEdad / totalHijos;

        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);
        
    }
    
}
