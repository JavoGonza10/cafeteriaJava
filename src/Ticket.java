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
        sb.append("=== CAFETERÍA JAVA === \n");
        sb.append("Cliente: " + cliente.getNombre() + "\n");
        sb.append("Camarero: " + camarero.getNombre() + " - Código: " + camarero.getCodigoEmpleado() + "\n");
        sb.append("Productos" + "\n");
        for (int i = 0; i < contadorProductos; i++){
            sb.append((i +1) + ". " + productos[i].mostrarDetalles() + "\n");
        }
        sb.append("Total: " + calcularTotal() + " €\n");

        return sb.toString();
    }



}
