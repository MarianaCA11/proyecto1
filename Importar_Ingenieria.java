import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileReader;

public class Importar_Ingenieria {
    public LinkedList<Estudiantes_Ingenieria> importarIngenieria() {
        LinkedList<Estudiantes_Ingenieria> listaIng = new LinkedList<>();
        String rutaArchivoIng = "EstudiantesIngenieria.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivoIng))) {
            String linea;
            Estudiantes_Ingenieria ing = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("cedula: ")) {
                    if (ing != null) {
                        listaIng.add(ing);
                    }
                    ing= new Estudiantes_Ingenieria();
                    ing.setCedula((linea.substring(8)));
                }else if(linea.startsWith("nombre: ")){
                    if (ing !=null) {
                        ing.setNombre(linea.substring(8));
                    }

                } else if(linea.startsWith("Apellido:")){
                    if (ing != null) {
                        ing.setApellido(linea.substring(10));
                        
                    }
                }else if(linea.startsWith("Telefono: ")){
                    if(ing !=null){
                        ing.setTelefono(linea.substring(9));
                    }
                }else if(linea.startsWith("Semestre: ")){
                    if(ing !=null){
                        ing.setSemestre(Integer.parseInt(linea.substring(10)));
                    }
                }else if(linea.startsWith("Promedio: ")){
                    if (ing !=null) {
                        ing.setPromedio(Float.parseFloat(linea.substring(10)));
                        
                    }
                }else if(linea.startsWith("serial: ")){
                    if (ing !=null) {
                    ing.setSerial(linea.substring(8));
                    }
                }
                if (ing != null) {
                    listaIng.add(ing);
                    ing = null;
                }

                System.out.println("Archivo Importado correctamente");
            }

        } catch (Exception e) {
            // TODO: handle exception
        }



        return listaIng;
    }

    public LinkedList<ComputadorPortatil> importarComputadores() {
        LinkedList<ComputadorPortatil> listaPC = new LinkedList<>();
        String rutaArchivoIng = "ComputadoresPortatiles.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivoIng))) {
            String linea;
            ComputadorPortatil PC = null;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("serial: ")) {
                    if (PC != null) {
                        listaPC.add(PC);
                    }
                    PC= new ComputadorPortatil();
                    PC.setSerial((linea.substring(8)));
                }else if(linea.startsWith("marca: ")){
                    if (PC !=null) {
                        PC.setMarca(linea.substring(7));
                    }

                } else if(linea.startsWith("Tamaño: ")){
                    if (PC !=null) {
                        PC.setTamaño(Float.parseFloat(linea.substring(8)));
                        
                    }
                }else if(linea.startsWith("Precio: ")){
                    if (PC !=null) {
                        PC.setPrecio(Float.parseFloat(linea.substring(7)));
                        
                    }
                
                }else if(linea.startsWith("Sistema: ")){
                    if (PC !=null) {
                        PC.setSistema(linea.substring(9));
                    }
                }else if(linea.startsWith("Procesador: ")){
                    if (PC !=null) {
                        PC.setProcesador(linea.substring(12));
                    }
                }
                if (PC != null) {
                    listaPC.add(PC);
                    PC = null;
                }
            }
                System.out.println("Archivo Importado correctamente");
            
            

        } catch (Exception e) {
            // TODO: handle exception
        }

        return listaPC;
    }

}
