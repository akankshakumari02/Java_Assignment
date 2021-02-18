import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ques1
{
    public static void main(String args[])
    {
        float sum=0;

        List<Float> list = new ArrayList<Float>();

        list.add(5.5f);
        list.add(10.2f);
        list.add(20.4f);
        list.add(3.14f);
        list.add(4.5f);

        System.out.println("Elements in list are : ");
        for(Float val : list)
        {
            System.out.println(val);
        }

        Iterator<Float> iterator = list.iterator();
        while(iterator.hasNext())
        {
            sum+= iterator.next();
        }

        System.out.println("\nSum of floating point numbers in list is : "+sum);
    }
}
