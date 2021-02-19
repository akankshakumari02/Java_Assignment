import java.util.List;
public class Ques9
{
    public static void main(String args[])
    {
        List<Integer> list = List.of(9,2,12,5,13,30,6,3);
        System.out.println("\nEven numbers from the list are : ");
        list.stream()
                .filter(x -> x%2==0)
                .forEach(System.out::println);
    }
}
