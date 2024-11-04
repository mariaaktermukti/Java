import javax.swing.*;

public class SwingIntro
{
    public static void main(String[] args)
    {
        String name= JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello World" +name);//show msg

    }
}
