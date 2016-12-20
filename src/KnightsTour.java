/**
 * Created by Timothy on 12/19/2016.
 *
 * Works by trying to tour the Knight across an n-by-n board without
 * going over the same square twice
 *
 * Algorithm -
 * Set the knight to an initial position on an empty board
 * The tour is finished when the knight touches all squares on the board
 */
public class KnightsTour {
    public KnightsTour(){
        knightXPos = 0;
        knightYPos = 0;
    }

    public KnightsTour(int xPos, int yPos){
        knightXPos = xPos;
        knightYPos = yPos;
        board.setBoardSquare(knightXPos, knightYPos, 1);
    }

    public void solveKnightsTour(){
        for (int i = 0; i < board.getBoardSize(); i++) {
            for (int j = 0; j < board.getBoardSize(); j++) {
                knightXPos = i;
                knightYPos = j;
                tour(knightXPos, knightYPos, 1, new Board());
            }
        }
    }
    /*  Base case 1: Knight has successfully toured to all n x n spots
    *       Print the board
    *   Base case 2: Knight has reached a dead end, no valid moves, yet not completed tour
    *       Go back and try a different move
    *
    *    The knight moves 1 of either 4 ways:
    *      2 up 1 left
    *      2 up 1 right
    *      2 down 1 left
    *      2 down 1 right
    */
    public void tour(int row, int col, int moveNum, Board board){
        // Check if valid move
        if (board.setBoardSquare(row, col, moveNum) == -1) {
            return;
        }
        // We reached the end
        if(moveNum == board.getNumSquares()){
            board.printBoard();
            return;
        }

        tour(row + 2, col - 1, moveNum + 1, new Board(board) );
        tour(row + 2, col + 1, moveNum + 1, new Board(board) );
        tour(row - 2, col - 1, moveNum + 1, new Board(board) );
        tour(row - 2, col + 1, moveNum + 1, new Board(board) );
        tour(row + 1, col - 2, moveNum + 1, new Board(board) );
        tour(row + 1, col + 2, moveNum + 1, new Board(board) );
        tour(row - 1, col - 2, moveNum + 1, new Board(board) );
        tour(row - 1, col + 2, moveNum + 1, new Board(board) );
    }

    public int getKnightXPos() {
        return knightXPos;
    }

    public int getKnightYPos() {
        return knightYPos;
    }

    private int knightXPos;
    private int knightYPos;
    private Board board = new Board();
}
