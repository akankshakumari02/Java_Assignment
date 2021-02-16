import java.text.DecimalFormat;
import java.util.*;
public class Ques4
{
    public static void main(String args[])
    {
        String str = "Hello @ world 1234 *";
        char input_str[] = str.toCharArray();

        int str_length= input_str.length;
        int upperCase=0;
        int lowerCase=0;
        int digits=0;
        int special_char=0;
        for(char ch: input_str)
        {
            if(Character.isUpperCase(ch))
            {
                upperCase++;
            }
            else if(Character.isLowerCase(ch))
            {
                lowerCase++;
            }
            else if(Character.isDigit(ch))
            {
                digits++;
            }
            else
            {
                special_char++;
            }
        }

        double upperCasePercent=(upperCase*100.00)/str_length;
        double lowerCasePercent=(lowerCase*100.00)/str_length;
        double digitsPercent=(digits*100.00)/str_length;
        double specialcharPercent=(special_char*100.00)/str_length;

        DecimalFormat formatter = new DecimalFormat("##.##");

        System.out.printf("In "+str+" "+"\n");
        System.out.println("Number of uppercase letters are : "+upperCase+" and percentage is : "+formatter.format(upperCasePercent)+"%");
        System.out.println("Number of lowercase letters are : "+lowerCase+" and percentage is : "+formatter.format(lowerCasePercent)+"%");
        System.out.println("Number of digits are : "+digits+" and percentage is : "+formatter.format(digitsPercent)+"%");
        System.out.println("Number of uppercase letters are : "+special_char+" and percentage is : "+formatter.format(specialcharPercent)+"%");
    }
}