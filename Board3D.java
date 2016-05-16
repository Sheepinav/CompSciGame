
/*
 * Class 'Board3D'
 * This class checks all the 76 possible combinations for a win in a 4x4 3D tic-tac-toe game.
 * If a win is detected by a checking method, the program will return 1 for a win by the 'X'
 * player, -1 by the 'O' player, and 0 if no win is detected.
 */

public class Board3D {
	
	private int[][][] gameBoard;
	
	// Constructor
	public Board3D() {
		gameBoard = new int[4][4][4];
	}
	
	// For the next user-inputted coordinate, check its respective row for a win
	public int checkRowWin(int x, int y, int z) {
		int winCounter = 0;
		
		for (int counter = 0; counter < 4; counter++)
			winCounter += gameBoard[x][counter][z];
		 
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
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
	
	public int checkdiagonal1(){
		int winCounter=0;
		for (int n = 0; n < 4; n++){
			if (gameBoard[0][n][n]==1){
				winCounter++;
			} else if (gameBoard[0][n][n]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal2(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[1][n][n]==1){
				winCounter++;
			} else if (gameBoard[0][n][n]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal3(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[2][n][n]==1){
				winCounter++;
			} else if (gameBoard[0][n][n]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal4(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[3][n][n]==1){
				winCounter++;
			} else if (gameBoard[0][n][n]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal5(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[n][0][n]==1){
				winCounter++;
			} else if (gameBoard[n][0][n]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal6(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[n][1][n]==1){
				winCounter++;
			} else if (gameBoard[n][1][n]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal7(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[n][2][n]==1){
				winCounter++;
			} else if (gameBoard[n][2][n]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal8(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[n][3][n]==1){
				winCounter++;
			} else if (gameBoard[n][3][n]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal9(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[0][3-n][n]==1){
				winCounter++;
			} else if (gameBoard[0][3-n][n]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal10(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[1][3-n][n]==1){
				winCounter++;
			} else if (gameBoard[1][3-n][n]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal11(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[2][3-n][n]==1){
				winCounter++;
			} else if (gameBoard[2][3-n][n]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal12(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[3][3-n][n]==1){
				winCounter++;
			} else if (gameBoard[3][3-n][n]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal13(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[n][0][3-n]==1){
				winCounter++;
			} else if (gameBoard[n][0][3-n]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal14(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[n][1][3-n]==1){
				winCounter++;
			} else if (gameBoard[n][1][3-n]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal15(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[n][2][3-n]==1){
				winCounter++;
			} else if (gameBoard[n][2][3-n]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal16(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[n][3][3-n]==1){
				winCounter++;
			} else if (gameBoard[n][3][3-n]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal17(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[n][n][0]==1){
				winCounter++;
			} else if (gameBoard[n][n][0]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal18(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[n][n][1]==1){
				winCounter++;
			} else if (gameBoard[n][n][1]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal19(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[n][n][2]==1){
				winCounter++;
			} else if (gameBoard[n][n][2]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal20(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[n][n][3]==1){
				winCounter++;
			} else if (gameBoard[n][n][3]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal21(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[3-n][n][0]==1){
				winCounter++;
			} else if (gameBoard[3-n][n][0]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal22(){
		int winCounter=0;
		for (int n=0; n<4; n++){
			if (gameBoard[3-n][n][1]==1){
				winCounter++;
			} else if (gameBoard[3-n][n][1]==-1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
	
	public int checkdiagonal23(){
		int winCounter=0;
		for (int n=0; n<4; n++) {
			if (gameBoard[3 - n][n][2] == 1){
				winCounter++;
			} else if (gameBoard[3-n][n][2] == -1){
				winCounter--;
			}
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter== -4)
			return -1;
		
		return 0;
	}
	
	public int checkDiagonal24(){
		int winCounter=0;
		for (int n = 0; n < 4; n++){
			if (gameBoard[3 - n][n][3]==1)
				winCounter++;
			else if (gameBoard[3 - n][n][3]==-1)
				winCounter--;
		}
		
		if (winCounter == 4)
			return 1;
		else if (winCounter==-4)
			return -1;
		
		return 0;
	}
}
}
