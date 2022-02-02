package sistema;

public class Envase extends Unidad{
	
	private Producto producto;
	private double capacidad;
	private String unidadMedida;
	
	public Envase(Producto producto, int codigo, String nombre, int stock, double capacidad, String unidadMedida) {
		super(codigo, nombre, stock);
		this.producto = producto;
		this.capacidad = capacidad;
		this.unidadMedida = unidadMedida;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public String getForma() {
		return unidadMedida;
	}

	public Producto getProducto() {
		return producto;
	}
	
	public void sumarACapacidad() {
		 
	}

	@Override
	public String toString() {
		return "El codigo del envase es: " + this.getCodigo() + ", su nombre es : " + this.getNombre() + " y cuenta con una capacidad de: " + this.capacidad + " " + this.getForma() + ". El mismo contiene: " + this.producto.getStock() + " unidades del producto con codigo:  " + this.producto.getCodigo() ;
	}
	
	
	
	
}
