import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
public class Start extends JFrame implements ActionListener {
    JButton button;
   public Start() {
         JPanel panel = new JPanel();
        panel.setLayout(null);
        
        panel.setBackground(new Color(200, 200, 200));
        panel.setBounds(150, 100, 500, 600);
        JLabel label = new JLabel("Welcome to the Chess Game!"); 
        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16)); 
        label.setForeground(new Color(0, 0, 0));
        label.setLayout(null);
        label.setBounds(140, 100, 250, 50);
        panel.add(label);
        panel.setBorder(BorderFactory.createLoweredBevelBorder());
        add(panel);

         button = new JButton("Start Chess Game");
        button.setBounds(300, 250, 200, 50);
        button.setBackground(new Color(100, 150, 255));
        button.setForeground(new Color(0, 0, 0));
        button.setBorder(BorderFactory.createEtchedBorder());
       button.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        button.addActionListener(this);
        setTitle("My Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(800, 800);
        setResizable(false);
        add(button);
        getContentPane().setBackground(Color.darkGray);
        setVisible(true);


    }
public void actionPerformed(ActionEvent e) {
      if(e.getSource()==button){
System.out.println("Chess Game Started");
          Board board = new Board();
          board.setVisible(true);
          this.dispose(); // Close the start window

      }
    }
    
}
