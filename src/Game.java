import java.util.Scanner;

public class Game {
    public Game() {
        Scanner UserInput = new Scanner(System.in);

        ConnectFourBoard myConnectFourBoard = new ConnectFourBoard();
        myConnectFourBoard.printBoard();

        System.out.println("Enter column #");
        myConnectFourBoard.incrementColumn(UserInput.nextInt());
        
        
    }
    

}

