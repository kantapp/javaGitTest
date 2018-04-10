
public class Hello 
{
    private  void add(int a,int b)
    {
        System.out.print(a+b);
    }

    public static void main(String args[])
    {
        Hello hello=new Hello();
        hello.add(10, 20);
    }
}