public class King extends ChessPiece{


    void move1(int row, int col){
        row = row + 1;
        col = col + 1;
    }
    void move2(int row, int col){
        row = row + 1;
        col = col - 1;
    }
    void move3(int row, int col){
        row = row + 1;
        col = col + 0;
    }
    void move4(int row, int col){
        row = row + 0;
        col = col + 1;
    }
    void move5(int row, int col){
        row = row - 1;
        col = col + 1;
    }
    void move6(int row, int col){
        row = row - 1;
        col = col + 0;
    }
    void move7(int row, int col){
        row = row - 1;
        col = col - 1;
    }
    void move8(int row, int col){
        row = row + 0;
        col = col -  1;
    }
}
