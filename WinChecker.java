
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
		int n=0;
		// Diagonal checker #1	
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[0][n][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #2	
		winCounter = 0;
			for (n = 0; n < 4; n++)
			winCounter += gameBoard[1][n][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #3
		winCounter = 0;
			for (n = 0; n < 4; n++)
			winCounter += gameBoard[2][n][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #4
		winCounter = 0;
			for (n = 0; n < 4; n++)
			winCounter += gameBoard[3][n][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #5
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[n][0][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #6
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[n][1][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #7
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[n][2][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #8
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[n][3][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #9
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[0][3 - n][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #10
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[1][3 - n][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #11
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[2][3 - n][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #12
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[3][3 - n][n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #13
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[n][0][3 - n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #14
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[n][1][3 - n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #15
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[n][2][3 - n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #16
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[n][3][3 - n];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #17
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[n][n][0];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #18
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[n][n][1];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #19
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[n][n][2];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #20
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[n][n][3];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #21
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[3 - n][n][0];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #22
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[3 - n][n][1];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #23
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[3 - n][n][2];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter== -4)
			return -1;
		
		// Diagonal checker #24
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[3 - n][n][3];
		
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
		
		// Diagonal checker #25
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[n][n][n];
						
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
			
		// Diagonal checker #26
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[n][3-n][n];
						
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
				return -1;
		
		// Diagonal checker #27
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[3-n][3-n][n];
						
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
			
		// Diagonal checker #28
		winCounter = 0;
		for (n = 0; n < 4; n++)
			winCounter += gameBoard[3-n][n][n];
									
		if (winCounter == 4)
			return 1;
		else if (winCounter == -4)
			return -1;
			
	// If no wins are detected, return 0
			return 0;
	}
}
