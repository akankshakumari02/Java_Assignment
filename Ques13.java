import java.lang.Exception;
class ClassIdNotFoundException extends Exception
{
    private boolean classStacktrace = false;
    public ClassIdNotFoundException(String msg, boolean classStacktrace)
    {
        super(msg,null,classStacktrace,!classStacktrace);
        this.classStacktrace = classStacktrace;
    }
    public String toString()
    {
        if(classStacktrace)
        {
            return getLocalizedMessage();
        }
        else
        {
            return super.toString();
        }
    }
}

public class Ques13
{
    static void find(String classId) throws ClassIdNotFoundException
    {
        if(classId.equals("223456"))
        {
            System.out.println("Id found");
        }
        else
        {
            throw new ClassIdNotFoundException("\nCould not find class with given id",true);
        }
    }
    public static void main(String args[])  {
        try
        {
            find("67890");
        }catch (ClassIdNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
