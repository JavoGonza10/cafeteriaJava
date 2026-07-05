public class Comida extends Producto{

    private boolean esCaliente;


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

    @Override
    public String mostrarDetalles(){
        String estado = esCaliente ? "Caliente" : "Frío";
        return super.mostrarDetalles() + "\n" + "Esado: " + estado;
    }
}



