public class Bebida extends Producto {

    private String tamanio;

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

    @Override
    public String mostrarDetalles(){
        return super.mostrarDetalles() + "\n" + "Tamaño: " + tamanio;
    }
}
