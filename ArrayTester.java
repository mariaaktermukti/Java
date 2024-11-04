import java.util.Random;

public class ArrayTester
{
    public static void main(String[] args)
    {
       int a[]={1,2,3,4,5};
        System.out.println(a.length);
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.println(sum);
        System.out.println(a[3]); //element print

        int [] b= new int [6];
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
        //use of "Random" word
        int [] num= new int [100];
        Random rnd= new Random();
        for(int i=0;i<num.length;i++)
            num[i]= rnd.nextInt(num.length);
        for(int i=0;i<num.length;i++)
            System.out.println(num[i]+ " ");

        //reffer
        int [] other;
        other= num;
        for(int i=0;i<other.length;i++)
            num[i]= rnd.nextInt(other.length);
    }
}
