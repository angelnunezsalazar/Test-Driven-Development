package ahorcado.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class JuegoTest {

	@Test
	public void muestraUnaRayita() throws Exception {
		Juego juego=new Juego();
		String secuencia=juego.getSecuencia("a");
		assertEquals("_",secuencia);
	}
	
	@Test
	public void muestraDosRayitas() throws Exception {
		Juego juego=new Juego();
		String secuencia=juego.getSecuencia("ab");
		assertEquals("_ _",secuencia);
	}
	
	@Test
	public void muestraVariasRayas() throws Exception {
		Juego juego=new Juego();
		String secuencia=juego.getSecuencia("abcdef");
		assertEquals("_ _ _ _ _ _",secuencia);
	}
}
