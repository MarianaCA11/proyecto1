
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ExportarArchivo {

    MenuIngenieria m=new MenuIngenieria();
    public  void exportarING(LinkedList<Estudiantes_Ingenieria>lista,
    LinkedList<ComputadorPortatil>Listapc)
    
    {
if (lista.isEmpty()&& Listapc.isEmpty()) {
    System.out.println("La lista esta vacia no se puede exportar el archivo");
    m.MenuIng();
    return;
    
}else{
    try(FileWriter e =new FileWriter("RegistrosPrestamos.txt")) {
        for (Estudiantes_Ingenieria obj : lista) {

        e.write("cedula: "+ obj.getCedula() + "\n");
        e.write("Nombre: "+ obj.getNombre()+ "\n");
        e.write("Apellido: "+ obj.getApellido() + "\n");
        e.write("Telefono: " + obj.getTelefono()+ "\n");
        e.write("Smestre: "+ obj.getSemestre()+ "\n");
        e.write("Promedio: "+ obj.getPromedio() + "\n");
        e.write("Serial: " + obj.getSerial()+ "\n");
        

        }
        for (ComputadorPortatil objpc: Listapc) {
            e.write("serial: "+ objpc.getSerial() +"\n");
            e.write("Marca: "+ objpc.getMarca()+ "\n");
            e.write("Tamaño: " + objpc.getTamaño() + "\n" );
            e.write("Precio: " + objpc.getPrecio() +"\n");
            e.write("Sistema : "+ objpc.getSistema() + "\n");
            e.write("Procesador: "+ objpc.getProcesador() + "\n");
            e.write("--------------------------------------------------------------------------------------\n");

            
        }
      
      System.out.println("Archivo exportado correctamente");
      m.MenuIng();

        
    } catch (IOException e) {
        // TODO: handle exception
        e.printStackTrace();
    }

}
}
    }

