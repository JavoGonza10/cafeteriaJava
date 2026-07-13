/**
 * Representa una bebida del menú de la cafetería.
 * Extiende {@link Producto} añadiendo el tamaño de la bebida.
 *
 * @author Javi
 * @version 1.0
 */


public class Bebida extends Producto {

    private String tamanio;
    /**
     * Crea una nueva bebida.
     *
     * @param nombre    nombre de la bebida
     * @param categoria categoria a la que pertenece
     * @param precio    precio base de la bebida
     * @param tamanio   tamaño de la bebida (ej. "Pequeño", "Mediano", "Grande")
     */
    public Bebida(String nombre, String categoria, double precio, String tamanio) {
        super(nombre, categoria, precio);
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * Genera una representación en texto con los datos del producto y el tamaño de la bebida.
     *
     * @return cadena con los detalles del producto más el tamaño
     */
    @Override
    public String mostrarDetalles(){
        return super.mostrarDetalles() + "\n" + "Tamaño: " + tamanio;
    }
}
