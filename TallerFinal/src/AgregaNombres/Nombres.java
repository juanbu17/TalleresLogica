 //trabajo final logica:
/*     Crear una funcionalidad que agregue nombre a un arraylist de manera
       dinamica preguntando si desea agregar un nuevo nombre ademas debe imprimir
       el listado de nombres indicando nombre # y debe permitir salir de la 
       funcionalidad       
 */
package AgregaNombres;

// @author Juan Buitrago
import java.util.ArrayList;
import java.util.Scanner;

public class Nombres {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        boolean abre = true;
        int fila = 0;
        ArrayList<String> nombres = new ArrayList<String>();
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Nombres: " + nombres.get(i));
        }
     
        while (abre) {
            System.out.println("\033[31m-----Menu de Opciones-----");

            System.out.println("--------------------------");
            System.out.println("1. Ingresar persona");
            System.out.println("");
            System.out.println("2. Mostrar Listado");
            System.out.println("");
             System.out.println("3. Mostra la Ubicacion");
            System.out.println("");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.print("\033[31mDigite su opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:              
                    Scanner lea = new Scanner(System.in);
                    System.out.println("\033[34mHas seleccionado Ingresar persona");
                    System.out.println("Ingrese el nombre : ");
                    String nombre1 = lea.nextLine();
                    leer.nextLine();
                    nombres.add(nombre1);
                    System.out.println("El nombre ingresado es: " + nombre1);//linea solo para probar 
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("\033[34mHas seleccionado Mostrar el Listado");
                    System.out.println("Listado total ingresados:\n ");
                    System.out.println("Listado de Nombres: " + nombres.toString());
                    System.out.println("");
                    System.out.println("-------------------------------------");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    break;

                case 3:
                    Scanner leamos = new Scanner(System.in);
                    System.out.println("\033[34mHas seleccionado Mostrar la ubicacion");
                    System.out.println("Ingrese Nombre a Buscar");
                    String read;
                    read = leamos.nextLine();
                    
                    
                        for (int i = 0; i < nombres.size(); i++) {
                            if (nombres.get(i).equals(read)) {
                               System.out.println("Nombres ingresados: " + nombres.get(i)); 
                               fila = i;
                               break;
                            }
                        
                       
                        
                        }/*else {
                                System.out.println("El nombre no existe en la lista");
                                }*/
                    
                    System.out.println("\t");
                    
                    System.out.println("El nombre: " + read +" esta en "+fila);
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    break;
                    
                case 4:
                    System.out.println("\033[34mHas seleccionado Salir");
                    abre = false;
                    System.out.println("  --HASTA PRONTO!!--");
                    break;
                default:
                    System.out.println("Ingresa una opcion valida");
                    System.out.println("");
            }
        }

    }
}