/*




3. Considere que se dispone de la producción de carbón ( en toneladas) 
de los últimos 12 meses. Con estos datos se quiere calcular e imprimir el promedio
anual de toneladas.
Datos: podCarbon1, podCarbon2…podCarbon12.
Realice el diagrama de flujo y el programa correspondiente.
Pruebe con un conjunto de datos adecuados.


4. En una concesionaria automotriz se tiene información sobre las ventas realizadas a lo largo del ultimo mes. Se conoce el total de las ventas y el precio de venta de cada unidad. También se conoce que la concecionaria paga una comisión a sus vendedores de acuerdo con el precio de la unidad.

Si el precio <= 100000, la comisión es del 1.5%
Si precio > 100000 y precio <= 250000, la comisión es del 1.8%
Si precio > 250000 , la comisión es del 2.3%

Datos :

n= numero de automóviles vendidos
Precio: es el precio de la venta i (1<= i <= n) y precio > 0.

Realice un diagrama de flujo y escriba el programa que resuelva el problema. De ser necesario pruebe la solución con un conjunto de datos adecuados.

 */
package taller;

/**
 *
 * @author Juan Buitrago
 */
public class Solucion {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        int operacion1;
        float operacion2;
        float operacion3;
        boolean oper4 = (25 > 18);
        boolean oper5 = (3 + (2.5 * 4)) / 3 != (4 * 5.2) - 3.8;
        boolean oper6 = (8.5/3.2)+6.5-((2.3*5)/6) >= 15.8 && (21.4<81/(4+2));
        
                        
/*Realice las siguientes operaciones:*/
        
        /*operacion 1  3+8*5-6/3 */
        operacion1 = 3 + (8 * 5) - (6 / 3);
        System.out.println("El resultado de la operacion 1 es: " + operacion1);

        /*operacion 2*/
        operacion2 = (2.5f * 2 * 3) - (4 / 2) + 8;
        float operfloat = (float) operacion2;
        System.out.println("El resultado de la operacion 2 es: " + operfloat);

        /*operacion 3*/
        operacion3 = (2 * (6 - 2.5f)) / 3;
        float oper3float = (float) operacion3;
        System.out.println("El resultado de la operacion 3 es: " + oper3float);

        /*operacion 4    25>18  */
        System.out.println("El resultado de la operacion 25>18 es igual a: " + oper4);

        /*operacion 5    3+2.5*4/3 != 4*5.2-3.8  */
        System.out.println("El resultado de la operacion 25>18 es igual a: " + oper5);
        
        /*operacion 6    (8.5/3.2+6.5-2.3*5/6 >= 15.8) && (21.4<81/4+2)  */
        System.out.println("El resultado de la operacion 25>18 es igual a: " + oper6);
        
        
        
        
 /*2. Dados los lados de un rectángulo , calcular e imprimir el área y el perímetro.
Datos: base y altura
Realice el diagrama de flujo, el seudocódigo y el programa correspondiente a la 
solución de este problema. Pruebe la solución con un conjunto de datos adecuado.      
    }

}
