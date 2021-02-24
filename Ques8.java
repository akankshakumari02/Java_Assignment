import java.util.Date;
import java.util.concurrent.*;

class Demo implements Runnable
{

    @Override
    public void run()
    {
        try
        {
            System.out.println("\n"+Thread.currentThread().getName()+"Start.time: "+new Date());
            Thread.sleep(5000);
            System.out.println("\n"+Thread.currentThread().getName()+"End.time: "+new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class Ques8
{
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService ex = Executors.newScheduledThreadPool(3);

        System.out.println("\nSchedule");

        for(int i=0; i<3; i++)
        {
            Thread.sleep(1000);

            Demo d1 = new Demo();

            ex.schedule(d1,2,TimeUnit.SECONDS);
        }
        Thread.sleep(9000);

        System.out.println("\nScheduledAtFixedRate");
        for(int i=0; i<3; i++)
        {
           Thread.sleep(1000);
           Demo d1 = new Demo();
           ex.scheduleAtFixedRate(d1,0,10,TimeUnit.SECONDS);
        }
        Thread.sleep(9000);

        System.out.println("\nScheduledWithFixedDelay");
        for(int i=0; i<3; i++)
        {
           Thread.sleep(1000);
           Demo d1 = new Demo();
           ex.scheduleWithFixedDelay(d1,0,10,TimeUnit.SECONDS);
        }
        ex.shutdown();
    }
}
