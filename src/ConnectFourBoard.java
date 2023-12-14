public class ConnectFourBoard {
    private int[][] Board;

    public ConnectFourBoard() {
        Board = new int[6][7];

    }
    
    public void printBoard() {

        for (int c = 0; c < Board[0].length; c++) {
            for (int r = 6; r > numTokensInColumn[r] && numTokensInColumn[r] > 0; r--) {
                Board[r][c] = 1;
            }
        }

        System.out.println("   1   2   3   4   5   6   7");
        

        for (int r = 0; r < Board.length; r++) {

            for (int c = 0; c < Board[0].length; c++) {
                System.out.print(" | " + Board[r][c]);
            }

            System.out.println(" |");
            System.out.println("---------------------------------");
        }

        System.out.println();
    }

    public void incrementColumn(int givenColNum, int playerNum) {
        int c = givenColNum-1;
        for (int r = 5; r >=0; r--) {
	    if(Board[0][c] == 2 || Board[0][c] == 1){
		    System.out.println("Space exists; Try a different spot :(");
		    break;
	    }
	    else if (Board[r][c] == 0) {
            Board[r][c] = playerNum;
            break;
        }
        }
        // numTokensInColumn[colNum] +=1;
    
        // int rowCoordinate = 6 - numTokensInColumn[colNum];
        
    }

    public boolean didPlayerXWin(int playerNum) {
        // check vertical win condition
        int iteration = 0;
        for (int r = 0; r >= 6; r++) {
            for (int c = 1; c >= 7; c++) {
                if (playerNum == 1) {
                    if ((Board[r][0] == Board[r][c])) {
                        iteration++;
                    }
                    if (iteration == 6) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}