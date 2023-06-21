import java.util.Scanner;

public class ChessMain {
    public static void main(String[] args) {
        
        Boolean keepLoopGoing = true;
        Interface newInterface = new Interface();
        Scanner sc = new Scanner(System.in);

        while (keepLoopGoing) {
            
            System.out.print("Give Position of Pawn (row,col): ");
            int rowOriginal = sc.nextInt();
            int columnOriginal = sc.nextInt();
            
            System.out.print("\nGive Move (row,col): ");
            int rowNew = sc.nextInt();
            int columnNew = sc.nextInt();
            System.out.println();

            if (columnNew < 0 || rowNew < 0 || columnOriginal < 0 || rowOriginal < 0) {
                keepLoopGoing = false;
                break;
            }

            newInterface.makeMove(rowOriginal, columnOriginal, rowNew, columnNew);
            
            System.out.println("\n\n\n\n\n\n\n");

            newInterface.printBoard();

            System.out.println("\n\n\n");
        }

    }
}
