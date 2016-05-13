
public class Board3D {
	
	private int[][][] gameBoard;
	
	//constructor 
	public Board3D() {
		gameBoard = new int[4][4][4];
		
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				for (int z = 0; z < 4; z++) {
					gameBoard[x][y][z] = 0;
				}
			}
		}
	}
	
	public int checkRowWin(int x, int y, int z) {
		int winCounter = 0;
		
		for (int counter = 0; counter < 4; counter++)
			if (gameBoard[x][counter][z] == 1){
				winCounter++;
			}
			else if (gameBoard[x][counter][z] == -1){
				winCounter--;
			}
		
		if (winCounter == 4){
			return 1;
		}
		if (winCounter==-4){
			return 2;
		}
		else{
			return 0;
		}
	}
	
	public int checkColWin(int x, int y, int z) {
		int winCounter = 0;
		for (int counter = 0; counter < 4; counter++)
			if (gameBoard[counter][y][z] == 1){
				winCounter++;
			}
			else if (gameBoard[counter][y][z] == -1){
				winCounter--;
			}
		
		if (winCounter == 4){
			return 1;
		}
		if (winCounter==-4){
			return 2;
		}
		else{
			return 0;
		}
	}
	
	public int checkPlaneWin(int x, int y, int z) {
		int winCounter = 0;
		for (int counter = 0; counter < 4; counter++)
			if (gameBoard[x][y][counter] == 1){
				winCounter++;
			}
			else if (gameBoard[x][y][counter] == -1){
				winCounter--;
			}
		
		if (winCounter == 4){
			return 1;
		}
		if (winCounter==-4){
			return 2;
		}
		else{
			return 0;
		}
	}
	
	public boolean check2DDiagWin(int z, int y, int x) {
		int winCounter = 0;
		
		if ((y == 0) && (x == 0)) {
			for (int row = 0; row < 3; row++) {
				for (int col = 0; col < 3; col++) {
					
				}
			}
		} else if ((y == 0) && (x == 3)) {
			
		} else if ((y == 3) && (x == 0)) {
			
		} else if ((y == 3) && (x == 3)) {
			
		}
		
		return false;
	}
	
	public boolean checkPlaneDiagWin(int z, int y, int x) {
		
		
		return false;
	}
	
	public boolean check3DDiagWin(int z, int y, int x) {
		
		
		return false;
	}
	
}
