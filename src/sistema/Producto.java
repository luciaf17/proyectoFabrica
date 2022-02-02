package sistema;

public class Producto extends Unidad {
	
	private TipoProducto tipoProducto;

	public Producto(int codigo, String nombre, TipoProducto tipoProducto, int stock) {
		super(codigo, nombre, stock);
		this.tipoProducto = tipoProducto;
	}

	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	@Override
	public String toString() {
		return "El codigo del Producto es " + this.getCodigo() + ", Su nombre es: " + this.getNombre() + " y cuenta con el Stock de: " + this.getStock();
	}

}
