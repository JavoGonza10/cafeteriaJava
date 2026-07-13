/**
 * Representa a un camarero de la cafetería.
 *
 * @author Javi
 * @version 1.0
 */

public class Camarero {

    private String nombre;
    private String codigoEmpleado;
    /**
     * Crea un nuevo camarero.
     *
     * @param nombre         nombre del camarero
     * @param codigoEmpleado codigo identificativo del empleado
     */
    public Camarero(String nombre, String codigoEmpleado){
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
    }
    /**
     * Devuelve el nombre del camarero.
     * @return nombre del camarero
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del camarero.
     * @param nombre nuevo nombre del camarero
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el codigo de empleado del camarero.
     * @return codigo de empleado del camarero
     */
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Establece el codigo de empleado del camarero.
     * @param codigoEmpleado nuevo codigo de empleado
     */
    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    /**
     * Genera una representación en texto con los datos del camarero.
     *
     * @return cadena con el nombre y codigo de empleado del camarero
     */
    public String mostrarCamarero(){
        return "Nombre del Camarero: " + nombre + "\n" +
                "Codigo del Camarero: " + codigoEmpleado;

    }

}



