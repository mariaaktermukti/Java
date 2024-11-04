import java.util.StringTokenizer;

public class StringTester
{
    public static void main(String[] args)
    {
        String str = "Bangladesh";
        System.out.println(str);
        str = str + " wins the match";
        System.out.println(str);

        String newStr= str;
        System.out.println(str);

        newStr = newStr + " againts WI";
        System.out.println(str);
        System.out.println(newStr);

        StringTokenizer tkzer= new StringTokenizer(newStr);
        System.out.println("The tokens are as following:");

        while(tkzer.hasMoreTokens())
        {
            System.out.println(tkzer.nextToken());
        }
        System.out.println(newStr.toUpperCase());


        String [] myArray= newStr.split(" ");
        for(int i=0;i< myArray.length;i++)
        {
            System.out.println(i +" :"+ myArray[i]);
        }
    }
}
