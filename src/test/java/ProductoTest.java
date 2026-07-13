import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    private Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto("Café", "Bebida caliente", 2.0);
    }

    @Test
    void testAplicarDescuentoValido() {
        // Caso positivo: 10% de descuento sobre 2.0 debe dar 1.8
        double resultado = producto.aplicarDescuento(0.1);
        assertEquals(1.8, resultado, 0.01);
    }

    @Test
    void testAplicarDescuentoCero() {
        // Caso negativo/borde: sin descuento el precio no cambia
        double resultado = producto.aplicarDescuento(0.0);
        assertEquals(2.0, resultado, 0.01);
    }

    @Test
    void testGetNombre() {
        assertEquals("Café", producto.getNombre());
    }
}
