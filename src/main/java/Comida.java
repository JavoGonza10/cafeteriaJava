/**
 * Representa un plato de comida del menú de la cafetería.
 * Extiende {@link Producto} añadiendo si se sirve caliente o frío.
 *
 * @author Javi
 * @version 1.0
 */

public class Comida extends Producto{

    private boolean esCaliente;

    /**
     * Crea una nueva comida.
     *
     * @param nombre     nombre del plato
     * @param categoria  categoria a la que pertenece
     * @param precio     precio base del plato
     * @param esCaliente true si se sirve caliente, false si se sirve frío
     */
    public Comida(String nombre, String categoria, double precio, boolean esCaliente){
        super(nombre,categoria,precio);
        this.esCaliente =esCaliente;

    }

    public boolean isEsCaliente() {
        return esCaliente;
    }

    public void setEsCaliente(boolean esCaliente) {
        this.esCaliente = esCaliente;
    }
    /**
     * Genera una representación en texto con los datos del producto y su estado (caliente o frío).
     *
     * @return cadena con los detalles del producto más el estado
     */
    @Override
    public String mostrarDetalles(){
        String estado = esCaliente ? "Caliente" : "Frío";
        return super.mostrarDetalles() + "\n" + "Esado: " + estado;
    }
}



