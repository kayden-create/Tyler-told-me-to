import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JLabel;
//import javax.swing.JFrame;
public class whiteBishop implements Piece {
    Image image;
    ImageIcon icon;
    JLabel label;

    public whiteBishop() {
        // Initialize the pawn image
        icon = new ImageIcon("img\\black-pawn.png");
        image = icon.getImage();
        icon = new ImageIcon(image.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
        label = new JLabel(icon);
    }

    @Override
    public JLabel drawPiece() {
        return label;
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        label.setBounds(x, y, width, height);
    }

    @Override
    public void canMove(/*Put in target square to move to */) {
        // Implementation for checking if the pawn can move to the target square
        System.out.println("Checking if pawn can move to the target square.");
    }
}