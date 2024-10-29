
import java.util.LinkedList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Menu menu=new Menu();
        Scanner sc= new Scanner(System.in);
LinkedList<Estudiantes_Ingenieria> estIng = new LinkedList<>();
LinkedList<Estudiantes_Diseño>estuDis = new LinkedList<>();
LinkedList<ComputadorPortatil>PC= new LinkedList<>();
        System.out.println("Sistema de Gestion de prestamo equipos electronicos San Juan de Dios" );
        
        int opcion;
        MenuIngenieria a = new MenuIngenieria();
        MenuDiseño b = new MenuDiseño();

       //estIng=a.Importar_Ingenieria();
       //PC=a.importarComputadores();

        do {
            
            String menuP= "\n--- Menu Principal ---\n" 
                                
            +"1. Estudiantes de Ingeniería\n" 
            +"2. Estudiantes de Diseño\n"                   
            +"3. Imprimir Inventario Total\n"                   
            +"4. Salir del Programa\n" 
                                
            +"Seleccione una opción : ";
            System.out.print(menuP);
            try {
                
            opcion = sc.nextInt();
            switch (opcion) {  
            case 1:
            a.MenuIng();
            
            break;
            case 2:
            b.MenuDiseño();
            break;
            case 3:
            break;
            case 4:
            System.out.println("Gracias por usar el sistema, Hasta pronto");
            break;
            default:
            System.out.println("Opcion invalida, Intente de nuevo");
            break;

            }
        } catch (Exception e) {
            System.out.println("\nError: Por favor, ingrese un número válido.");
            sc.nextLine(); 
            opcion = 0; 
        }

            }while (opcion != 4);
        }
       
    }
