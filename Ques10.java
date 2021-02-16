import java.util.Scanner;

public class Ques10
{
    void add(int a, int b)
    {
        int sum = a + b;
        System.out.println("Sum of two integers is : "+sum);
    }

    void add(float a, float b)
    {
        float sum = a + b;
        System.out.println("Sum of two floats is : "+sum);
    }

    void mul(float a, float b)
    {
        float product= a * b;
        System.out.println("Product of two floats is : "+product);
    }

    void mul(double a, double b)
    {
        double product= a * b;
        System.out.println("Product of two doubles is : "+product);
    }

    void concat(String s1, String s2)
    {
        String result = s1.concat(" ").concat(s2);
        System.out.println("Two concatenated strings are : "+result);
    }

    void concat(String s1, String s2, String s3)
    {
        String result = s1.concat(" ").concat(s2).concat(" ").concat(s3);
        System.out.println("Three concatenated strings are : "+result);
    }

    public static void main(String args[])
    {
        Ques10 obj = new Ques10();

        Scanner sc = new Scanner(System.in);

        //integer number
        System.out.printf("Enter first integer : ");
        int a = sc.nextInt();
        System.out.printf("Enter second integer : ");
        int b = sc.nextInt();

        //float number
        System.out.printf("Enter first float : ");
        float c = sc.nextFloat();
        System.out.printf("Enter second float : ");
        float d = sc.nextFloat();

        //double number
        System.out.printf("Enter first double : ");
        double x = sc.nextDouble();
        System.out.printf("Enter second double : ");
        double y = sc.nextDouble();

        //input of strings
        String str1 = "Hello";
        String str2 = "Trainees";
        String str3 = "Of JVM";


        //calling add() on integer and float
        obj.add(a,b);
        obj.add(c,d);


        //calling mul() on float and double
        obj.mul(c,d);
        obj.mul(x,y);


        //concatenating string
        obj.concat(str1,str2);
        obj.concat(str1,str2,str3);

    }
}