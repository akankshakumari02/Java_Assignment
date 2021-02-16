import java.util.Scanner;
public class Ques8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a word: ");
        String str = sc.next();

        while(!str.equals("done"))
        {
            if(str.charAt(0) == str.charAt(str.length()-1))
            {
                System.out.println("First and last character of "+str+" is equal");
            }
            else
            {
                System.out.println("First and last character of "+str+" is not equal");
            }
            System.out.println(" ");
            System.out.printf("Enter a word again or type done to quit : ");
            str = sc.next();
        }


        /*do {
                if(str.charAt(0) == str.charAt(str.length()-1))
                {
                    System.out.println("First and last character of "+str+" is equal");
                }
                else
                {
                    System.out.println("First and last character of "+str+" is not equal");
                }
                System.out.println(" ");
                System.out.printf("Enter a word again or type done to quit : ");
                str = sc.next();

        }while(!str.equals("done")); */
    }
}
