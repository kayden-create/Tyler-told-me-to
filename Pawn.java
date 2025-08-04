import javax.swing.JLabel;
public class Pawn implements Piece {
    @Override
    public JLabel drawPiece() {
        JLabel pawnImage = new JLabel("path/to/pawn/image.png");
        // Implementation for drawing a pawn piece
       
        System.out.println("TO DO: Needs implemented");
        return pawnImage;
    } 

    @Override
    public void canMove(/*Put in target square to move to */) {
        // Implementation for checking if the pawn can move to the target square
        System.out.println("Checking if pawn can move to the target square.");
    }
}