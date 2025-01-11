import javax.swing.JFrame;
import  javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
public class Test
{
    public static void main(String[] args) {
        new myFrame();
    }
}
 class myFrame extends JFrame{
    JLabel l= new JLabel("Mukti's dream!");
    JLabel l2= new JLabel("Shifat's Dream");

    public myFrame(){
        super("Dream");
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
//        setLocation(500,0);
//        setSize(300,500);

        setBounds(500,500,500,500);
        l.setText("Buy a car.");
        Font font= new Font("Monaco", Font.PLAIN, 40);
        l.setFont(font);
        setResizable(false);
        add(l);
        add(l2);
    }
 }