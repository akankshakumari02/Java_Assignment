import java.text.SimpleDateFormat;
import java.util.Date;

public class Ques8
{
    public static void main(String args[])
    {
        Date date = new Date();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMMM-yyyy");
        dateformat = new SimpleDateFormat("dd-MMMM-yyyy");
        String strdate = dateformat.format(date);
        System.out.println("\nDATE FORMAT :\n"+strdate);
    }
}
