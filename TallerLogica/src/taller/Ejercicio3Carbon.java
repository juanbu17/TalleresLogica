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
public class Ejercicio3Carbon {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
        int meses=1;  //contador      
        float prodcar=0;//suma de totales
        float prod;
        
        
        while(meses<=12){
            System.out.println("Ingrese la produccion del mes:"+meses);
            prod = leer.nextFloat();
            prodcar +=prod;
            meses++;            
        }
        float promedio = prodcar/12;
        System.out.println("Total produccion anual: "+prodcar);
        System.out.println("El promedio anual es de:"+ promedio);


    }
}
