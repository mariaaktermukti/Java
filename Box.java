package PackageOne;

public class Box
{
    private int x=15;
    public int y=10;
    protected int z=5;

    public void pubFunct()
    {
        System.out.println("In the public function");
        System.out.println(this.x);
        this.pubFunct();
    }

    private void priFunct()
    {
        System.out.println("In the private function");
        System.out.println(this.z);
    }
}
