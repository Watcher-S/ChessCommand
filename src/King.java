public class King extends Space {
    
    Boolean isWhite;
    int row;
    int column;

    public King(Boolean white, int rowPosition, int colPosition) {
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

    public Boolean isSpace() {
        return false;
    }

    public String toString() {
        if (isWhite) {
            return "♔";
        }
        else {
            return "♚";
        }
    }

}
