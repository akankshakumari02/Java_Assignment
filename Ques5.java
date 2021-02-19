import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ques5
{
    public static void main(String args[])
    {
        List<Integer> numbers = List.of(12,9,10,4,6);

        //Consumer
        Consumer<Integer> println = x -> System.out.println(x);
        System.out.println("From Consumer Functional Interface");
        for(Integer num : numbers)
        {
            println.accept(num);
        }

        //Supplier
        Supplier<Integer> supplier = () -> 2;
        System.out.println("\nFrom Supplier Functional Interface");
        System.out.println(supplier.get());

        //Predicate
        Predicate<Integer> EvenPredicate = x -> x % 2 == 0;
        System.out.println("\nFrom Predicate Functional Interface");
        for (Integer num : numbers) {
            if (EvenPredicate.test(num)) {
                System.out.println(num);
            }
        }

        //Function
        Function<Integer, Integer> MultIntegerFunction = x -> x * x;
        System.out.println("\nFrom Function Functional Interface");
        for(Integer num : numbers)
        {
            System.out.println(MultIntegerFunction.apply(num));
        }
    }
}
