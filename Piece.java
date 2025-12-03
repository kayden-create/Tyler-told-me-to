import javax.swing.ImageIcon;
import javax.swing.JLabel;
public interface Piece {
    JLabel drawPiece();
    void canMove(/*Put in target square to move to */);
    void setBounds(int x, int y, int width, int height);
    
}
