package sistema;

import java.util.Objects;

public abstract class Unidad {
	
	private int codigo;
	private String nombre;
	private int stock;
	
	public Unidad(int codigo, String nombre, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.setStock(stock);
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}

	public void sumarStock(int cantidad) {
		this.stock += cantidad;
	}

	public void decontarStock(int cantidad) throws StockException{
		if (!stockValido()) {
			throw new StockException("Debe ingresar una cantidad mayor a 0");
		} 
		if (cantidad <= this.stock) {
			this.stock -= cantidad;
		}
		else {
			this.stock = 0;
		}
	}
	
	protected boolean stockValido() {
		return this.stock > 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Unidad)) {
			return false;
		}
		Unidad other = (Unidad) obj;
		return codigo == other.codigo && Objects.equals(nombre, other.nombre);
	}

}
