class X
{
    int i = 101010;

    public X()
    {
        i = i++ + i-- - i;
    }

    static int staticMethod(int i)
    {
        return --i;
    }
}