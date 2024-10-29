class B extends A{
    void showB(){
        System.out.println("b class method");
    }
}
class C extends B{
    void showC(){
        System.out.println("c clas method");
    }

    public static void main(String[] args) {
        A ob1=  new A();
        ob1.showA();
        System.out.println("--------------------");

        B ob2= new B();
        ob2.showA();
        ob2.showB();
        System.out.println("--------------------");

        C ob3=new C();
        ob3.showA();
        ob3.showB();
        ob3.showC();
    }
}