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
	
	@Given("no accounts")
	public void givenNoAccounts() {
	  // PENDING
	}

	@When("create an account <user> with password <password>")
	@Alias("create an account $user with password $password")
	public void whenCreateAnAccountLuisWithPasswordPssw0rd(@Named("user")String user,@Named("password")String password) {
	  webdriver.get("http://localhost:8080/ahorcado/create");//ingresando a la url /create
	  webdriver.findElement(By.id("user")).sendKeys(user);	//ingresar el text luis
	  webdriver.findElement(By.id("password")).sendKeys(password);	//ingresar el texto password
	  webdriver.findElement(By.id("create")).click();// dar click en aceptar
	}

	@Then("the account should be created")
	public void thenTheAccountShouldBeCreated() {
		 String message=webdriver.findElement(By.id("message")).getText();
		 assertEquals("Account Created",message);
	}
	
	@Then("the account should not be created")
	public void thenTheAccountShouldNotBeCreated() {
		 String message=webdriver.findElement(By.id("message")).getText();
		 assertEquals("Invalid Password",message);
	}
}
