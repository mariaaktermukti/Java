public class TwoDArray
{
    public static void main(String[] args) {

        int [][] twoDArray= new int[3][5];
        System.out.println(twoDArray.length);
        System.out.println(twoDArray[0].length);

        for(int i=0;i< twoDArray.length;i++)
        {
            for(int j=0;j< twoDArray[0].length;j++)
            {
                System.out.print(twoDArray[i][j]+" ");
            }
            System.out.println();
        }

        //using for each loop
        for(int [] x:twoDArray)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
