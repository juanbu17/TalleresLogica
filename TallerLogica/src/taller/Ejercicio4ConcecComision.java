/*
4. En una concesionaria automotriz se tiene información sobre las ventas 
realizadas a lo largo del ultimo mes.
- Se conoce el total de las ventas 
- y el precio de venta de cada unidad.
También se conoce que la concecionaria paga una 
- comisión a sus vendedores de acuerdo con el precio de la unidad.

Si el precio <= 100000, la comisión es del 1.5%
Si precio > 100000 y precio <= 250000, la comisión es del 1.8%
Si precio > 250000 , la comisión es del 2.3%

Datos :

n= numero de automóviles vendidos
Precio: es el precio de la venta i (1<= i <= n) y precio > 0.

Realice un diagrama de flujo y escriba el programa que resuelva el problema.
De ser necesario pruebe la solución con un conjunto de datos adecuados.

 */
package taller;

import java.util.Scanner;

/**
 *
 * @author Juan Buitrago
 */
public class Ejercicio4ConcecComision {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont=1;
        int ventas = 0;
        int vta;
        System.out.println("Ingrese cantidad vendida: ");
        vta = leer.nextInt();//cantidad vendida
        

        

        System.out.println("La cantidad de ventas fue: "+vta);
        
           while(cont<=vta){
            System.out.println("Ingrese el valor de la venta "+cont);
            float v= leer.nextFloat();
            ventas +=v;
            cont++;
               System.out.println("Acumulado ventas: $"+ventas);
            
          
              
       
        }
                /*seccion comision*/
              
        float comision1 = ventas*0.015f;
        float comision2 = ventas*0.018f;
        float comision3 = ventas*0.023f;
               
               
               if(ventas<=100000000){
                   System.out.println("Usted se ha ganado una comision de: $"+comision1);
               } else if(ventas>100000&&ventas<=250000000){
                   System.out.println("Usted se ha ganado una comision de: $"+comision2);
               }else{
                   System.out.println("Usted se ha ganado una comision de: $"+comision3);
               }
        
    }
        
    }     

