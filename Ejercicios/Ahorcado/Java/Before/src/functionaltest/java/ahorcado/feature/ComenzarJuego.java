package ahorcado.feature;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ComenzarJuego {

	@Test
	public void IngresoPalabraYObservoSecuencia() throws Exception {
		/*
		 * Abro la pagina
		 * Ingreso la palabra "prueba"
		 * Doy jugar
		 * Y veo "_ _ _ _ _ _"
		 * */
		WebDriver webdriver=new FirefoxDriver();
		
		webdriver.get("http://localhost:8080/ahorcado");
		webdriver.findElement(By.id("palabra")).sendKeys("prueba");
		webdriver.findElement(By.id("jugar")).click();
		String secuencia=webdriver.findElement(By.id("secuencia")).getText();
		assertEquals("_ _ _ _ _ _",secuencia);

		webdriver.close();
	}
}
