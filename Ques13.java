import java.util.Scanner;
class Produce
{
    public void producer() throws InterruptedException
    {
        synchronized (this)
        {
            System.out.println("\nProducer.....");
            wait(); //wait
            System.out.println("\nResumed"); //will invoke when other method will notify it
        }
    }

    public void consumer() throws InterruptedException
    {
        Thread.sleep(2000);
        Scanner sc = new Scanner(System.in);
        synchronized (this)
        {
            System.out.println("\nConsumer.....");
            System.out.println("\nWaiting to press key...");
            sc.nextLine();
            System.out.println("\nReturn key pressed...");
            notify(); //will notify the producer thread to wake up
            Thread.sleep(2000);
        }
    }
}
public class Ques13{
    public static void main(String[] args) throws InterruptedException {
        final Produce obj = new Produce();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try
                {
                    obj.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try
                {
                    obj.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
