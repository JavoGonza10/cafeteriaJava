/**
 * Representa un producto disponible en el inventario de la cafetería.
 * Implementa {@link Descontable} para permitir aplicar descuentos sobre el precio.
 *
 * @author Javi
 * @version 1.0
 */

public class Producto implements Descontable {

    // Atributos
    private String nombre;
    private double precio;
    private String categoria;

    /**
     * Crea un nuevo producto con nombre, categoria y precio.
     *
     * @param nombre    nombre del producto
     * @param categoria categoria a la que pertenece el producto
     * @param precio    precio base del producto, sin descuentos
     */
    public Producto(String nombre,String categoria, double precio){

        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }
    /**
     * Devuelve el nombre del producto.
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     * @param nombre nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el precio del producto.
     * @return precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     * @param precio nuevo precio del producto
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve la categoria del producto.
     * @return categoria del producto
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoria del producto.
     * @param categoria nueva categoria del producto
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Genera una representación en texto con los datos principales del producto.
     *
     * @return cadena con nombre, precio y categoria del producto
     */
    public String mostrarDetalles(){

        return "Nombre del producto: " + nombre + "\n" +
                "Precio del producto: " + precio + "\n" +
                "Categoria del producto: " + categoria;
    }

    /**
     * Calcula el precio final tras aplicar un descuento porcentual.
     *
     * @param porcentaje descuento a aplicar, expresado en tanto por uno (ej. 0.1 = 10%)
     * @return precio con el descuento aplicado
     */
    @Override
    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * porcentaje);
    }

}


