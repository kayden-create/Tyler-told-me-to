//import java.util.Scanner;
//import java.util.Random;
//import javax.swing.JFrame;
//import java.awt.Color;

public class Game {

    public static void main(String [] args){
        Piece pieces[][] = new Piece[2][16];
        
        //Scanner scan = new Scanner(System.in);
        //Random rand = new Random();
        //JFrame frame = new JFrame("Game Window");   
        Board board = new Board();
     Menu menu = new Menu();

        
        menu.display();
       
    
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 16; j++) {
        if(i == 0) {
                pieces[i][j] = new Pawn(); // Example: initializing all pieces as Pawns
                if(j < 8) {
                    pieces[i][j].setBounds(118 + 71 * j, 116 + 71 * i, 50, 50); // Set bounds for each piece
                } else {
                    pieces[i][j].setBounds(118 + 71 * (j - 8), 116 + 71 * (i + 1), 50, 50); // Set bounds for each piece
                }
                board.add(pieces[i][j].drawPiece());
                    // Initialize pieces for player 1
                }
         else {
                pieces[i][j] = new whitepawn(); // Example: initializing all pieces as Pawns
                if(j < 8) {
                    pieces[i][j].setBounds(118 + 71 * j,447 + 71 * i, 50, 50); // Set bounds for each piece
                } else {
                    pieces[i][j].setBounds(118 + 71 * (j - 8), 447 + 71 * (i + 1), 50, 50); // Set bounds for each piece
                }
                board.add(pieces[i][j].drawPiece());
                    // Initialize pieces for player 2
                }
                
            }
        }
        
 menu.button.addActionListener(e -> {
            System.out.println("Chess Game Started");
            board.setup();
            menu.undisplay(); // Close the start window
        });
         menu.button2.addActionListener(e -> {
            System.out.println("Checkers Game Started");
            board.setup();
            menu.undisplay();// Close the start window
        });
        
        menu.button3.addActionListener(e -> {
            System.out.println("game exited");
            System.exit(0); // Exit the game
            menu.undisplay();
        });
      board.back.addActionListener(e -> {
            menu.display(); 
            board.undisplay(); // Close the board window 
           
        });
        

           // scan.close();
    }

}
