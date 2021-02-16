import java.util.*;
class Bank
{
    public void getDetails()
    {
        System.out.println("I am the main Bank class");
    }
}
class SBI extends Bank
{
    public void getDetails()
    {
        System.out.println("**************");
        int rateofInterest = 8;
        System.out.println("SBI BANK");
        System.out.println("Founded : 1995");
        System.out.println("Home loan : 6.80%* p.a.");
        System.out.println("Rate of interest is : "+rateofInterest+"%");
    }
}
class BOI extends Bank
{
    public void getDetails()
    {
        System.out.println("**************");
        int rateofInterest = 7;
        System.out.println("BOI BANK");
        System.out.println("Founded : 1955");
        System.out.println("Home loan : 5.80%* p.a.");
        System.out.println("Rate of interest is : "+rateofInterest+"%");
    }
}
class ICICI extends Bank
{
    public void getDetails()
    {
        System.out.println("**************");
        int rateofInterest = 10;
        System.out.println("ICICI BANK");
        System.out.println("Founded : 1994");
        System.out.println("Home loan : 7.80%* p.a.");
        System.out.println("Rate of interest is : "+rateofInterest+"%");
    }
}
public class Ques11
{
    public static void main(String args[])
    {
        Bank obj = new Bank();
        SBI sb = new SBI();
        BOI bo = new BOI();
        ICICI ic = new ICICI();

        obj.getDetails();
        sb.getDetails();
        bo.getDetails();
        ic.getDetails();

    }
}
