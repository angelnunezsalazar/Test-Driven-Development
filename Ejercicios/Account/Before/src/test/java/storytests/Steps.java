package storytests;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class Steps {

	WebDriver webdriver;

	@BeforeScenario
	public void setupWebDriver() {
		webdriver=new FirefoxDriver();
	}
	
	@AfterScenario
	public void closeWebDriver() {
		webdriver.close();
	}
}
