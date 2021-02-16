class Singleton
{
    //static variable obj of type Singleton
    private static Singleton obj = null;
    public String s;

    //private constructor restricted to this class
    private Singleton()
    {
        s = "This is a Singleton class";
    }

    //static method to create instance of Singleton class
    public static Singleton getInstance()
    {
        if(obj == null)
            obj = new Singleton();

        return obj;
    }

}
public class Ques4
{
    public static void main(String args[])
    {
        //instantiating singleton class with variables obj1 and obj2
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.s = (obj1.s).toUpperCase();

        //here obj1 and obj2 will point to the same instance of the class
        System.out.println("String from obj1 is : "+obj1.s);
        System.out.println("String from obj2 is : "+obj2.s);
    }
}
