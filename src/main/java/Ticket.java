/**
 * Representa el ticket de una venta en la cafetería.
 * Agrupa un {@link Cliente}, un {@link Camarero} y los {@link Producto} vendidos.
 *
 * @author Javi
 * @version 1.0
 */

public class Ticket {

        private  Cliente cliente;
        private Camarero camarero;
        private Producto[] productos;
        private int contadorProductos;
    /**
     * Crea un nuevo ticket vacío para un cliente y un camarero, con capacidad para 10 productos.
     *
     * @param cliente  cliente al que pertenece el ticket
     * @param camarero camarero que atiende la venta
     */
    public Ticket(Cliente cliente, Camarero camarero) {
        this.cliente = cliente;
        this.contadorProductos = 0;
        this.productos = new Producto[10];
        this.camarero = camarero;
    }
    /**
     * Añade un producto al ticket si aún queda espacio disponible.
     *
     * @param producto producto a añadir al ticket
     */
    public void agregarProducto(Producto producto) {
        if (contadorProductos < productos.length) {
            productos[contadorProductos] = producto;
            contadorProductos++;
        } else {
            System.out.println("No se pueden añadir más productos, el ticket está lleno.");
        }
    }
    /**
     * Calcula el importe total del ticket sumando el precio de todos los productos añadidos.
     *
     * @return suma de los precios de los productos del ticket
     */
    public double calcularTotal(){
    double total = 0;
    for (int i = 0; i < contadorProductos; i++) {
        total = total + productos[i].getPrecio();
    }
    return total;
 }
    /**
     * Genera una representación en texto del ticket completo: cliente, camarero,
     * listado de productos y total a pagar.
     *
     * @return cadena con el resumen completo del ticket
     */
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
