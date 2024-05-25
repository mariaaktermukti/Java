import java.util.Scanner;

public class UserInPut {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter name :");
        String name = s.next();

        System.out.println("Enter age :");
        int age = s.nextInt();

        System.out.println("Enter gender :");
        char gender = s.next().charAt(0);

        

        System.out.println("----------------------------------");

        System.out.println("name is :" + name);
        System.out.println("age is :" + age);
        System.out.println("gender is :" + gender);
        

    }

}