package tdd;

public class Tennis {

	private static final int secondIncrement = 10;

	private static final int initialIncrement = 15;

	private int player1Score = 0;
	private int player2Score = 0;

	private boolean finished;

	private String player1;

	private String player2;

	public Tennis(String player1, String player2) {
		this.player1 = player1;
		this.player2= player2;
	}

	public String getScore() {
		if (player1Score-player2Score==10 && player1Score>=40) {
			return "Advantage juan";
		}
		if (player2Score-player1Score==10 && player2Score>=40) {
			return "Advantage pedro";
		}
		if (player1Score>=40 && player1Score==player2Score) {
			return "Deuce";
		}
		if (player1Score > 40) {
			return "Game "+player1;
		}
		if (player2Score > 40) {
			return "Game pedro";
		}
		return player1Score + "-" + player2Score;
	}

	public void addPointPlayer1() {
		player1Score = incrementScore(player1Score);
	}

	public void addPointPlayer2() {
		player2Score = incrementScore(player2Score);
	}

	private int incrementScore(int playerScore) {	
		if (playerScore >= 30) {
			playerScore += secondIncrement;
		} else
			playerScore += initialIncrement;
		return playerScore;
	}
}
