//import java.util.Scanner;
//import java.util.Random;
//import javax.swing.JFrame;
//import java.awt.Color;

public class Game {
    static Board board;


    public static void main(String [] args){
        Piece pieces[][] = new Piece[2][16];

        //Scanner scan = new Scanner(System.in);
        //Random rand = new Random();
        //JFrame frame = new JFrame("Game Window");   
        board = new Board();

        Menu menu = new Menu(board);
        menu.display();

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 16; j++) {
        if(i == 0) {
                pieces[i][j] = new Pawn(); // Example: initializing all pieces as Pawns
                if(j < 8) {
                    pieces[i][j].setBounds(120 + 72 * j, 110 + 72 * i, 50, 50); // Set bounds for each piece
                } else {
                    pieces[i][j].setBounds(120 + 72 * (j - 8), 110 + 72 * (i + 1), 50, 50); // Set bounds for each piece
                }
                board.add(pieces[i][j].drawPiece());
                    // Initialize pieces for player 1
                }
         else {
                pieces[i][j] = new Pawn(); // Example: initializing all pieces as Pawns
                if(j < 8) {
                    pieces[i][j].setBounds(120 + 72 * j,440 + 72 * i, 50, 50); // Set bounds for each piece
                } else {
                    pieces[i][j].setBounds(120 + 72 * (j - 8), 440 + 72 * (i + 1), 50, 50); // Set bounds for each piece
                }
                board.add(pieces[i][j].drawPiece());
                    // Initialize pieces for player 2
                }
                
            }
        }

        board.setup();

           // scan.close();
    }

}
