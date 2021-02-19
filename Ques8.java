interface New_Interface1
{
    public default void defaultMethod()
    {
        System.out.println("\nDefault method of Interface 1");
    }
}

interface New_Interface2
{
    public default void defaultMethod()
    {
        System.out.println("\nDefault method of Interface 2");
    }
}
public class Ques8 implements New_Interface1,New_Interface2
{
    @Override
    public void defaultMethod()
    {
        New_Interface1.super.defaultMethod();

        New_Interface2.super.defaultMethod();
    }

    public static void main(String args[])
    {
        Ques8 obj = new Ques8();
        obj.defaultMethod();
    }
}
