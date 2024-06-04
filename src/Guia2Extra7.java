/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
*/
import java.util.Scanner;

public class Guia2Extra7 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // WHILE
  
        System.out.print("Introduce el número de elementos (n > 0): ");
        int n = sc.nextInt();
        
        while (n <= 0) {
            System.out.print("El número de elementos debe ser mayor que 0. Inténtalo de nuevo: ");
            n = sc.nextInt();
        }
        
        int count = 0;
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        System.out.println("Introduce " + n + " números:");
        while (count < n) {
            double num = sc.nextDouble();
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
            count++;
        }

        double average = sum / n;
        
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
        System.out.println("Promedio: " + average);
        
    }
    
}

// DO WHILE
/*

    import java.util.Scanner;

public class Guia2Extra7 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n;
        do {
            System.out.print("Introduce el número de elementos (n > 0): ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("El número de elementos debe ser mayor que 0. Inténtalo de nuevo.");
            }
        } while (n <= 0);
        
        int count = 0;
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        System.out.println("Introduce " + n + " números:");
        do {
            double num = scanner.nextDouble();
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
            count++;
        } while (count < n);

        double average = sum / n;
        
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
        System.out.println("Promedio: " + average);
        

    }

}

*/