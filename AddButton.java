import javax.swing.*;
import java.awt.*;

public class AddButton {
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends JFrame {
    JButton button;
    JLabel label;

    public MyFrame() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new FlowLayout());

        button = new JButton("Click"); // Correct variable name
        label = new JLabel("My name is Mukti");
        add(button);
        add(label);

        Font font= new Font("Ariel", Font.BOLD, 20);
        button.setFont(font);
        button.setBounds(10,10,100,100);
        label.setBounds(100,100,100,100);

        button.setForeground(Color.BLUE);
        button.setBackground(Color.RED);
        button.setOpaque(true);
        button.setBorderPainted(false);// Use 'button', not 'Button'
    }
}
