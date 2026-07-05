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

}
