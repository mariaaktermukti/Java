public class FunctionTest
{
    public static void printSum(int x, int y)
    {
        int z=x+y;
        System.out.println(z);
    }
    //function overloading
    public static void printSum(int x, int y, int w)
    {
        int z=x+y+w;
        System.out.println(z);
    }
    public static void main(String[] args)
    {
        printSum(5,5,5);
    }
}

