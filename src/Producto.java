public class Producto {

    // Atributos
    private String nombre;
    private double precio;
    private String categoria;

    //Constructor de la la clase producto.
    public Producto(String nombre,String categoria, double precio){

        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String mostrarDetalles(){

        return "Nombre del producto: " + nombre + "\n" +
                "Precio del producto: " + precio + "\n" +
                "Categoria del producto: " + categoria;
    }


}


