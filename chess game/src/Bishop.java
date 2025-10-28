

public class Bishop extends ChessPiece {

    int n;

    void move1(ChessCases [][] board ,int n) {
        // up right
        row = row + n;
        col = col + n;
    }

    void move2(ChessCases [][] board,int n) {
        // up left
        row = row + n;
        col = col - n;
    }

    void move3(ChessCases [][] board,int n) {
        // down right
        row = row - n;
        col = col + n;
    }
    void move4(ChessCases [][] board,int n) {
        // down left
        row = row - n;
        col = col - n;
    }

    void nextMove1() {

    }


}
