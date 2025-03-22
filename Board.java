public class Board {
    private char[][] board;

    public Board(){
        board = new char[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = ' ';
            }
        }
    }

    public void display(){
        // Loop through each row
        for (int i = 0; i < 3; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < 3; j++) {
                // Print the cell content (either 'X', 'O', or space)
                System.out.print(" ");
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print(" |"); // Add column separators between cells
                }
            }
            System.out.println(); // Move to the next line after each row
            if (i < 2) {
                System.out.println("---+---+---"); // Print horizontal line between rows
            }
        }
    }

    public boolean isMoveValid(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    public void placeMove(int row, int col, char player) {
        if (isMoveValid(row, col)) {
            board[row][col] = player;
        } else {
            System.out.println("Invalid move! Try again.");
        }
    }
    
}
