public class Rook extends ChessPiece{
    int n;

    void move1(int row, int col) {
        row = row + n;
        col = col + 0;
    }
    void move2(int row, int col) {
        row = row + 0;
        col = col + n;
    }
    void move3(int row, int col) {
        row = row - n;
        col = col + 0;
    }
    void move4(int row, int col) {
        row = row + 0;
        col = col - n;
    }
}
