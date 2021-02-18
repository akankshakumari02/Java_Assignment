import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Ques9
{
    public static void main(String args[])
    {
        Date d = new Date();
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Kolkata");
        SimpleDateFormat date_Format = new SimpleDateFormat("dd-MM-yy EEE hh:mm:ss");
        String current_Date_Time = date_Format.format(d);
        System.out.println("\nTime's in different part of country : ");
        System.out.println("\nAsia/Kolkata : "+current_Date_Time);

        timeZone = TimeZone.getTimeZone("Australia/Darwin");
        date_Format.setTimeZone(timeZone);
        current_Date_Time = date_Format.format(d);
        System.out.println("\nAustralia/Darwin : "+current_Date_Time);

        timeZone = TimeZone.getTimeZone("Europe/Paris");
        date_Format.setTimeZone(timeZone);
        current_Date_Time = date_Format.format(d);
        System.out.println("\nEurope/Paris : "+current_Date_Time);

        System.out.println("\nTime in different country format : ");
        Locale l1 = new Locale("it","ch");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL,l1);
        System.out.println("\nIn Italian language today is : "+dateFormat.format(d));

        l1 = new Locale("en","ch");
        dateFormat = DateFormat.getDateInstance(DateFormat.FULL,l1);
        System.out.println("\nIn English language today is : "+dateFormat.format(d));

        l1 = new Locale("ar","ch");
        dateFormat = DateFormat.getDateInstance(DateFormat.FULL,l1);
        System.out.println("\nIn Arabic language today is : "+dateFormat.format(d));
    }
}
