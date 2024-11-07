public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle rec1= new Rectangle();
        System.out.println(rec1.getArea());

//        rec1.width=12;
        rec1.setWidth(12);
//        rec1.height=5;
        rec1.setHeight(5);

        Rectangle rec2= new Rectangle();
//        rec2.width=10;
        rec2.setWidth(10);
//        rec2.height=6;
        rec2.setHeight(6);

        System.out.println(rec1.getHeight());
        System.out.println(rec1.getWidth());

        System.out.println("Area of Rec1:"+rec1.getArea());
        System.out.println("Area of Rec2:"+rec2.getArea());

        rec1.increaseWidth();
        System.out.println("Area of Rec2:"+rec1.getArea());
        System.out.println("Area of Rec1:"+rec1.getArea());


        System.out.println(rec1.getArea(12,12));
    }
}
