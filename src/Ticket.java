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
}
