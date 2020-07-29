

class Child extends Parent
{
    public void Print()
    {
        super/*.super*/.Print();
        System.out.println("Child's Print()");
    }
}
