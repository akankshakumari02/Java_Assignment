import java.util.Scanner;
interface CalculateFunction1<T>
{
        boolean greater(int num1,int num2);
}
interface CalculateFunction2<T>
{
    int incr(int num);
}
interface CalculateFunction3<T>
{
    String concat(String str1, String str2);
}
interface CalculateFunction4<T>
{
    String upperCase(String str);
}

public class Ques1
{
    public static void main(String args[])
    {
        CalculateFunction1 func1=((num1, num2) -> num1>num2);
        boolean greater = func1.greater(40,20);
        System.out.println("\nIs First Number Greater than Second: "+greater);

        CalculateFunction2 func2 = (x) -> (x + 1);
        int result = func2.incr(20);
        System.out.println("\nIncremented value is: "+result);

        CalculateFunction3 func3 = (x , y) -> ( x + " "+ y);
        String str_final= func3.concat("Hello","Everyone");
        System.out.println("\nConcatenated String is: "+str_final);


        CalculateFunction4 func4=(str -> str.toUpperCase());
        String upper = func4.upperCase("akanksha");
        System.out.println("\nUpperCase String: "+upper);
    }
}
