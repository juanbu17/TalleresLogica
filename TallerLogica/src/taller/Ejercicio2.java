 /*2. Dados los lados de un rectángulo , calcular e imprimir el área y el perímetro.
Datos: base y altura
Realice el diagrama de flujo, el seudocódigo y el programa correspondiente a la 
solución de este problema. Pruebe la solución con un conjunto de datos adecuado. */
package taller;

import java.util.Scanner;

/**
 *
 * @author SERVER
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
   
 
    /*Calculo del Area*/ 
 
        System.out.println("");
        System.out.println("-----Area y perimetro-----");
        System.out.println("");
           
        int largo;         
        int ancho;
        
        int lado1;
        int lado2;
        int lado3;
        int lado4;
        
        
        System.out.println("Ingrese el largo");
            largo= leer.nextInt();
            
        System.out.println("Ingrese el ancho");
            ancho= leer.nextInt();
            
        System.out.println("El Area del rectangulo es: "+largo*ancho);
        System.out.println("");
        
    /*Calculo del perimetro*/
        
        System.out.println("-----Valor Perimetro-----");
        System.out.println("");
        
        System.out.println("Ingrese el lado1");
            lado1= leer.nextInt();
            
        System.out.println("Ingrese el lado2");
            lado2= leer.nextInt();
            
        System.out.println("Ingrese el lado3");
            lado3= leer.nextInt();
            
        System.out.println("Ingrese el lado4");
            lado4= leer.nextInt();
            
        System.out.println("El perimetro tiene un valor de: "+(lado1+lado2+lado3+lado4));
        System.out.println("");
}

        
        
    }
    