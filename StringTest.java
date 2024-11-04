public class StringTest
{
    public static void main(String[] args) {
        String firstName= "         Sakib          ";
        //how "trim" works---> used to remove space
        System.out.println(firstName.trim());
        String middleName= new String( new char[]{ 'a','l'});
        String lastName= new String("   Hasan     ");

        String fullName= firstName.trim()+middleName+lastName;
        System.out.println(fullName);

        //replace
        System.out.println(firstName.replace('S', 'B'));


        // string er sathe int add kora
         String num="123";
         int x= Integer.parseInt(num);
         x=x+7;
        System.out.println(x);




    }

}
