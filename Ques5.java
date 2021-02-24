import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Task());
        executorService.shutdown();
        System.out.println("\nIs the task completed: "+executorService.isTerminated());
        System.out.println("\nIs the thread shutdown: "+executorService.isShutdown());
    }
    static class Task implements Runnable
    {

        @Override
        public void run() {
            try
            {
                System.out.println("\nRunning thread name: "+Thread.currentThread().getName());
                Thread.sleep(1);
                System.out.println("\nCompleted thread name: "+Thread.currentThread().getName());

            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
    }
}


