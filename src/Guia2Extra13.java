/*Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y 
termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
*/

import java.util.Scanner;

public class Guia2Extra13 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicitar la altura de la escalera al usuario
        System.out.print("Introduce la altura de la escalera: ");
        int altura = sc.nextInt();

        // Generar la escalera de números
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Imprimir nueva línea después de cada fila
        }
    }
    
}
