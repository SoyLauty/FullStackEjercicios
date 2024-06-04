/*Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo 
que calcule el cociente y el residuo usando sólo restas. Método: 
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, 
y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/

import java.util.Scanner;

public class Guia2Extra9 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese el dividendo
        System.out.print("Ingrese el dividendo (mayor que uno): ");
        int dividendo = sc.nextInt();

        // Solicitar al usuario que ingrese el divisor
        System.out.print("Ingrese el divisor (mayor que uno): ");
        int divisor = sc.nextInt();

        // Verificación de entrada
        if (dividendo > 1 && divisor > 1) {
            // Llamada al método para obtener el resultado
            int[] resultado = dividirPorRestas(dividendo, divisor);

            // Imprimir resultados
            System.out.println("Cociente: " + resultado[0]);
            System.out.println("Residuo: " + resultado[1]);
        } else {
            System.out.println("El dividendo y el divisor deben ser mayores que uno.");
        }

    }

    public static int[] dividirPorRestas(int dividendo, int divisor) {
        int cociente = 0;
        int residuo = dividendo;

        // Restar el divisor del dividendo repetidamente
        while (residuo >= divisor) {
            residuo -= divisor;
            cociente++;
        }

        // Devolver el cociente y el residuo
        return new int[]{cociente, residuo};
        
    }
    
}
