import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       System.out.println("Enter number for fibonacci series :"); 
       int no=s.nextInt();
       int a=0,b=1;
        System.out.println(a+""+b);
       
        int c;
        for(int i=1;i<=no;i++){
            c=a+b;
            System.out.println(""+c);
            a=b;
            b=c;
        }
    }
}
