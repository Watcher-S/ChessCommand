import java.util.Scanner;
import java.util.ArrayList;

public class ChessMain {
    public static void main(String[] args) {
        
        Boolean keepLoopGoing = true;
        Interface newInterface = new Interface();
        Scanner sc = new Scanner(System.in);

        while (keepLoopGoing) {
            
            System.out.print("\npick a pawn (row col): ");
            int rowOriginal = sc.nextInt();
            int columnOriginal = sc.nextInt();
            
            newInterface.printPossibleMoves(rowOriginal, columnOriginal);

            System.out.print("give move (row col): ");
            int rowNew = sc.nextInt();
            int columnNew = sc.nextInt();

            //FIXME make it impossible to make a move thats not on the list of print possible moves;;;

            System.out.println();


            if (columnNew < 0 || rowNew < 0 || columnOriginal < 0 || rowOriginal < 0) {
                keepLoopGoing = false;
                break;
            }

            newInterface.makeMove(rowOriginal, columnOriginal, rowNew, columnNew);
            
            System.out.println("\n\n\n\n\n\n\n");

            newInterface.printBoard();

            System.out.println("");
        }

        sc.close();

    }
}
