public class ConnectFourBoard {
    private int[][] Board;
    private int numTokensInColumn[] = new int[7];

    public ConnectFourBoard() {
        Board = new int[6][7];

    }
    
    public void printBoard() {
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

    public void incrementColumn(int colNum) {
        numTokensInColumn[colNum-1] +=1;

    }

    

}



