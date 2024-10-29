class B extends A{
    void showB(){
        System.out.println("b class method");
    }

    public static void main(String[] args) {
        A ob1= new A();
        ob1.showA();

        B ob2= new B();
        ob2.showA();
        ob2.showB();
    }
}