package sistema;

import java.util.LinkedList;


public class Deposito {

	private LinkedList<Producto> productos = new LinkedList<Producto>();
	private LinkedList<Envase> envases = new LinkedList<Envase>();

	public Deposito(LinkedList<Envase> envases) {
		this.envases = envases;
	}
	
	public Deposito() {
		
	}

	public LinkedList<Producto> getProductos() {
		return productos;
	}

	public LinkedList<Envase> getEnvases() {
		return envases;
	}


	public void agregarStockDeProductoAlEnvase(int cantidad) {
		for (Envase cadaEnvase : envases) {
			cadaEnvase.getProducto().sumarStock(cantidad);
		}
	}
	
	public void descontarStockDeProductoDelEnvase(int cantidad) throws StockException {
		for (Envase cadaEnvase : envases) {
			cadaEnvase.getProducto().decontarStock(cantidad);
		}
	}
	
}