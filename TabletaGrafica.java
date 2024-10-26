public class TabletaGrafica {
    private String serial;
    private String marca;
    private float tamaño;
    private float precio;
    private int almanenamiento;
    private float peso;

    public TabletaGrafica(String serial, String marca, float tamaño, float precio, int almanenamiento, float peso) {
        this.serial = serial;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
        this.almanenamiento = almanenamiento;
        this.peso = peso;
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

    public int getAlmanenamiento() {
        return almanenamiento;
    }

    public void setAlmanenamiento(int almanenamiento) {
        this.almanenamiento = almanenamiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String toString() {
        return "\nTableta gráfica: " + "\nSerial: " + serial + "\n Marca: " + marca + "\nTamaño: "
                + tamaño + "\nPrecio: " + precio + "\nAlmacenamiento: " + almanenamiento + "\nPeso: " + peso;
    }

}