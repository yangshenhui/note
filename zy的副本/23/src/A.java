class A
{
    static String s = "AAA";

    static
    {
        s = s + "BBB";
    }

    {
        /*s = "AAABBB";
        System.out.println(s);*/
    }
}