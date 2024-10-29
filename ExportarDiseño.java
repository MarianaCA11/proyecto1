import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ExportarDiseño {
    public void exportarDiseño(LinkedList<Estudiantes_Diseño> lista,
            LinkedList<TabletaGrafica> ListaTG)

    {
        if (lista.isEmpty() && ListaTG.isEmpty()) {
            System.out.println("La lista esta vacia no se puede exportar el archivo");
            return;

        } else {
            try (FileWriter e = new FileWriter("RegistrosEdiseño.txt")) {
                for (Estudiantes_Diseño obj : lista) {

                    e.write("cedula: " + obj.getCedula() + "\n");
                    e.write("Nombre: " + obj.getNombre() + "\n");
                    e.write("Apellido: " + obj.getApellido() + "\n");
                    e.write("Telefono: " + obj.getTelefono() + "\n");
                    e.write("Modalidad: " + obj.getModalidad() + "\n");
                    e.write("Asignatura: " + obj.getAsignaturas() + "\n");
                    e.write("Serial: " + obj.getSerial() + "\n");

                }
                for (TabletaGrafica objpc : ListaTG) {
                    e.write("serial: " + objpc.getSerial() + "\n");
                    e.write("Marca: " + objpc.getMarca() + "\n");
                    e.write("Tamaño: " + objpc.getTamaño() + "\n");
                    e.write("Precio: " + objpc.getPrecio() + "\n");
                    e.write("Almacenamiento: " + objpc.getAlmanenamiento() + "\n");
                    e.write("Peso: " + objpc.getPeso() + "\n");
                    e.write("--------------------------------------------------------------------------------------\n");

                }

                System.out.println("Archivo exportado correctamente");

            } catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
            }

        }
    }

}
