import java.util.Scanner;

public class Game {
    public Game() {
        Scanner UserInput = new Scanner(System.in);

        ConnectFourBoard myConnectFourBoard = new ConnectFourBoard();
        myConnectFourBoard.printBoard();

        for (int i = 0; i < 10; i++) {
            System.out.println("Player 1: enter column #");
            myConnectFourBoard.incrementColumn(UserInput.nextInt(), 1);
            myConnectFourBoard.printBoard();

            System.out.println("Player 2: enter column #");
            myConnectFourBoard.incrementColumn(UserInput.nextInt(), 2);
            myConnectFourBoard.printBoard();
        }
        


        
        
        
    }
    

}

