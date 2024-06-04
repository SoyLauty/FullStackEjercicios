/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el 
usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter 
tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos 
(llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().*/

import java.util.Scanner;

public class Guia2Ejercicio7 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lecturasCorrectas = 0;
        int lecturasIncorrectas = 0;
        
        System.out.println("Ingrese las cadenas (máximo 5 caracteres, comenzando con X y terminando con O):");
        boolean finalizado = false;
        
        while(!finalizado){
        
            String cadena = sc.next();
            
            if (cadena.equals("&&&&&")){
        
            finalizado = true;
            
          } else if (esCadenaValida(cadena)){
              lecturasCorrectas++;
              
          } else {
          
              lecturasIncorrectas++;
          }
        }   
        
        System.out.println("Informe:");
        System.out.println("Lecturas correctas: " + lecturasCorrectas);
        System.out.println("Lecturas incorrectas: " + lecturasIncorrectas);
        
    }
    
    public static boolean esCadenaValida(String cadena){
    
        //Verificar Longitud
        if (cadena.length() != 5){
        
            return false;
        }
        
        //Verificar primer y ultimo caracter
        if (cadena.charAt(0) != 'X' || cadena.charAt(4) != 'O'){
        
            return false;
        }
        
        return true;
    } 
    
}
