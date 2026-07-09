public class Camarero {

    private String nombre;
    private String codigoEmpleado;

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

    public String mostrarCamarero(){
        return "Nombre del Camarero: " + nombre + "\n" +
                "Codigo del Camarero: " + codigoEmpleado;

    }

}



