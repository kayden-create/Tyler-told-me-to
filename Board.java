import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

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
        JButton back = new JButton("back to menu");
        JLabel one = new JLabel("1");  
        JLabel two = new JLabel("2");
        JLabel three = new JLabel("3");
        JLabel four = new JLabel("4");
        JLabel five = new JLabel("5");
        JLabel six = new JLabel("6");
        JLabel seven = new JLabel("7");
        JLabel eight = new JLabel("8");
        JLabel a = new JLabel("a");
        JLabel b = new JLabel("b");
        JLabel c = new JLabel("c");
        JLabel d = new JLabel("d");
        JLabel ee = new JLabel("e");
        JLabel f = new JLabel("f");
        JLabel g = new JLabel("g");
        JLabel h = new JLabel("h");
        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
        add(six);
        add(seven);
        add(eight);
        add(a);
        add(b);
        add(c);
        add(d);
        add(ee);
        add(f);
        add(g);
        add(h);
        a.setBounds(167, 613, 50, 50);
        b.setBounds(237, 613, 50, 50);
        c.setBounds(307, 613, 50, 50);
        d.setBounds(377, 613, 50, 50);
        ee.setBounds(447, 613, 50, 50);
        f.setBounds(517, 613, 50, 50);
        g.setBounds(587, 613, 50, 50);
        h.setBounds(657, 613, 50, 50);
        a.setForeground(new Color(200, 200, 200));
        b.setForeground(new Color(0, 0, 0));
        c.setForeground(new Color(200, 200, 200));
        d.setForeground(new Color(0, 0, 0));
        ee.setForeground(new Color(200, 200, 200));
        f.setForeground(new Color(0, 0, 0));
        g.setForeground(new Color(200, 200, 200));
        h.setForeground(new Color(0, 0, 0));
        eight.setBounds(115, 97, 50, 50);
        seven.setBounds(115, 165, 50, 50);
        six.setBounds(115, 232, 50, 50);
        five.setBounds(115, 300, 50, 50);
        four.setBounds(115, 367, 50, 50);
        three.setBounds(115, 434, 50, 50);
        two.setBounds(115, 501, 50, 50);
        one.setBounds(115, 568, 50, 50);
        one.setForeground(new Color(200, 200, 200));
        three.setForeground(new Color(200, 200, 200));
        five.setForeground(new Color(200, 200, 200));
        seven.setForeground(new Color(200, 200, 200));
        two.setForeground(new Color(0, 0, 0));
        four.setForeground(new Color(0, 0, 0));
        six.setForeground(new Color(0, 0, 0));
        eight.setForeground(new Color(0, 0, 0));
        JLabel name = new JLabel("Player 1");
        JLabel name2 = new JLabel("Player 2");
        JPanel myboard = new JPanel();
        JPanel player1 = new JPanel();
        JPanel player2 = new JPanel();
        JPanel left = new JPanel();
        JPanel right = new JPanel();
        name.setForeground(new Color(0, 0, 0));
        name2.setForeground(new Color(0, 0, 0));
        name.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        name2.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        player1.add(name);
        player2.add(name2);

        myboard.setLayout(new GridLayout(8, 8));
        squares = new JPanel();
       left.add(back);
       myboard.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        back.addActionListener(e -> {
           Menu menu = new Menu();
           menu.display();
              this.dispose(); // Close the board window
        });
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
        player1.setBackground(new Color(0, 0, 200));
        player2.setBackground(new Color(200, 0, 0));
        left.setBackground(new Color(200, 200, 200));
        right.setBackground(new Color(200, 200, 200));
        myboard.setBounds(100,100, 600, 600);
        this.add(myboard, BorderLayout.CENTER);
        add(player1, BorderLayout.SOUTH);
        add(player2, BorderLayout.NORTH);   
        add(left, BorderLayout.WEST);
        add(right, BorderLayout.EAST);
        setSize(800, 800);
        setResizable(false); 
        setVisible(false); 
        
      
    }
}