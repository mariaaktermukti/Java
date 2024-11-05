import java.util.Arrays;

//API = Application programmming interface
public class ArrayAPI
{
    public static void main(String[] args)
    {
         int [] array= {2,6,7,1,17,3,15};

        Arrays.sort(array);

        for(int x:array)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        int [] b= new int [array.length];
        System.arraycopy(array,0,b,0,b.length);
        for(int y: b)
            System.out.print(y+" ");
        System.out.println();

        b[4]=10;
        System.out.println("Array b:");
        for(int y: b)
            System.out.print(y+" ");
        System.out.println();
        System.out.println("Array a:");
        for(int x:array)
        {
            System.out.print(x+" ");
        }
        System.out.println();

    }
}
