/**
 * Clase principal que ejecuta una demostración del sistema de tickets de la cafetería.
 *
 * @author Javi
 * @version 1.0
 */
public class Main {

    /**
     * Punto de entrada del programa. Crea un ticket de ejemplo, añade productos
     * y muestra el resultado por consola.
     *
     * @param args argumentos de linea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana", "600111222");
        Camarero camarero = new Camarero("Luis", "EMP01");
        Ticket ticket = new Ticket(cliente, camarero);

        ticket.agregarProducto(new Bebida("Café", "Bebida caliente", 2.0, "Mediano"));
        ticket.agregarProducto(new Comida("Bocadillo de tortilla", "Comida", 3.5, true));
        ticket.agregarProducto(new Bebida("Zumo de naranja", "Bebida fría", 1.8, "Pequeño"));

        System.out.println(ticket.mostrarTicket());
    }
}