public class Ticket {

        private  Cliente cliente;
        private Camarero camarero;
        private Producto[] productos;
        private int contadorProductos;

    public Ticket(Cliente cliente, Camarero camarero) {
        this.cliente = cliente;
        this.contadorProductos = 0;
        this.productos = new Producto[10];
        this.camarero = camarero;
    }

    // Arraylist utilizar
    public void agregarProducto(Producto producto) {
        if (contadorProductos < productos.length) {
            productos[contadorProductos] = producto;
            contadorProductos++;
        } else {
            System.out.println("No se pueden añadir más productos, el ticket está lleno.");
        }
    }
    public double calcularTotal(){
    double total = 0;
    for (int i = 0; i < contadorProductos; i++) {
        total = total + productos[i].getPrecio();
    }
    return total;
 }

    public String mostrarTicket() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== CAFETERÍA JAVA ===");
        sb.append("\nCliente: ").append(cliente.getNombre());
        sb.append("\nCamarero: ").append(camarero.getNombre()).append(" - Código: ").append(camarero.getCodigoEmpleado());
        sb.append("\nProductos" + "\n");
        for (int i = 0; i < contadorProductos; i++){
            sb.append((i +1) + ". " + productos[i].mostrarDetalles() + "\n");
        }
        sb.append("Total: " + calcularTotal() + " €\n");

        return sb.toString();
    }



}
