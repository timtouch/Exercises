import java.util.ArrayList;

/**
 * Created by Timothy on 12/19/2016.
 * 2D array to represent board
 */
public class Board {
    private int[][] board = new int[5][5];

    // Sets all elements in board to 0, although I think it does that by default
    public Board(){
        for ( int[] row: board){
             for ( int col: row){
                 col = 0;
             }
        }
    }
    // Shallow copy constructor
    public  Board(Board board){
        for (int i = 0; i < board.getBoardSize() ; i++) {
            for (int j = 0; j < board.getBoardSize(); j++) {
                setBoardSquare(i,j,board.getBoardSquare(i,j));
            }
        }
    }

    // Returns -1 if invalid array index or value is already set
    // else returns the value put into the element
    public int setBoardSquare(int row, int col, int value) {
        if (row >= getBoardSize() || col >= getBoardSize() || row < 0 || col < 0){
            return -1;
        } else if (board[row][col] > 0){
            return -1;
        }
        board[row][col] = value;
        return value;
    }

    public int getBoardSquare(int row, int col){
        return board[row][col];
    }

    public int getBoardSize(){
        return board.length;
    }

    public int getNumSquares(){
        return (int) Math.pow(board.length, 2);
    }


    public void printBoard() {
        for(int[] row: board){
            for(int col: row){
                System.out.printf(" %3d ", col);
            }
            System.out.println();
        }
        System.out.println();
    }
}
