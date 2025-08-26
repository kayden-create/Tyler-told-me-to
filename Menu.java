import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Menu extends JFrame{
    JButton button, button2, button3;

    public Menu(Board board) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        button = new JButton("Start Chess Game");
        button2 = new JButton("Start Checkers Game");
        button3 = new JButton("Exit Game");
        panel.setBackground(new Color(200, 200, 200));
        panel.setBounds(150, 100, 500, 600);
        JLabel label = new JLabel("Welcome to the Kayden's Game!"); 
        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16)); 
        label.setForeground(new Color(0, 0, 0));
        label.setLayout(null);
        label.setBounds(140, 100, 250, 50);
        panel.add(label);
        panel.setBorder(BorderFactory.createLoweredBevelBorder());
        add(button);
        add(button2);
        add(button3);
        add(panel);

        button.setBounds(300, 250, 200, 50);
        button.setBackground(new Color(100, 150, 255));
        button.setForeground(new Color(0, 0, 0));
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        button.addActionListener(e -> {
            System.out.println("Chess Game Started");
            board.setVisible(true);
            this.dispose(); // Close the start window
        });
        button2.setBounds(300, 350, 200, 50);
        button2.setBackground(new Color(100, 150, 255));
        button2.setForeground(new Color(0, 0, 0));
        button2.setBorder(BorderFactory.createEtchedBorder());
        button2.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        button2.addActionListener(e -> {
            System.out.println("Checkers Game Started");
            board.setVisible(true);
            this.dispose(); // Close the start window
        });
        button3.setBounds(300, 450, 200, 50);
        button3.setBackground(new Color(100, 150, 255));
        button3.setForeground(new Color(0, 0, 0));
        button3.setBorder(BorderFactory.createEtchedBorder());
        button3.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        button3.addActionListener(e -> {
            System.out.println("game exited");
            System.exit(0); // Exit the game
        });
        setTitle("My Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(800, 800);
        setResizable(false);
        
        getContentPane().setBackground(Color.darkGray);
        panel.revalidate();
        panel.repaint();
    }

    void display() {
        setVisible(true);
    }

/*public void actionPerformed(ActionEvent e) {
    if(e.getSource()==button){
        System.out.println("Chess Game Started");
        Board board = new Board();
        board.setVisible(true);
        this.dispose(); // Close the start window
    }
}*/
    
}
