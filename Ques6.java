interface NewInterface1
{
    void existingMethod(String str);

    static void staticMethod()
    {
        System.out.println("\nStatic method");
    }

    default void defaultMethod()
    {
        System.out.println("\nDefault Method");
    }
}
public class Ques6 implements NewInterface1
{
    public void existingMethod(String str)
    {
        System.out.println(str);
    }
    public static void main(String args[])
    {
        Ques6 obj = new Ques6();

        obj.defaultMethod(); //default method

        NewInterface1.staticMethod(); //static method of interface

        obj.existingMethod("\nAbstract method of Interface");
    }
}
