package ar.edu.unq.po2.tp5Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.ProductoCooperativa;

public class CajaTest {
    private Caja caja1;
    private Producto cerveza;
    private ProductoCooperativa vino;
    private List<Producto> productosDelCliente;

    @BeforeEach
    public void setUp() {
        cerveza = new Producto(100.0, 10); // Precio y stock inicial.
        vino = new ProductoCooperativa(50.0, 5, 10); // Precio, stock inicial y descuento.

        // Lista de productos que se pasará a la caja.
        productosDelCliente = Arrays.asList(cerveza, vino);

        // Creación de la caja con la lista de productos.
        caja1 = new Caja(1, productosDelCliente);
    }

    @Test
    public void testDisminuirStockDeLosProductos() {
        caja1.disminuirStockDeLosProductos(productosDelCliente);
        assertEquals(9, cerveza.getStock(), "El stock de cerveza debería haber disminuido en 1");
        assertEquals(4, vino.getStock(), "El stock de vino debería haber disminuido en 1");
    }

    @Test
    public void testIndicarMontoAPagarPorProductos() {
        double montoTotal = caja1.indicarMontoAPagarPorProductos(productosDelCliente);
        assertEquals(145.0, montoTotal, "El monto total debería ser la suma de los precios de los productos");
    }

    @Test
    public void testRegistrarProductos() {
        caja1.registrarProductos(productosDelCliente);
        assertEquals(9, cerveza.getStock(), "El stock de cerveza debería haber disminuido después de registrar");
        assertEquals(4, vino.getStock(), "El stock de vino debería haber disminuido después de registrar");
        // Suponemos que también hay un método para obtener el último monto registrado en la caja
        assertEquals(145.0, caja1.indicarMontoAPagarPorProductos(productosDelCliente), "El monto registrado debería ser igual a la suma de los precios");
    }
}
