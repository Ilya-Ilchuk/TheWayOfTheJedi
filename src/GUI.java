import javax.swing.*;

public class GUI {
    public GUI() {
        JFrame frame = new JFrame("Win");
        frame.setBounds(200,200, 400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            ImageIcon imageIcon = new ImageIcon("dragon.png");
            frame.setIconImage(imageIcon.getImage());
        } catch (Exception e) {
            e.printStackTrace();
        }


        frame.setVisible(true);




//        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        Container container = super.getContentPane();
//        container.setLayout(new GridLayout(5, 2, 2, 3));
    }
}
