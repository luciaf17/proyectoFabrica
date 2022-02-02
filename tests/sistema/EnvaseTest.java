package sistema;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnvaseTest {

	@Test
	public void queSeCreaUnEnvase() {
		Producto pieza1 = new Producto(123, "pieza1", TipoProducto.MATERIAL, 0);
		
		Envase envase1 = new Envase(pieza1, 345, "Lata", 1, 300, "litros");
		
		assertNotNull(envase1);
	}
	
	

}
