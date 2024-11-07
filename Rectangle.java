public class Rectangle
{
    //member attributes-->noun
   private int height;    //height & width --> field
    private int width;


    //for width
    public int getWidth() {
        return width;
    }

    public void setWidth(int w) {
        width = w;
    }

    //for height
    public int getHeight()
 {
     return height;
 }
 public void setHeight(int h)
 {
     height=h;
 }


 public int getArea(int w, int h)
 {
     return w*h;
 }
    //member methods-->verb/actions
    public int getArea()
    {
        return height*width; // methods
    }

    public void increaseWidth()
    {
        width++;
    }
}
