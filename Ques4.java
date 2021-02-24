import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ques4
{
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        executor.submit(new Runnable() {
            @Override
            public void run()
            {
                while (true)
                {
                    if(Thread.currentThread().isInterrupted())
                    {
                        System.out.println("interrupted");
                        break;
                    }
                }
            }
        });

        executor.shutdown(); //will execute only currently active process

        if(!executor.awaitTermination(100, TimeUnit.MICROSECONDS))
        {
            System.out.println("\nStill waiting after 100ms..");
            System.exit(0);
        }

        System.out.println("\nExiting normally...");
    }
}
