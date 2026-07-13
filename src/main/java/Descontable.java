/**
 * Define el comportamiento de los elementos a los que se les puede aplicar un descuento.
 *
 * @author Javi
 * @version 1.0
 */

public interface Descontable {
    /**
     * Calcula el precio resultante tras aplicar un descuento porcentual.
     *
     * @param porcentaje descuento a aplicar, expresado en tanto por uno (ej. 0.1 = 10%)
     * @return precio final tras aplicar el descuento
     */
    double aplicarDescuento(double porcentaje);
}
