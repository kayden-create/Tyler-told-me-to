import javax.swing.JFrame;
import java.awt.Color;
public class Board extends JFrame {
    public Board() {
        setTitle("Game Board");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(25, 10, 10));
        setResizable(false);
        setVisible(true);
    }

    
}
