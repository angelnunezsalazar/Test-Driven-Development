package steps;

import static org.junit.Assert.*;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;

import domain.Bowling;

public class ScoreSteps {
	
	Bowling bowling;
	
	@Given("just started the game")
	public void givenJustStartedTheGame() {
		bowling=new Bowling();
	}

	@Then("the score is 0")
	public void thenTheScoreIs0() {
	  assertEquals(0, bowling.getScore());
	}
}
