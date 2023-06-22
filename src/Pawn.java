import java.util.ArrayList;
import java.awt.Point;

public class Pawn extends Space {
    
    Boolean isWhite;
    int row;
    int column;

    public Pawn(Boolean white, int rowPosition, int colPosition) {
        isWhite = white;
        row = rowPosition;
        column = colPosition;
    }

    public void updatePosition(int rowPosition, int colPosition) {
        row = rowPosition;
        column = colPosition;
    }

    public ArrayList<Point> possibleMoves() {
        //FIXME en passant???
        ArrayList<Point> moveList = new ArrayList<Point>();

        if (isWhite) {
            if (row > 0) {
                //regular move
                Point regularMove = new Point(row-1, column);
                moveList.add(regularMove);

                // if still in OG position
                if (row == 6) {
                    Point jumpMove = new Point(row-2, column);
                    moveList.add(jumpMove);
                }

                //when taking a pawn
                Point takeLeft = new Point(row-1, column-1);
                moveList.add(takeLeft);
                
                Point takeRight = new Point(row-1, column+1);
                moveList.add(takeRight);

            }
            else {
                System.out.println("OUT OF BOUNDS TOP");
            }

        }
        else {
            if (row < 7) {
                //regular move
                Point regularMove = new Point(row+1, column);
                moveList.add(regularMove);

                // if still in OG position
                if (row == 1) {
                    Point jumpMove = new Point(row+2, column);
                    moveList.add(jumpMove);
                }

                //when taking a pawn
                Point takeLeft = new Point(row+1, column-1);
                moveList.add(takeLeft);
                
                Point takeRight = new Point(row+1, column+1);
                moveList.add(takeRight);

            }
            else {
                System.out.println("OUT OF BOUNDS BOTTOM");
            }

        }

        return moveList;
    }

    public String toString() {
        if (isWhite) {
            return "♙";
        }
        else {
            return "♟︎";
        }
    }

}
