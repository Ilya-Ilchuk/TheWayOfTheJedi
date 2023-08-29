import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    public GUI() {
        JFrame frame = new JFrame("Win");
        frame.setBounds(400,0, 800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.GRAY);
        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5, 2, 2, 3));
        frame.setVisible(true);
        JLabel label = new JLabel("Hello, Swing!");
        label.setFont(new Font("Arial", Font.PLAIN, 24));
        JButton button = new JButton("Click Me!");
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(button);
        System.out.println(frame.getX());
        button.setBackground(Color.RED); // new...
    }
}
