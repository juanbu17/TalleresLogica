/*
1. Cree una funcionalidad  que guarde en un array 6 nombres de compañeros,
    cree un ciclo que permita recorrerlo, muestre la extensión del mismo.
    Capture los nombres mediante el sistema.
 */
package finallogica;

import java.util.ArrayList;
import java.util.Scanner;

/**
  @author Juan Buitrago
 */
public class NombresCompa {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList <String>();
        
       
        System.out.println("Ingrese nombre1: ");
        String name1 = sc.nextLine();
      names.add (name1);
        
        System.out.println("Ingrese nombre2: ");
        String name2 = sc.nextLine();
        names.add(name2);
        
        System.out.println("Ingrese nombre3: ");
        String name3 = sc.nextLine();
              names.add(name3);
        
        System.out.println("Ingrese nombre4");
        String name4 = sc.nextLine ();
        names.add (name4);
        
        System.out.println("Ingrese nombre5");
        String name5 = sc.nextLine();
        names.add (name5);
        
        System.out.println("Ingrese nombre6");
        String name6 = sc.nextLine();
        names.add (name6);
                        
        System.out.println("Nombres " + names.toString());
        
        for(int i = 0; i< names.size(); i++){
            
            System.out.println("Nombre " + names.get(i));
            
         
            
        }
            
        
        }
                 
                 
    }
      



