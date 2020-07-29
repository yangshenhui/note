class B extends A
{   static String s = " ";
    static
    {
        s = s + "BBBAAA";
    }

    {
        System.out.println(s);
    }
}