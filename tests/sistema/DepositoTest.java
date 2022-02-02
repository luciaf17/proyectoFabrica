package sistema;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class DepositoTest {

	@Test
	public void prueboToString() {
		Producto pieza1 = new Producto(123, "Tornillo", TipoProducto.MATERIAL, 2);
		Producto pieza2 = new Producto(1234, "pieza2", TipoProducto.MATERIAL, 20);
		Producto pieza3 = new Producto(12345, "pieza3", TipoProducto.MATERIAL, 0);

		Envase envase1 = new Envase(pieza1, 345, "Lata", 1, 300, "litros");
		Envase envase2 = new Envase(pieza2, 544, "Capacho", 2, 30, "cantidadPiezas");

		LinkedList<Producto> productos = new LinkedList<Producto>();
		LinkedList<Envase> envases = new LinkedList<Envase>();
		Deposito deposito = new Deposito();

		productos.add(pieza1);
		envases.add(envase2);

		System.out.println(productos);
		System.out.println(envases);
	}

	@Test
	public void queSeAgreganProductosDelStockDeEnvases() {

		Producto pieza1 = new Producto(1234, "Pieza Central", TipoProducto.MATERIAL, 10);

		Envase envase1 = new Envase(pieza1, 544, "Capacho", 1, 30, "cantidadPiezas");

		LinkedList<Envase> envases = new LinkedList<Envase>();

		envases.add(envase1);

		Deposito deposito = new Deposito(envases);

		deposito.agregarStockDeProductoAlEnvase(20);

		assertEquals(30, envases.get(0).getProducto().getStock());

	}

	@Test
	public void queSeDescuentanProductosDelStockDeEnvases() throws StockException {

		Producto pieza1 = new Producto(1234, "Pieza Central", TipoProducto.MATERIAL, 10);

		Envase envase1 = new Envase(pieza1, 544, "Capacho", 1, 30, "cantidadPiezas");
		

		LinkedList<Envase> envases = new LinkedList<Envase>();

		envases.add(envase1);
		
		Deposito deposito = new Deposito(envases);

		deposito.agregarStockDeProductoAlEnvase(30);
		deposito.descontarStockDeProductoDelEnvase(10);

		assertEquals(30, envases.get(0).getProducto().getStock());

	}

}
