import java.util.List;
public class Ques11
{
    public static void main(String args[])
    {
        List<Integer> list = List.of(9,2,12,5,13,30,6,3);
        average(list);
    }
    public static void average(List<Integer> list)
    {
        Double average = list.stream().mapToInt(x -> x*2).average().orElse(0.0);
        System.out.println("\nAverage of Integers after doubling them is: "+average);
    }
}
