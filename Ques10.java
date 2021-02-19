import java.util.List;
public class Ques10
{
    public static void main(String args[])
    {
        List<Integer> list = List.of(9,2,12,5,13,30,6,3);
        System.out.println("\nSum of Integers greater than 5 is: "+sum(list));
    }
    public static int sum(List<Integer> list)
    {
        return  list.stream().filter(x -> x > 5).mapToInt(x -> x).sum();
    }
}
