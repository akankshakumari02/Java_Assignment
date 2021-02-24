import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques3 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();


        Runnable t1 = new Runnable() {

            @Override
            public void run()
            {
                System.out.println("\nRunning thread is: "+Thread.currentThread().getName());
                System.out.println("\nTask started....");
                try
                {
                    Thread.sleep(200);
                }catch (InterruptedException e)
                {
                    System.out.println(e);
                }
                System.out.println("\nTask Ended...");
            }
        };

        Runnable t2 = new Runnable() {

            @Override
            public void run()
            {
                System.out.println("\nRunning thread is: "+Thread.currentThread().getName());
                System.out.println("\nTask started....");
                try
                {
                    Thread.sleep(200);
                }catch (InterruptedException e)
                {
                    System.out.println(e);
                }
                System.out.println("\nTask Ended...");
            }
        };

        Runnable t3 = new Runnable() {

            @Override
            public void run()
            {
                System.out.println("\nRunning thread is: "+Thread.currentThread().getName());
                System.out.println("\nTask started....");
                try
                {
                    Thread.sleep(200);
                   // wait(200);
                }catch (InterruptedException e)
                {
                    System.out.println(e);
                }
                System.out.println("\nTask Ended...");

            }
        };
        executorService.submit(t1);
        executorService.submit(t2);
        executorService.submit(t3);
        executorService.shutdown();
        boolean result =  executorService.isShutdown();
        System.out.println(result);
    }
}