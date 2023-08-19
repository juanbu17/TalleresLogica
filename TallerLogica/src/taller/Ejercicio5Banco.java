/*
 5. Escriba un programa que le permita a un cliente de un banco navegar
con distintas opcines , dependiendo de la transacción que requiera:
-Consultar saldo
-Realizar transferencia 
-Cambiar clave
-Bloquear producto
-Realizar donación

*/
package taller;

import java.util.Scanner;

/**
 *
 * @author Juan Buitrago
 */
public class Ejercicio5Banco {
    static int pass = 123456;
    public static void main(String[] args) {
        
        int Newpass;
        int nueva;
        boolean isLogged = loguin();
        if (isLogged){
           
        }
        
        int saldo = 300000;
        Scanner leaopc = new Scanner(System.in);        
        Scanner leerreti = new Scanner(System.in);
        Scanner newpass = new Scanner(System.in);
        /* opcion while*/
        boolean cierre = true;
        boolean bloqueo=true;
   
        while (cierre == true) {

            /*opciones switch*/
            System.out.println("");
            System.out.println("Seleccione la operacion");
            System.out.println("");
            System.out.println("1. Colsultar Saldo");
            System.out.println("2. Realizar Transferencia");
            System.out.println("3. Cambiar clave");
            System.out.println("4. Bloquear producto");
            System.out.println("5. Realizar Donacion");            
            System.out.println("6. Salir");
            int opc;
            opc = leaopc.nextInt();

            switch (opc) {
                case 1:
                    /*-Consultar saldo*/
                    System.out.println("Su saldo actual es: "+saldo);
                    break;

                case 2:
                     /*-Realizar transferencia*/
                    System.out.println("Ingrese  Valor a transferir");
                    int transfiere;
                     transfiere = leerreti.nextInt();
                
                    if (transfiere <= 50000 && saldo>=transfiere) {
                        System.out.println("Saldo Anterior: " + saldo);
                        System.out.println("El valor a transferir es: " + transfiere);
                        System.out.println("");
                        System.out.println("Saldo a la fecha: "  +transferir(saldo,transfiere));
                        System.out.println("");
                        
                        saldo = transferir(saldo, transfiere);
                        System.out.println("");
                    } else if(transfiere>saldo){
                        System.out.println("Saldo insuficiente");
                        System.out.println("");
                        
                    } else{
                        System.out.println("Supera valor maximo de 50000");
                        System.out.println("");
                    }

                    break;

                case 3:
                    /*-Cambiar clave*/
                      
                    System.out.println("Ingrese la nueva clave:");                      
                    Newpass = newpass.nextInt();
                   clave(Newpass);
                    
                                         

                    break;
                    
                case 4:
                    /*-Bloquear producto*/
                    
                     System.out.println("Ha decidido bloquear el producto");
                    System.out.println("");
                    bloqueo = false;
                    cierre=false;
                    System.out.println("Producto bloqueado");
                   
                    break;
                    
                case 5:
                    /*-Realizar donación*/
                    System.out.println("Ingrese  Valor a Donar");
                    int dona;
                     dona = leerreti.nextInt();
                
                    if (dona <= 50000 && saldo>=dona) {
                        System.out.println("Saldo Anterior: " + saldo);
                        System.out.println("El valor a donar es: " + dona);
                        System.out.println("");
                        System.out.println("Saldo a la fecha: "  +donar(saldo,dona));
                        System.out.println("");
                        
                        saldo = donar(saldo, dona);
                        System.out.println("");
                    } else if(dona>saldo){
                        System.out.println("Saldo insuficiente");
                        System.out.println("");
                        
                    } else{
                        System.out.println("Supera valor maximo de 50000");
                        System.out.println("");
                    }
                   
                    break;
                case 6:
                    /*salir*/
                     System.out.println("Hasta pronto");
                    System.out.println("");
                    cierre = false;
                      default:
                    System.out.println("Seleccione un valor correcto entre 1 y 5");
                    System.out.println("");
            }

        }

    }
    
    /*funcion cambio de clave*/
    public static int clave( int Newpass) {
        pass = Newpass;
        System.out.println("Cambio de contraseña exitoso"); 
        return pass;
    }
    
/*funcion donar*/
    public static int donar(int saldo, int dona) {
        saldo = saldo - dona;
        return saldo;
    }
/*funcion transferir*/
    public static int transferir(int saldo, int transfiere) {
        saldo = saldo - transfiere;
        return saldo;
        

       
    }
    
/* funcion seccion de loguin*/    
     public static boolean loguin(){
             Scanner sc = new Scanner(System.in);
               
     
                     
            System.out.println("Bienvenido");
        System.out.println("Ingrese la contrasena:");
        int contraseña = sc.nextInt();
        
        if( pass==contraseña){
             
            System.out.println("Bienvenido al Cajero");
            System.out.println("");
            return true;
        }else{
            System.out.println("Contrasena incorrectas "); 
            return loguin();
        }
        
        
    }
        } 
     
     
     
     
     
     
     
     
    

