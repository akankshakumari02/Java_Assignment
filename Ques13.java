import java.lang.Exception;
class ClassIdNotFoundException extends Exception
{
    public ClassIdNotFoundException(String msg, boolean enableSuppression, boolean writeableStackTrace)
    {
        super(msg,null,enableSuppression,writeableStackTrace);
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
            throw new ClassIdNotFoundException("\nCould not find class with Id "+classId,false,false);
        }
    }
    public static void main(String args[])  {
        try
        {
            find("67890");
        }catch (ClassIdNotFoundException e)
        {
            System.out.println("Exception Occured ");
            e.printStackTrace();
        }
    }
}

