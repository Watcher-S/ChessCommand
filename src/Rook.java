public class Rook extends Space {
    
    Boolean isWhite;
    int row;
    int column;

    public Rook(Boolean white, int rowPosition, int colPosition) {
        isWhite = white;
        row = rowPosition;
        column = colPosition;
    }

    public void updatePosition(int rowPosition, int colPosition) {
        row = rowPosition;
        column = colPosition;
    }

    public String possibleMoves() {
        return "A1";
    }

    public String toString() {
        if (isWhite) {
            return "♖";
        }
        else {
            return "♜";
        }
    }

}