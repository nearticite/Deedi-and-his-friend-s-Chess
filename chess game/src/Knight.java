public class Knight extends ChessPiece {

    boolean nextMove;

    void move1(int row, int col){
        row = row + 2;
        col = col + 1;
    }
    void move2(int row, int col){
        row = row + 2;
        col = col - 1;
    }
    void move3(int row, int col){
        row = row - 2;
        col = col + 1;
    }
    void move4(int row, int col){
        row = row - 2;
        col = col - 1;
    }
    void move5(int row, int col){
        row = row + 1;
        col = col + 2;
    }
    void move6(int row, int col){
        row = row + 1;
        col = col - 2;
    }
    void move7(int row, int col){
        row = row - 1;
        col = col + 2;
    }
    void move8(int row, int col){
        row = row - 1;
        col = col - 2;
    }

    void nextMoves(int row, int col){
        move1(row, col);
        nextMove = true;
        move2(row, col);
        nextMove = true;
        move3(row, col);
        nextMove = true;
        move4(row, col);
        nextMove = true;
        move5(row, col);
        nextMove = true;
        move6(row, col);
        nextMove = true;
        move7(row, col);
        nextMove = true;
        move8(row, col);
        nextMove = true;

    }
}
