public class ConnectFourBoard {
    private int[][] Board;
    private int numTokensInColumn[] = new int[7];

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

    /*public boolean didPlayerXWin(int playerNum) {
        // check vertical win condition
        int iteration = 0;
        for (int c = 0; c > 6; c++) {
            for (int r = 1; r > 7; r++) {
                if (playerNum == 1) {
                    if ((Board[0][c]==1&&Board[r][c]==1)) {
                        iteration++;
                        System.out.println(iteration+"zoop");
                    }
                System.out.println(iteration+"zoop");
                    if (iteration == 6) {
                        return true;
                    }
                }
            }
        }
        return false;
    }*/

    public boolean checkColumns(int player) {
        for (int row = 0; row <= 6 - 4; row++) {
            for (int col = 0; col < 7; col++) {
                if (Board[row][col] == player &&
                    Board[row + 1][col] == player &&
                    Board[row + 2][col] == player &&
                    Board[row + 3][col] == player) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean checkRows(int player) {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col <= 7 - 4; col++) {
                if (Board[row][col] == player &&
                    Board[row][col + 1] == player &&
                    Board[row][col + 2] == player &&
                    Board[row][col + 3] == player) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean checkDiagonals(int player) {
        // Check diagonals from top-left to bottom-right
        for (int row = 0; row <= 6 - 4; row++) {
            for (int col = 0; col <= 7 - 4; col++) {
                if (Board[row][col] == player &&
                    Board[row + 1][col + 1] == player &&
                    Board[row + 2][col + 2] == player &&
                    Board[row + 3][col + 3] == player) {
                    return true;
                }
            }
        }

        // Check diagonals from top-right to bottom-left
        for (int row = 0; row <= 6 - 4; row++) {
            for (int col = 3; col < 7; col++) {
                if (Board[row][col] == player &&
                    Board[row + 1][col - 1] == player &&
                    Board[row + 2][col - 2] == player &&
                    Board[row + 3][col - 3] == player) {
                    return true;
                }
            }
        }

        return false;
    }

}