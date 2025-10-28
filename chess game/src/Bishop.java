

public class Bishop extends ChessPiece {

    int n;

    void movement(ChessCases[][] board, int boardSize, ChessPiece piece) {

    }

    void possibleMoves(ChessCases[][] board, int boardSize, ChessPiece piece) {

    while 

    }

    boolean moveD1(ChessCases [][] board ,ChessPiece piece) {
        // up right
        row = row + 1;
        col = col + 1;
        if ( ChessPiece.outOfBounds(row,col) && board[row][col].isTaken == false && board[row][col].chessPiece.color != ChessPiece.color) {
            return true;
        }
        return false;
    }

    boolean moveD2(ChessCases [][] board,int n) {
        // up left
        row = row + 1;
        col = col - 1;
        if ( ChessPiece.outOfBounds(row,col) && board[row][col].isTaken == false && board[row][col].chessPiece.color != ChessPiece.color) {
            return true;
        }
        return false;
    }

    boolean moveD3(ChessCases [][] board,int n) {
        // down right
        row = row - 1;
        col = col + 1;
        if ( ChessPiece.outOfBounds(row,col) && board[row][col].isTaken == false && board[row][col].chessPiece.color != ChessPiece.color) {
            return true;
        }
        return false;
    }

    boolean moveD4(ChessCases [][] board,int n) {
        // down left
        row = row - 1;
        col = col - 1;
        if ( ChessPiece.outOfBounds(row,col) && board[row][col].isTaken == false && board[row][col].chessPiece.color != ChessPiece.color) {
            return true;
        }
        return false;
    }
}
