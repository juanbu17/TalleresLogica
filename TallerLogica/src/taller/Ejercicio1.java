
package taller;

import java.util.Scanner;

/**
 *
 * @author Juan Buitrago
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
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
        
        
        
        

        
        
        

        
        
        
        
        
        
        




    }

}
