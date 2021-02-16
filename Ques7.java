import java.util.Scanner;
public class Ques7
{
    static void convert(int num)
    {
        int day = num / (24 * 3600);
        num = num % (24*3600);
        int hour = (num / 3600);
        num = num % 3600;
        int min = (num / 60);
        num = num % 60;
        int sec = num;

        System.out.println(day+"days"+" "+hour+"hours"+" "+min+"min"+" "+sec+"sec"+" ");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter seconds :");
        int sec = sc.nextInt();

        convert(sec);
    }
}
