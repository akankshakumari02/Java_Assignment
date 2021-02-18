import java.util.*;
public class Ques6
{
    public static void sortArray(int[] arr)
    {
        Map<Integer, Integer> count = new LinkedHashMap<>();
        for (int i = 0; i <arr.length; i++)
        {
            if (count.containsKey(arr[i]))
            {
                count.put(arr[i], count.get(arr[i])+1);
            }
            else
            {
                count.put(arr[i], 1);
            }
        }
        ArrayList<Integer> sortedElements = new ArrayList<>();

        count.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(entry -> {
                    for(int i = 1; i <= entry.getValue(); i++)
                        sortedElements.add(entry.getKey());
                });
        System.out.println("Input Array :"+ Arrays.toString(arr));

        System.out.println("Sorted Array Elements In Decreasing Order Of their Frequency :");

        System.out.println(sortedElements);
    }
    public static void main(String args[])
    {
        int[] array = new int[] {8,2,4,8,3,9,2,2,8,4,3};
        sortArray(array);

    }
}
