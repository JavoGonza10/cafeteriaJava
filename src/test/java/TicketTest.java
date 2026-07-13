import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    private Ticket ticket;

    @BeforeEach
    void setUp() {
        Cliente cliente = new Cliente("Ana", "600111222");
        Camarero camarero = new Camarero("Luis", "EMP01");
        ticket = new Ticket(cliente, camarero);
    }

    @Test
    void testAgregarProductoYCalcularTotal() {
        // Caso positivo: dos productos, el total debe ser la suma de sus precios
        ticket.agregarProducto(new Bebida("Café", "Bebida caliente", 2.0, "Mediano"));
        ticket.agregarProducto(new Comida("Bocadillo", "Comida", 3.5, true));

        assertEquals(5.5, ticket.calcularTotal(), 0.01);
    }

    @Test
    void testTicketVacioTotalCero() {
        // Caso borde: sin añadir ningún producto, el total debe ser 0
        assertEquals(0.0, ticket.calcularTotal(), 0.01);
    }

    @Test
    void testMostrarTicketContieneNombreCliente() {
        // Comprueba que el texto generado incluye el nombre del cliente del setUp
        String resultado = ticket.mostrarTicket();
        assertTrue(resultado.contains("Ana"));
    }
}