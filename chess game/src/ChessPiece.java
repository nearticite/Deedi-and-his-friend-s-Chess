public class ChessPiece {

    String name;
    static boolean color;
    int row;
    int col;

    public static boolean outOfBounds(int row, int col) {
        if (row < 0 || col < 0 || row > 7 || col > 7) { return false;}
        return true;
    }

}



