/*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, con la particularidad 
que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
*/


public class Guia2Extra12 {

    
    public static void main(String[] args) {
        
        // Recorremos los cientos, decenas y unidades
        for (int cientos = 0; cientos < 10; cientos++) {
            for (int decenas = 0; decenas < 10; decenas++) {
                for (int unidades = 0; unidades < 10; unidades++) {
                    // Convertimos los dígitos a caracteres y reemplazamos el 3 por E
                    char c = (cientos == 3) ? 'E' : Character.forDigit(cientos, 10);
                    char d = (decenas == 3) ? 'E' : Character.forDigit(decenas, 10);
                    char u = (unidades == 3) ? 'E' : Character.forDigit(unidades, 10);
                    
                    // Mostramos el contador en el formato X-X-X
                    System.out.println(c + "-" + d + "-" + u);
                }
            }
        }
    }
    
}
