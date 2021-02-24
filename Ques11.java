import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Ques11
{
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();
    private static int count = 0;
    private static Random num = new Random();
    private static List<Integer> list1 = new ArrayList<Integer>();
    private static List<Integer> list2 = new ArrayList<Integer>();
    public static  void process_one()
    {
        synchronized (lock1)
        {
            try
            {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(num.nextInt(100));
        }
    }
    public static  void process_two()
    {
        synchronized (lock2)
        {
            try
            {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(num.nextInt(100));
        }
    }
    public static void process()
    {
        for(int i=0; i<1000; i++)
        {
            process_one();
            process_two();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("\nStarting...");
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        long end = System.currentTimeMillis();
        System.out.println("\nTotal time taken: "+(end - start));
        System.out.println("\nList1: "+list1.size()+"\tList2: "+list2.size());
    }
}
