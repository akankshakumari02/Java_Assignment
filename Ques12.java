import java.util.List;
public class Ques12
{
    public static void main(String args[])
    {
        List<Integer> list = List.of(9,2,12,5,13,30,6,3);
        firstEven(list);
    }
    public static void firstEven(List<Integer> list)
    {
        Integer firsteven = list.stream().filter(x -> x%2==0).filter(x -> x >3).findFirst().get();
        System.out.println("\nFirst even number greater than 3: "+firsteven);
    }
}
