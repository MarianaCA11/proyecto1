import java.util.Scanner;
public class MenuDiseño {
    public MenuDiseño MenuDiseño()  {
       Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nBienvenido al Menú de Diseño");
            String menuD = "\n--- SUB-MENÚ ---\n"
                + "1. Registrar préstamo de equipo\n"
                + "2. Modificar préstamo de equipo (Por serial o cédula)\n"
                + "3. Devolución de equipo (se elimina el registro)\n"
                + "4. Buscar equipo (Por serial o cédula)\n"
                + "5. Volver al menú principal\n"
                + "Ingrese la opción deseada: ";
            
            System.out.print(menuD);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Registrando préstamo...");
                    break;
                case 2:
                    System.out.println("Modificando préstamo...");
                    break;
                case 3:
                    System.out.println("Procesando devolución...");
                    break;
                case 4:
                    System.out.println("Buscando equipo...");
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 5);
        return this;
    }
}
