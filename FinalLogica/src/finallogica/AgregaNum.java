/*
6. Empleando do- while, cree una funcionalidad que muestre permita 
agregar de manera continua 7 números a una lista y salga de la misma al finalizar. 

7. Del ejercicio anterior cree un loop que recorra la lista e imprima los elementos.
 */
package finallogica;

import java.util.Scanner;



/**
 @author Juan Buitrago
 */
public class AgregaNum {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System. in);
int [] numerosArray = new int [7];
int contar =0;


System. out.println ("entrar 7 numeros");
do { if (contar >=numerosArray. length) {
    System.out.print("lista");
break;
}
    System.out.println("entre siguiente numero");
int numeros = sc.nextInt ();
numerosArray [contar] = numeros;
contar++;
} while (true);

  
for(int i=0;i<contar;i++)
System. out.println(numerosArray [i]) ;
      
        
    }
}

