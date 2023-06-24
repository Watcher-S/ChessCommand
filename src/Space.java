import java.awt.Point;
import java.util.ArrayList;

public class Space {
    
    int row;
    int column;

    public void updatePosition(int rowPosition, int colPosition) {
        row = rowPosition;
        column = colPosition;
    }

    public String toString() {
        return " ";
    }

    public ArrayList<Point> possibleMoves() {
        //FIXME possible moves for space
        ArrayList<Point> moveList = new ArrayList<Point>();
        System.out.println("OH NO");

        return moveList;
    }

    public Boolean isSpace() {
        return true;
    }


    // how it moves -> return option choices

    // can it move?

    // is it white or black



}
