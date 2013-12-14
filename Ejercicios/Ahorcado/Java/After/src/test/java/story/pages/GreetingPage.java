package story.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GreetingPage {

	private WebDriver webdriver;

	public GreetingPage(WebDriver webdriver) {
		this.webdriver = webdriver;
	}
	
	public String getGreeting(){
		return webdriver.findElement(By.id("greeting")).getText();
	}
}
