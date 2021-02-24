import java.util.Collection;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Lock_class
{
    private int count = 0;
    private Lock lock = new ReentrantLock(); //lock is the class used for making reentrant lock object
    private Condition con = lock.newCondition();//condition interface to implement await(),signal() and signalAll()

    private void increase()
    {
        for(int i=0; i<1000; i++)
        {
            count++;
        }
    }

    public void first() throws InterruptedException {

        System.out.println("\nLock aquired on Thread1..");
        lock.lock();

        System.out.println("\nThread1 waiting..");
        con.await();

        try
        {
            increase();
        } finally {
            lock.unlock();
        }
        System.out.println("\nThread1 Signalled..");
    }

    public void second() throws InterruptedException {

        System.out.println("\nLock aquired on Thread2..");
        lock.lock();

        System.out.println("\nThread2 waiting..");
        con.await();

        try
        {
            increase();
        } finally {
            lock.unlock();
        }
        System.out.println("\nThread2 Signalled..");
    }

    public void third() throws InterruptedException {

        Thread.sleep(1000);
        lock.lock();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nPress Return key..");
        sc.nextLine();
        System.out.println("\nPRESSED");
        con.signalAll();
        try
        {
            increase();
        } finally {
            lock.unlock();
        }
    }

    public void result()
    {
        System.out.println("\nCount is: "+count);
    }
}
public class Ques15
{
    public static void main(String[] args) throws InterruptedException {
        final Lock_class obj = new Lock_class();

        Thread t1 =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj.first();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj.second();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t3 =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj.third();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();

        obj.result();
    }
}
