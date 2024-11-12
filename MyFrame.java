import javax.swing.JFrame;
public class MyFrame extends JFrame
{
    private String title="Hello World!";

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }


    public MyFrame()
    {
         super("Bangladesh");
    }
}
