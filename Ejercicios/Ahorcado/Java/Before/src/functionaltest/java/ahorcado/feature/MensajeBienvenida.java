package ahorcado.feature;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MensajeBienvenida {

	@Test
	public void VerMensajeBienvenida() throws Exception {
		WebDriver driver = new FirefoxDriver();

		driver.get("http://localhost:8080/ahorcado");
		String mensaje = driver.findElement(By.tagName("h1")).getText();
		assertEquals("Bienvenido al Ahorcado", mensaje);

		driver.close();
	}
	

}
