/*3. Considere que se dispone de la producción de carbón ( en toneladas) 
de los últimos 12 meses. Con estos datos se quiere calcular e imprimir el promedio
anual de toneladas.
Datos: podCarbon1, podCarbon2…podCarbon12.
Realice el diagrama de flujo y el programa correspondiente.
Pruebe con un conjunto de datos adecuados.*/
package taller;

import java.util.Scanner;

/**
 *
 * @author Juan Buitrago
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        float prodCarbon1;
        float prodCarbon2;
        float prodCarbon3;
        float prodCarbon4;
        float prodCarbon5;
        float prodCarbon6;
        float prodCarbon7;
        float prodCarbon8;
        float prodCarbon9;
        float prodCarbon10;
        float prodCarbon11;
        float prodCarbon12;
        float promedio= prodCarbon1+3;
        
        
        System.out.println("Ingrese produccion del mes 1");
            prodCarbon1 = leer.nextFloat();
        System.out.println("Ingrese produccion del mes 2");
            prodCarbon2 = leer.nextFloat();
        System.out.println("Ingrese produccion del mes 3");
            prodCarbon3 = leer.nextFloat();
        System.out.println("Ingrese produccion del mes 4");
            prodCarbon4 = leer.nextFloat();
        System.out.println("Ingrese produccion del mes 5");
            prodCarbon5 = leer.nextFloat();
        System.out.println("Ingrese produccion del mes 6");
            prodCarbon6 = leer.nextFloat();
        System.out.println("Ingrese produccion del mes 7");
            prodCarbon7 = leer.nextFloat();
        System.out.println("Ingrese produccion del mes 8");
            prodCarbon8 = leer.nextFloat();
        System.out.println("Ingrese produccion del mes 9");
            prodCarbon9 = leer.nextFloat();
        System.out.println("Ingrese produccion del mes 10");
            prodCarbon10 = leer.nextFloat();
        System.out.println("Ingrese produccion del mes 11");
            prodCarbon11 = leer.nextFloat();
        System.out.println("Ingrese produccion del mes 12");
            prodCarbon12 = leer.nextFloat();
            
            System.out.println("Promedio Anual de toneladas: "+promedio);
        
        
        
        
        
        
        
        
        



    }
}
