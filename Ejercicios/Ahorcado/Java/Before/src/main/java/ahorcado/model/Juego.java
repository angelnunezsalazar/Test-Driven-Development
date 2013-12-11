package ahorcado.model;

public class Juego {

	public String getSecuencia(String palabra) {
		String secuencia="";
		for (int i = 0; i < palabra.length(); i++) {
			secuencia=secuencia+"_ ";
		}
		secuencia=secuencia.trim();
		return secuencia;
	}

}
