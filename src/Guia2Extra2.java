/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A continuación, realizar 
las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
*/

public class Guia2Extra2 {

   
    public static void main(String[] args) {
        
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        
        System.out.println("Valores iniciales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        
        int aux = B;
        
        /*
        auxiliar se usa para guardar temporalmente el valor de B.
        B toma el valor de C.
        C toma el valor de A.
        A toma el valor de D.
        D toma el valor que estaba en B (guardado en auxiliar).
        */
        
        B = C;
        C = A;
        A = D;
        D = aux;
        
        
        System.out.println("Valores finales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        
        
    }
    
}
