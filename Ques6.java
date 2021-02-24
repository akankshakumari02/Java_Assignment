import java.util.Random;
import java.util.concurrent.*;

public class Ques6
{
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService ex = Executors.newCachedThreadPool();
        Future<String > future = ex.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {

                Thread.sleep(2000);
                return "\nHello we are in callable...";
            }
        });

        while(!future.isDone())
        {
            System.out.println("\nTask is still not done....");
            Thread.sleep(200);
        }


        if(!future.isCancelled())
        {
            System.out.println("\nTask is not cancelled and is completed now...");
            System.out.println(future.get());
        }
        else
        {
            System.out.println("\nTask was cancelled...");
        }
        ex.shutdown();
    }

}

