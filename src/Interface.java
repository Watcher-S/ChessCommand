import java.util.ArrayList;
import java.awt.Point;

public class Interface {
    
    Space[][] chessBoard;
    

    public Interface() {
        // create the chess board
        chessBoard = new Space[8][8];
        
        // initialize all chess pieces at their correct places
        chessBoard[0][0] = new Rook(false, 0, 0);
        chessBoard[0][1] = new Knight(false, 0, 1);
        chessBoard[0][2] = new Bishop(false, 0, 2);
        chessBoard[0][3] = new Queen(false, 0, 3);
        chessBoard[0][4] = new King(false, 0, 4);
        chessBoard[0][5] = new Bishop(false, 0, 5);
        chessBoard[0][6] = new Knight(false, 0, 6);
        chessBoard[0][7] = new Rook(false, 0, 7);
        
        chessBoard[1][0] = new Pawn(false, 1, 0);
        chessBoard[1][1] = new Pawn(false, 1, 1);
        chessBoard[1][2] = new Pawn(false, 1, 2);
        chessBoard[1][3] = new Pawn(false, 1, 3);
        chessBoard[1][4] = new Pawn(false, 1, 4);
        chessBoard[1][5] = new Pawn(false, 1, 5);
        chessBoard[1][6] = new Pawn(false, 1, 6);
        chessBoard[1][7] = new Pawn(false, 1, 7);

        chessBoard[2][0] = new Space();
        chessBoard[2][1] = new Space();
        chessBoard[2][2] = new Space();
        chessBoard[2][3] = new Space();
        chessBoard[2][4] = new Space();
        chessBoard[2][5] = new Space();
        chessBoard[2][6] = new Space();
        chessBoard[2][7] = new Space();

        chessBoard[3][0] = new Space();
        chessBoard[3][1] = new Space();
        chessBoard[3][2] = new Space();
        chessBoard[3][3] = new Space();
        chessBoard[3][4] = new Space();
        chessBoard[3][5] = new Space();
        chessBoard[3][6] = new Space();
        chessBoard[3][7] = new Space();

        chessBoard[4][0] = new Space();
        chessBoard[4][1] = new Space();
        chessBoard[4][2] = new Space();
        chessBoard[4][3] = new Space();
        chessBoard[4][4] = new Space();
        chessBoard[4][5] = new Space();
        chessBoard[4][6] = new Space();
        chessBoard[4][7] = new Space();

        chessBoard[5][0] = new Space();
        chessBoard[5][1] = new Space();
        chessBoard[5][2] = new Space();
        chessBoard[5][3] = new Space();
        chessBoard[5][4] = new Space();
        chessBoard[5][5] = new Space();
        chessBoard[5][6] = new Space();
        chessBoard[5][7] = new Space();

        chessBoard[6][0] = new Pawn(true, 6, 0);
        chessBoard[6][1] = new Pawn(true, 6, 1);
        chessBoard[6][2] = new Pawn(true, 6, 2);
        chessBoard[6][3] = new Pawn(true, 6, 3);
        chessBoard[6][4] = new Pawn(true, 6, 4);
        chessBoard[6][5] = new Pawn(true, 6, 5);
        chessBoard[6][6] = new Pawn(true, 6, 6);
        chessBoard[6][7] = new Pawn(true, 6, 7);

        chessBoard[7][0] = new Rook(true, 7, 0);
        chessBoard[7][1] = new Knight(true, 7, 1);
        chessBoard[7][2] = new Bishop(true, 7, 2);;
        chessBoard[7][3] = new Queen(true, 7, 3);
        chessBoard[7][4] = new King(true, 7, 4);
        chessBoard[7][5] = new Bishop(true, 7, 5);
        chessBoard[7][6] = new Knight(true, 7, 6);
        chessBoard[7][7] = new Rook(true, 7, 7);
        
        // print the new chess board
        printBoard();

        //FIXME pawn moves
        System.out.println(chessBoard[6][6].possibleMoves());
        System.out.println(chessBoard[1][4].possibleMoves());
    }



    public void printBoard() {
        System.out.println("====================================");
        System.out.println("0 || " + chessBoard[0][0] + " | " + chessBoard[0][1] + " | " + chessBoard[0][2] + " | " + chessBoard[0][3] + " | " + chessBoard[0][4] + " | " + chessBoard[0][5] + " | " + chessBoard[0][6] + " | " + chessBoard[0][7] + " |");
        System.out.println("------------------------------------");
        System.out.println("1 || " + chessBoard[1][0] + " | " + chessBoard[1][1] + " | " + chessBoard[1][2] + " | " + chessBoard[1][3] + " | " + chessBoard[1][4] + " | " + chessBoard[1][5] + " | " + chessBoard[1][6] + " | " + chessBoard[1][7] + " |");
        System.out.println("------------------------------------");
        System.out.println("2 || " + chessBoard[2][0] + " | " + chessBoard[2][1] + " | " + chessBoard[2][2] + " | " + chessBoard[2][3] + " | " + chessBoard[2][4] + " | " + chessBoard[2][5] + " | " + chessBoard[2][6] + " | " + chessBoard[2][7] + " |");
        System.out.println("------------------------------------");
        System.out.println("3 || " + chessBoard[3][0] + " | " + chessBoard[3][1] + " | " + chessBoard[3][2] + " | " + chessBoard[3][3] + " | " + chessBoard[3][4] + " | " + chessBoard[3][5] + " | " + chessBoard[3][6] + " | " + chessBoard[3][7] + " |");
        System.out.println("------------------------------------");
        System.out.println("4 || " + chessBoard[4][0] + " | " + chessBoard[4][1] + " | " + chessBoard[4][2] + " | " + chessBoard[4][3] + " | " + chessBoard[4][4] + " | " + chessBoard[4][5] + " | " + chessBoard[4][6] + " | " + chessBoard[4][7] + " |");
        System.out.println("------------------------------------");
        System.out.println("5 || " + chessBoard[5][0] + " | " + chessBoard[5][1] + " | " + chessBoard[5][2] + " | " + chessBoard[5][3] + " | " + chessBoard[5][4] + " | " + chessBoard[5][5] + " | " + chessBoard[5][6] + " | " + chessBoard[5][7] + " |");
        System.out.println("------------------------------------");
        System.out.println("6 || " + chessBoard[6][0] + " | " + chessBoard[6][1] + " | " + chessBoard[6][2] + " | " + chessBoard[6][3] + " | " + chessBoard[6][4] + " | " + chessBoard[6][5] + " | " + chessBoard[6][6] + " | " + chessBoard[6][7] + " |");
        System.out.println("------------------------------------");
        System.out.println("7 || " + chessBoard[7][0] + " | " + chessBoard[7][1] + " | " + chessBoard[7][2] + " | " + chessBoard[7][3] + " | " + chessBoard[7][4] + " | " + chessBoard[7][5] + " | " + chessBoard[7][6] + " | " + chessBoard[7][7] + " |");
        System.out.println("====================================");
        System.out.println("  || 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |");
    }



    public void makeMove(int rowOG, int columnOG, int rowNEW, int columnNEW) {
        chessBoard[rowOG][columnOG].updatePosition(rowNEW, columnNEW);
        
        chessBoard[rowNEW][columnNEW] = chessBoard[rowOG][columnOG];
        chessBoard[rowOG][columnOG] = new Space();

    }

    public void printPossibleMoves(int row, int column) {
        System.out.println("====================================");
        //FIXME possible moves print

    }



}