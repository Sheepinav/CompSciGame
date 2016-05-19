
/*
 * Class 'WinChecker'
 * This class checks all the 76 possible combinations for a win in a 4x4 3D tic-tac-toe game.
 * If a win is detected by a checking method, the program will return 1 for a win by the 'X'
 * player, -1 by the 'O' player, and 0 if no win is detected.
 */

public class WinChecker {
	
	// For the next user-inputted coordinate, check its respective row for a win
	public int checkRowWin(int x, int y, int z) {
		int winCounter = 0;
		
		for (int counter = 0; counter < 4; counter++)
			winCounter += gameBoard[x][counter][z];
		 
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	// For the next user-inputted coordinate, check its respective column for a win
	public int checkColWin(int x, int y, int z) {
		int winCounter = 0;
		for (int counter = 0; counter < 4; counter++)
			winCounter += gameBoard[counter][y][z];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	// For the next user-inputted coordinate, check its respective 'plane' for a win
	public int checkPlaneWin(int x, int y, int z) {
		int winCounter = 0;
		for (int counter = 0; counter < 4; counter++)
			winCounter += gameBoard[x][y][counter];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	/* 
	 * The following 24 methods check all the possible diagonal combinations in the board
	 */
	
	public int checkDiagonal() {
		int winCounter = 0;
	//diagonal 1 code 	
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[0][n][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
	//diagonal 2 code 
		winCounter = 0;
		for (int n = 0; n < 4; n++) {
			if (gameBoard[1][n][n] == 1)
				winCounter++;
			else if (gameBoard[0][n][n] == -1)
				winCounter--;
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		winCounter = 0;
		for (int n = 0; n < 4; n++) {
			if (gameBoard[2][n][n] == 1)
				winCounter++;
			else if (gameBoard[0][n][n] == -1)
				winCounter--;
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal04() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++) {
			if (gameBoard[3][n][n] == 1)
				winCounter++;
			else if (gameBoard[0][n][n] == -1)
				winCounter--;
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal05() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[n][0][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal06() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[n][1][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal07() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[n][2][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal08() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[n][3][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal09() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[0][3 - n][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal10() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[1][3 - n][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal11() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[2][3 - n][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal12() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[3][3 - n][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal13() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[n][0][3 - n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal14() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[n][1][3 - n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal15() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[n][2][3 - n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal16() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[n][3][3 - n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal17() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[n][n][0];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal18() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[n][n][1];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal19() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[n][n][2];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal20() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[n][n][3];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal21() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[3 - n][n][0];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal22() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[3 - n][n][1];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal23() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[3 - n][n][2];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter== -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal24() {
		int winCounter = 0;
		for (int n = 0; n < 4; n++)
			winCounter += gameBoard[3 - n][n][3];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		return 0;
	}
}
