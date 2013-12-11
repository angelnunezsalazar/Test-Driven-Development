package steps;

import static org.junit.Assert.*;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import domain.Calculator;

public class AdditionSteps {

	Calculator calculator = new Calculator();
	int resultCalculator = 0;

	@Given("I have entered $number into the calculator")
	public void givenIHaveEnteredIntoTheCalculator(int number) {
		calculator.Enter(number);
	}

	@When("I press add")
	public void whenIPressAdd() {
		resultCalculator = calculator.Add();
	}

	@Then("the result should be 120 on the screen")
	public void thenTheResultShouldBe120OnTheScreen() {
		assertEquals(120, resultCalculator);
	}
}
