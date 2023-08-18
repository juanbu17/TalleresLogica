/*
6. Escriba un programa que imprima los números hasta el 200 de dos en dos.
*/
package taller;

import java.util.Scanner;

/**
 *
 * @author Juan Buitrago
 */
public class Ejercicio6Num200DosENDos {
        public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero menor a 200");
         num = leer.nextInt();
            System.out.println("");
        while(num<=200 ){
            System.out.println(num);
           num++;
               if(num%2==0){
                   System.out.println(num);
         }else{
                 num++;
               }
        }
    }
    
}
