public class ExceptionOrder
{
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=-1;
        try
        {
            c=a/b;
        }
        catch(ArithmeticException e)
        {
            c=0;
            System.out.println("in arithmetic exception catch!");
        }
        catch(Exception e)
        {
            c=-10;
            System.out.println("In parent exception catch!");
        }

    }
}
