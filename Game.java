import java.util.Scanner;

public class Game {
    private Board board;
    private char currentPlayer;
    private Scanner scanner;

    public Game(){
        board = new Board();
        currentPlayer = 'X';
        scanner = new Scanner(System.in); // Create a Scanner object
    }

    public int[] getMove(){
        System.out.println("Enter the row and column for your move: ");
        int row = scanner.nextInt(); // Read an integer
        int col = scanner.nextInt(); // Read an integer

        return new int[]{row, col};
    }

    public void makeMove(){
        int[] move = getMove();
        int row = move[0];
        int col = move[1];

        board.placeMove(row, col, currentPlayer);
        board.display();
        switchPlayer();
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // condition ? value_if_true : value_if_false
    }

    public boolean isGameOver(){
        return false;
    }

}
