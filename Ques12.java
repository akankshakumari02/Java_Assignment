import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounter
{
    private AtomicInteger num = new AtomicInteger(0);
    public void increment()
    {
        num.incrementAndGet();
    }
    public int value()
    {
        return num.get();
    }
}
public class Ques12 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService ex = null;
        try {
            ex = Executors.newFixedThreadPool(2);
            AtomicCounter obj1 = new AtomicCounter();

            Runnable t1 = () -> {
                for (int i = 0; i < 100; i++) {
                    obj1.increment();
                }
            };
            Runnable t2 = () -> {
                for (int i = 0; i < 100; i++) {
                    obj1.increment();
                }
            };
            ex.execute(t1);
            ex.execute(t2);
            ex.shutdown();
            ex.awaitTermination(1, TimeUnit.SECONDS);
            System.out.println("\nValue of num after getting accessed by several thread: " + obj1.value());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
