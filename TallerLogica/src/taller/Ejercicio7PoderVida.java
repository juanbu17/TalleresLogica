/*
 7. Realice un programa que cada vez que  
salga el numero 5 
incremente en 1 punto la variable poder 
y cada vez que salga 3 
disminuyan la variable vida.
Implemente random para obtener números aleatorios.
*/
package taller;
/**
 *
 * @author Juan Buitrago
 */
public class Ejercicio7PoderVida {
     public static void main(String[] args) {
        
        int vida=5;
        int poder=0;
        int num=1;
        
        
        while(vida!=0){
            num = (int)(Math.random() * 10);
            if(num==3){
                vida--;
                System.out.println("Te queda: "+vida+" de vida");
            }else if(num==5){  
                poder++;
                System.out.println("Has ganado: "+ poder+" puntos");
                
            }
          
        }
        
    }
}
