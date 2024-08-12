Static method:

Class Test
{
  static void display()
   {
     system>out.println("1");
   }

public static void main(String[] args)
  {
   display();
   Xyz.show();
  }

}

Class Xyz
{

   static void show()
   {
    system.out.println("2");
   }
}