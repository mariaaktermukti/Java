public class MultiDArray
{
    public static void main(String[] args)
    {
         int [] singleArray = new int [5];

         for(int i=0;i< singleArray.length;i++)
             System.out.println(singleArray[i]);
        System.out.println("After this loop: ");
         //java type --> for each loop
        for(int x:singleArray){
            x=x+2;
            System.out.println(x);
        }
        System.out.println("After fore each loop:");
        for(int x: singleArray){
            System.out.println(x);
        }
    }
}
