import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JLabel;
//import javax.swing.JFrame;

public class Knight implements Piece {
    Image image;
    ImageIcon icon;
    JLabel label;
    PieceColor color;

    public Knight(PieceColor color) {
        // Initialize the pawn image
        if(color == PieceColor.BLACK){
            if(Util.osIsWindows()) {
                icon = new ImageIcon("img\\knight.png");
            } else {
                icon = new ImageIcon("img/knight.png");
            }
        } else {
            if(Util.osIsWindows()) {
                icon = new ImageIcon("img\\white-knight.png");
            } else {
                icon = new ImageIcon("img/white-knight.png");
            }
        }

        image = icon.getImage();
        icon = new ImageIcon(image.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
        label = new JLabel(icon);
        this.color = color;
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

    @Override
    public PieceType getType(){
        return PieceType.PAWN;
    }

    @Override
    public PieceColor getColor(){
        return color;
    }
}
