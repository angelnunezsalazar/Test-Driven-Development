package tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TennisTest {
	
	private Tennis tennis;

	@Before
	public void setup(){
		tennis = new Tennis("juan","pedro");		
	}
	
	@Test
	public void scoreInicial(){
		String score=tennis.getScore();
		assertEquals(score,"0-0");
	}
	
	@Test
	public void scoreFirstPointPlayer1() throws Exception {
		addPoints(1);
		String score=tennis.getScore();
		assertEquals(score,"15-0");
	}
	
	@Test
	public void scoreSecondPointPlayer1() throws Exception {
		addPoints(1,1);
		String score=tennis.getScore();
		assertEquals(score,"30-0");
	}
	
	@Test
	public void scoreFirstPointPlayer2() throws Exception {
		addPoints(2);
		String score=tennis.getScore();
		assertEquals(score,"0-15");
	}	
	
	@Test
	public void scoreSecondPointPlayer2() throws Exception {
		addPoints(2,2);
		String score=tennis.getScore();
		assertEquals(score,"0-30");
	}
	
	@Test
	public void scoreThirdPointPlayer1() throws Exception {
		addPoints(1,1,1);
		String score=tennis.getScore();
		assertEquals(score,"40-0");
	}
	
	@Test
	public void scoreThirdPointPlayer2() throws Exception {
		addPoints(2,2,2);
		String score=tennis.getScore();
		assertEquals(score,"0-40");
	}
	
	@Test
	public void player1Wins() throws Exception {
		addPoints(1,1,1,1);
		String score=tennis.getScore();
		assertEquals(score,"Game juan");
	}
	
	@Test
	public void player2Wins() throws Exception {
		addPoints(2,2,2,2);
		String score=tennis.getScore();
		assertEquals(score,"Game pedro");
	}
	
	@Test
	public void firstDeuce() throws Exception {
		addPoints(1,1,1,2,2,2);
		String score=tennis.getScore();
		assertEquals(score,"Deuce");
	}
	
	@Test
	public void advantagePlayer1() throws Exception {
		addPoints(1,1,1,2,2,2,1);
		String score=tennis.getScore();
		assertEquals(score,"Advantage juan");
	}
	
	@Test
	public void advantagePlayer2() throws Exception {
		addPoints(1,1,1,2,2,2,2);
		String score=tennis.getScore();
		assertEquals(score,"Advantage pedro");
	}
	
	@Test
	public void winPlayer1AfterAdvantage() throws Exception {
		addPoints(1,1,1,2,2,2,1,1);
		String score=tennis.getScore();
		assertEquals(score,"Game juan");
	}
	
	@Test
	public void winPlayer2AfterAdvantage() throws Exception {
		addPoints(1,1,1,2,2,2,2,2);
		String score=tennis.getScore();
		assertEquals(score,"Game pedro");
	}
	
	@Test
	public void secondDeuce() throws Exception {
		addPoints(1,1,1,2,2,2,1,2);
		String score=tennis.getScore();
		assertEquals(score,"Deuce");
	}
	
	@Test
	public void winPlayer1WithManyPoints() throws Exception {
		addPoints(1,1,1,1,2,2,2,2,2,2);
		String score=tennis.getScore();
		assertEquals(score,"Game juan");
	}
	
//	@Test
//	public void winPlayer2WithManyPoints() throws Exception {
//		addPoints(2,2,2,2,1,1,1,1,1,1);
//		String score=juego.getScore();
//		assertEquals(score,"Game pedro");
//	}
	
	@Test
	public void playersWithDifferentNames() throws Exception {
		tennis=new Tennis("cristian","luis");
		addPoints(1,1,1,1);
		String score = tennis.getScore();
		assertEquals("Game cristian",score);
	}
	
	//Nombres no diferentes
	public void addPoints(int... player){
		for (int i = 0; i < player.length; i++) {
			if (player[i]==1) {
				tennis.addPointPlayer1();
			}
			else
				tennis.addPointPlayer2();
		}
	}
	
}
