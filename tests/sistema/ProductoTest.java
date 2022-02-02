package sistema;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductoTest {

	@Test
	public void queSeCreaUnProducto() {
		
		Producto pieza1 = new Producto(123, "pieza1", TipoProducto.MATERIAL, 0);
		
		assertNotNull(pieza1);
	}
	
	@Test
	public void queSeDescuentaElStock() throws StockException {
		
		Producto pieza1 = new Producto(123, "pieza1", TipoProducto.MATERIAL, 0);
		
		pieza1.setStock(40);
		pieza1.decontarStock(30);
		
		assertEquals(10, pieza1.getStock());
	}
	
	@Test
	public void queDescuentaLaMismaCantidad() throws StockException {
		
		Producto pieza1 = new Producto(123, "pieza1", TipoProducto.MATERIAL, 0);
		
		pieza1.setStock(40);
		pieza1.decontarStock(40);
		
		assertEquals(0, pieza1.getStock());
	}
	
	@Test
	public void queNoTieneStockNegativo() throws StockException {
		
		Producto pieza1 = new Producto(123, "pieza1", TipoProducto.MATERIAL, 0);
		
		pieza1.setStock(40);
		pieza1.decontarStock(41);
		
		assertEquals(0, pieza1.getStock());
	}
	
	@Test
	public void queSeSumaElStock() {
		
		Producto pieza1 = new Producto(123, "pieza1", TipoProducto.MATERIAL, 0);
		
		pieza1.setStock(40);
		pieza1.sumarStock(41);
		
		assertEquals(81, pieza1.getStock());
	}

}
