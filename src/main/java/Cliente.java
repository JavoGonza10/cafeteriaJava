/**
 * Representa a un cliente de la cafetería.
 *
 * @author Javi
 * @version 1.0
 */

public class Cliente {

    private String nombre;
    private String telefono;
    /**
     * Crea un nuevo cliente.
     *
     * @param nombre   nombre del cliente
     * @param telefono telefono de contacto del cliente
     */
    public Cliente(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;

    }
    /**
     * Devuelve el telefono del cliente.
     * @return telefono del cliente
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el telefono del cliente.
     * @param telefono nuevo telefono del cliente
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve el nombre del cliente.
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * @param nombre nuevo nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Genera una representación en texto con los datos del cliente.
     *
     * @return cadena con el nombre y telefono del cliente
     */
    public String mostrarCliente(){
        return "Nombre del Cliente: " + nombre + "\n" +
                "Telefono del Cliente: " + telefono;

    }

}
