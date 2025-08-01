import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
public class Board extends JFrame {

    public JPanel squares;

    public Board() {
        setTitle("Kayden's Chess Board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());;
        JPanel myboard = new JPanel();
                JPanel player1 = new JPanel();
        JPanel player2 = new JPanel();
        JPanel left = new JPanel();
        JPanel right = new JPanel();
        myboard.setLayout(new GridLayout(8, 8));
        squares = new JPanel();
       
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares = new JPanel();
                //to tyler, the % is used to determain the remainder to determain color
                if ((i + j) % 2 == 0) {
                    squares.setBackground(new Color (170, 160, 150));
                } else {
                    squares.setBackground(new Color (40, 30, 30));
                }
                myboard.add(squares);
            }
        }
        player1.setPreferredSize(new Dimension(100,100));
        player2.setPreferredSize(new Dimension(100,100));
        left.setPreferredSize(new Dimension(100,100));
        right.setPreferredSize(new Dimension(100,100));
        player1.setBackground(new Color(200, 200, 200));
        player2.setBackground(new Color(200, 200, 200));
        left.setBackground(new Color(200, 200, 200));
        right.setBackground(new Color(200, 200, 200));
        myboard.setBounds(100,100, 600, 600);
        this.add(myboard, BorderLayout.CENTER);
        add(player1, BorderLayout.NORTH);
        add(player2, BorderLayout.SOUTH);   
        add(left, BorderLayout.WEST);
        add(right, BorderLayout.EAST);
        setSize(800, 800);
        setResizable(true); 
        setVisible(false); 
    }
}