package story.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver webdriver;

	public HomePage(WebDriver webdriver) {
		this.webdriver = webdriver;
	}
	
	public void open(){
		webdriver.get("http://localhost:8080/ahorcado");
	}
	
	public void greet(String name){
		webdriver.findElement(By.id("name")).sendKeys(name);
		webdriver.findElement(By.id("greet")).click();
	}
}
