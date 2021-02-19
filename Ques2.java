interface AdditionInterface<Integer>
{
    int sum(int num1, int num2);
}
public class Ques2
{
    public static void main(String args[])
    {
        AdditionInterface res = (x, y) -> (x + y);
        int result = res.sum(20,30);
        System.out.println("\nSum: "+result);
    }
}
