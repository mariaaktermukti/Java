public class VariableRowArray
{
    public static void main(String[] args)
    {
       int [][] varArray= new int [3][];
       varArray[0]= new int [3];
        varArray[1]= new int [4];
        varArray[2]= new int [2];

        for(int i=0;i< varArray.length;i++)
        {
            for(int j=0;j< varArray[i].length;j++)
            {
                System.out.print(varArray[i][j]);
            }
            System.out.println();
        }
    }
}
