/*class Demo
{
    //empty class
}
public class Ques3
{
    public static void main(String args[])
    {
        Demo m = new Demo();
    }
} */

public class Ques3
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("/home/ttn/IdeaProjects/Java/example2/Ques11.java");
        }catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
