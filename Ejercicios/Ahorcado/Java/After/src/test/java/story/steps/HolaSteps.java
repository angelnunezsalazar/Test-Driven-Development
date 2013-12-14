package story.steps;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import story.pages.GreetingPage;
import story.pages.HomePage;
import static org.junit.Assert.*;

public class HolaSteps {

	WebDriver webdriver;
	HomePage homePage;
	GreetingPage greetingPage;
	
	@BeforeScenario
	public void setupWebDriver() {
		webdriver=new FirefoxDriver();
		greetingPage=new GreetingPage(webdriver);
		homePage=new HomePage(webdriver);
	}
	
	@Given("start the Greeter")
	public void givenStartTheGreeter() {
	  homePage.open();
	}

	@When("my name is $name")
	public void whenMyNameIsAngel(String name) {
	  homePage.greet(name);
	}

	@Then("greeting is $greetingExpected")
	public void thenGreetingIs(String greetingExpected) {
	  String greeting = greetingPage.getGreeting();
	  assertEquals(greetingExpected,greeting);
	}
	
	@AfterScenario
	public void closeWebDriver() {
		webdriver.close();
	}
}
