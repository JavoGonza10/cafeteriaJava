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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

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



