import java.util.Scanner;
import java.util.LinkedList;

public class MenuIngenieria {
    LinkedList<ComputadorPortatil> listaPCs = new LinkedList<>();
    LinkedList<Estudiantes_Ingenieria> listaEstudiantes = new LinkedList<>();
    Estudiantes_Ingenieria estI = new Estudiantes_Ingenieria();
    ComputadorPortatil pc = new ComputadorPortatil();
    MenuIngenieria menuing = new MenuIngenieria();
    String cedula;
    String nombre;
    String apellido;
    String telefono;
    int semestre;
    float promedio;
    String serial;
    String marca;
    float tamaño;
    float precio;
    String sistema;
    String procesador;
    Scanner sc = new Scanner(System.in);

    public MenuIngenieria MenuIng() {
        int opcion;
        do {
            System.out.println("\nBienvenido al Menú de Ingenierías");
            String menuI = "\n--- SUB-MENÚ ---\n"
                    + "1. Registrar préstamo de equipo\n"
                    + "2. Modificar préstamo de equipo (Por serial o cédula)\n"
                    + "3. Devolución de equipo (se elimina el registro)\n"
                    + "4. Buscar equipo (Por serial o cédula)\n"
                    + "5. Volver al menú principal\n"
                    + "Ingrese la opción deseada: ";

            System.out.print(menuI);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Registrando préstamo...");
                    registro(listaEstudiantes);
                    RegistroPC(listaPCs);
                    break;
                case 2:
                    System.out.println("Modificando préstamo...");
                    Modificar(menuI, listaEstudiantes);
                    break;
                case 3:
                    System.out.println("Procesando devolución...");
                    break;
                case 4:
                    System.out.println("Buscando equipo...");
                    Buscar(listaEstudiantes, menuI);
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

    public LinkedList<Estudiantes_Ingenieria> registro(LinkedList<Estudiantes_Ingenieria> lista_ing) {
        System.out.println("REGISTRAR PRÉSTAMO DE EQUIPO");
        Estudiantes_Ingenieria estI = new Estudiantes_Ingenieria();
        do {
            System.out.println("Ingrese el número de cédula: ");
            cedula = sc.next();

            if (!cedula.matches("[a-zA-Z0-9]+")) {
                System.out.println("Cédula inválida, vuelva a intentarlo.");
            }
        } while (!cedula.matches("[a-zA-Z0-9]+"));

        boolean encontrado = false;

        for (Estudiantes_Ingenieria estudiantes_Ingenieria : lista_ing) {
            if (estudiantes_Ingenieria.getCedula().equals(cedula)) {
                System.out.println("Este estudiante ya tiene registro de préstamo de equipo.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            estI.setCedula(cedula);
            System.out.println("Cédula registrada exitosamente.");
        }

        do {
            System.out.println("Ingrese el nombre: ");
            nombre = sc.next();
            if (!nombre.matches("^[a-zA-Z ]+$")) {
                System.out.println("Nombre inválido, vuelva a intentarlo.");

            } else {
                estI.setNombre(nombre);

            }

        } while (!nombre.matches("^[a-zA-Z ]+$"));

        do {
            System.out.println("Ingrese el apellido: ");
            apellido = sc.next();
            if (!apellido.matches("^[a-zA-Z ]+$")) {
                System.out.println("Apellido inválido, vuelva a intentarlo.");

            } else {
                estI.setApellido(apellido);
            }

        } while (!apellido.matches("^[a-zA-Z ]+$"));

        do {
            System.out.println("Ingrese el número de teléfono: ");
            telefono = sc.next();
            if (!telefono.matches("\\d{7,10}")) {
                System.out.println("Teléfono inválido, ingrese de 7 a 10 dígitos.");
            } else {
                estI.setTelefono(telefono);
            }

        } while (!telefono.matches("\\d{7,10}"));

        do {
            System.out.println("Ingrese el número de semestre: ");
            semestre = sc.nextInt();
            if (semestre < 0 || semestre > 12) {
                System.out.println("Semestre inválido, ingrese un valor entre 1 y 12.");
            } else {
                estI.setSemestre(semestre);
            }

        } while (semestre < 0 || semestre > 12);

        do {
            System.out.println("Ingrese el promedio: ");
            String prom = sc.next();
            prom = prom.replace(',', '.');

            try {
                promedio = Float.parseFloat(prom);

                if (promedio < 0.0 || promedio > 5.0) {
                    System.out.println("Promedio inválido, ingrese un valor entre 0.0 y 5.0.");
                } else {
                    estI.setPromedio(promedio);
                    break;

                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número decimal.");
            }
        } while (true);

        do {
            do {
                System.out.println("Ingrese el número de serial: ");
                serial = sc.next();

                if (!serial.matches("[a-zA-Z0-9]+")) {
                    System.out.println("El número de serie debe ser alfanumérico.");
                }
            } while (!serial.matches("[a-zA-Z0-9]+"));

            encontrado = false;
            for (Estudiantes_Ingenieria estudiantes_Ingenieria : lista_ing) {
                if (estudiantes_Ingenieria.getSerial().equals(serial)) {
                    System.out.println("Este equipo ya está prestado.");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                estI.setSerial(serial);
            }

        } while (encontrado);

        lista_ing.add(estI);
        return lista_ing;

    }

    public LinkedList<ComputadorPortatil> RegistroPC(LinkedList<ComputadorPortatil> lista_PC) {
        pc.setSerial(serial);
        do {
            System.out.println("Ingrese la marca del computador: ");
            marca = sc.next();
            if (!marca.matches("^[a-zA-Z ]+$")) {

            } else {
                pc.setMarca(marca);

            }
        } while (!marca.matches("^[a-zA-Z ]+$"));
        // falta verificacion que no este prestado

        do {
            System.out.println("Ingrese el tamaño del computador en pulgadas: ");
            tamaño = sc.nextFloat();
            if (tamaño <= 0.0) {

            } else {
                pc.setTamaño(tamaño);

            }
        } while (tamaño <= 0.0);

        do {
            System.out.println("Ingrese el precio del computador: ");
            precio = sc.nextFloat();
            if (precio <= 0.0) {

            } else {
                pc.setPrecio(precio);

            }
        } while (precio <= 0.0);

        int opcion;
        do {

            String menu1 = "\n--  Sistema Operativo --\n"
                    + "1. Windows 7\n"
                    + "2. Windows 10\n"
                    + "3. Windows 11\n"
                    + "Seleccione una opción";
            System.out.println(menu1);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    pc.setSistema("Windows 7");
                    break;

                case 2:
                    pc.setSistema("Windows 10");
                    break;
                case 3:
                    pc.setSistema("Windows 11");
                    break;

                default:
                    System.out.println("opción invalida");
                    break;
            }

        } while (opcion < 1 || opcion > 3);

        do {

            String menu2 = "\n-- Procesador computador--\n"
                    + "1. AMD Ryzen\n"
                    + "2. Intel core i5\n"
                    + "Seleccione una opción";

            System.out.println(menu2);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    pc.setProcesador("AMD Ryzen");
                    break;

                case 2:
                    pc.setProcesador("Intel core i5");
                    break;

                default:
                    System.out.println("opción invalida");
                    break;
            }

        } while (opcion < 1 || opcion > 2);

        lista_PC.add(pc);

        return lista_PC;
    }

    public Estudiantes_Ingenieria Buscar(LinkedList<Estudiantes_Ingenieria> lista_ing, String BuscarSerial) {
        if (lista_ing == null || lista_ing.isEmpty()) {
            System.out.println("La lista de estudiantes está vacía ");
            return null;
        }
        System.out.println("Ingrese el número de serial o  cédula a buscar: ");
        String buscar = sc.next();
        Estudiantes_Ingenieria objresult = new Estudiantes_Ingenieria();
        for (Estudiantes_Ingenieria estudiantes_Ingenieria : lista_ing) {
            if (estudiantes_Ingenieria.getSerial().equalsIgnoreCase(buscar) ||
                    estudiantes_Ingenieria.getCedula().equalsIgnoreCase(buscar)) {
                System.out.println("Equipo encontrado: " + estudiantes_Ingenieria.toString());
                objresult.setCedula(estudiantes_Ingenieria.getCedula());
                objresult.setNombre(estudiantes_Ingenieria.getNombre());
                objresult.setApellido(estudiantes_Ingenieria.getApellido());
                objresult.setTelefono(estudiantes_Ingenieria.getTelefono());  
                objresult.setSemestre(estudiantes_Ingenieria.getSemestre());  
                objresult.setPromedio(estudiantes_Ingenieria.getPromedio());
      

            } else {
                System.out.println("El equipo no se encontro");
            }

        }
        return objresult;

   
    }
    
    public LinkedList<Estudiantes_Ingenieria> Modificar(String nombre, LinkedList<Estudiantes_Ingenieria> lista_ing) {
        Estudiantes_Ingenieria o = new Estudiantes_Ingenieria();
        o = menuing.Buscar(lista_ing, nombre);
        int opcion = 0;
        if (!o.getNombre().isEmpty()) {

            for (Estudiantes_Ingenieria p : lista_ing) {

                if (p.getNombre().equalsIgnoreCase(o.getNombre())) {
                    System.out.println("Ingrese 1: Para modificar telefono:");
                    System.out.println("Ingrese 2: Para modificar el semestre: ");
                    System.out.println("Pulse cualquier numero para modificar los dos registros:");

                    while (!sc.hasNextInt()) {
                        System.out.println("Ingrese un numero");
                        sc.nextInt();

                    }
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Ingrese el numero de telefono:");
                            telefono=sc.nextLine();
                            if (!telefono.matches("[0-9]+")) {
                                System.out.println("Telefono invalido, vuelva a intentarlo.");
                            } else {
                                p.setTelefono(telefono);  
                            }
                          

                            break;
                        case 2:
                            System.out.println("Ingrese el semestre:");
                            semestre=sc.nextInt();
                            if (!telefono.matches("[0-9]+")) {
                                System.out.println("Semestre invalido, vuelva a intentarlo.");
                            } else {
                                p.setSemestre(semestre);
                            }
                           
                        default:
                        System.out.println("Ingrese el telefono:");
                        telefono = sc.nextLine();
                        if (!telefono.matches("[0-9]+")) {
                            System.out.println("Telefono invalido, vuelva a intentarlo.");
                        } else {
                            p.setTelefono(telefono);  // Actualizar el teléfono
                        }

                        System.out.println("Ingrese el semestre:");
                        semestre = sc.nextInt();
                        if (semestre < 1 || semestre > 12) {
                            System.out.println("Semestre invalido, vuelva a intentarlo.");
                        } else {
                            p.setSemestre(semestre);  
                        }
                            break;
                    }

                }

            }
        }

        return lista_ing;
    }

    public LinkedList<Estudiantes_Ingenieria> devolución(LinkedList<Estudiantes_Ingenieria> lista_ing) {
        System.out.println("Devolver computador");
        
       
        return lista_ing;
    }

}