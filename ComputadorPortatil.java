public class ComputadorPortatil {
    private String serial;
    private String marca;
    private float tamaño;
    private float precio;
    private String sistema;
    private String procesador;
    
    public ComputadorPortatil(String serial, String marca, float tamaño, float precio, String sistema, String procesador) {
        this.serial = serial;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
        this.sistema = sistema;
        this.procesador = procesador;
    }
    
    public ComputadorPortatil() {
    }

    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public float getTamaño() {
        return tamaño;
    }
    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getSistema() {
        return sistema;
    }
    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    public String toString() {
        return "\nComputador portátil: " +  "\nSerial: "  + serial + "\n Marca: " + marca + "\nTamaño: " 
        + tamaño + "\nPreico: " + precio + "\nSistema: " + sistema + "\nProcesador: " + procesador ;
    }
    
    
}