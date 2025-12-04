import javax.swing.ImageIcon;
import javax.swing.JLabel;

enum PieceType {
    PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING
}

enum PieceColor {
    WHITE, BLACK
}

public interface Piece {
    JLabel drawPiece();
    void canMove(/*Put in target square to move to */);
    void setBounds(int x, int y, int width, int height);
    PieceType getType();
    PieceColor getColor();
}
