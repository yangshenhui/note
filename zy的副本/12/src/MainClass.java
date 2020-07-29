public class MainClass
{
    public static void main(String[] args)
    {
        A a = new A();

        B b = new B(a);

        System.out.println(a.i);

        System.out.println(b.i);

        System.out.println(b.a.i);

        b.a.i = 2121;

        System.out.println("--------");

        System.out.println(a.i);

        System.out.println(b.i);
    }
}