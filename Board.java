import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
public class Board extends JFrame {

    public JPanel[][] squares;

    public Board() {
        setTitle("Kayden's Chess Board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 8));

        squares = new JPanel[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new JPanel();
                //to tyler, the % is used to determain the remainder to determain color
                if ((i + j) % 2 == 0) {
                    squares[i][j].setBackground(new Color (170, 160, 150));
                } else {
                    squares[i][j].setBackground(new Color (40, 30, 30));
                }
                add(squares[i][j]);
            }
        }

        setSize(800, 800);
        setResizable(false); 
        setVisible(true); 
    }
}