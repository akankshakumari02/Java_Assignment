interface NewInterface2
{
    public default void defaultMethod()
    {
        System.out.println("\nOverriden Default method of Interface");
    }

    void show();
}
public class Ques7 implements NewInterface2
{
    @Override
    public void show()
    {
        System.out.println("\nAbstract method of Interface");
    }

    @Override
    public void defaultMethod()
    {
        System.out.println("\nDefault method of Class");
        NewInterface2.super.defaultMethod();
    }

    public static void main(String args[])
    {
       Ques7 obj = new Ques7();
       obj.defaultMethod();

       obj.show();
    }
}
