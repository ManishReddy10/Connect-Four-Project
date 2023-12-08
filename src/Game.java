public class Game {
    private int[][] Board;
    public Game() {
        Board = new int[6][7];

    }
    
    public void PrintBoard() {
        System.out.println("1 2 3 4 5 6 7");
        
        for (int r = 0; r < Board.length; r++) {
            for (int c = 0; c < Board[0].length; c++) {
                System.out.println(Board[r][c]);
            }
            System.out.print("\n _____________________________________________");
        }

        System.out.println();
    }
}

