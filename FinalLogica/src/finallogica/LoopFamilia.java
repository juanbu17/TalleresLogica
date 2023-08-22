/*
2. Cree una matriz  3 * 3 en la que almacene las edades de sus familiares mas allegados.
Cree un loop que recorra e imprima la matriz.
 */
package finallogica;

import java.util.Scanner;

/**
 @author juan Buitrago
 */
public class LoopFamilia {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double[][]familia = {
            {(1.71),(1.6),(1.55)},
                {(1.8),(1.49),(1.66)},
                        {(1.9),(1.78),(1.73)}};
        System.out.println("El tamano de la matriz es: "+familia.length);
        
         for(int i=0;i<familia.length;i++){
            for(int j=0;j<familia[i].length;j++){
                System.out.print(familia[i][j] +"\t \n");
                
  
    }
}
    }
}
