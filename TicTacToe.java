public class TicTacToe {
    public static void main(String[] args){
        // Create a new Board object
        Board board = new Board();
        Game game = new Game();

        board.display();  // This should print the empty board

        while(!game.isGameOver()){
            game.makeMove();
        }

    }
}