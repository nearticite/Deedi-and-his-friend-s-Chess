public class Pawn extends ChessPiece{
    boolean ifMove = false;

    void move(int row, int col){
        row = row + 1;
    }

    void firstMove(int row, int col){
    if (ifMove){
        row = row + 2;
    }
    }

}
