public class WordCount
{
    public static void wordCount(String str)
    {
        String [] strArray= str.split(" ");
        System.out.println(strArray.length);
    }

    public static void main(String[] args)
    {
        wordCount("Hello Bangladesh!");
    }
}
