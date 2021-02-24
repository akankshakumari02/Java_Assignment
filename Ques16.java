import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Lock_class2 {
    private int count = 0;
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void acquireLock(Lock firstLock, Lock secondLock) throws InterruptedException {
        while(true)
        {
            boolean gotFirstLock = false;
            boolean gotSecondLock = false;

            try
            {
                gotFirstLock = firstLock.tryLock();
                gotSecondLock = secondLock.tryLock();
            }
            finally {
                if(gotFirstLock && gotSecondLock)
                {
                    return;
                }

                if(gotFirstLock)
                {
                    firstLock.unlock();
                }
                if(gotSecondLock)
                {
                    secondLock.unlock();
                }

                Thread.sleep(1);
            }
        }
    }
    private void increase()
    {
        for(int i=0; i<1000; i++)
        {
            count++;
        }
    }
    public void first() throws InterruptedException {

        acquireLock(lock1,lock2);
        Thread.sleep(50);
        try {
            increase();
        } finally {
            lock2.unlock();
            lock1.unlock();
        }
    }
    public void second() throws InterruptedException {
       acquireLock(lock2,lock1);
        Thread.sleep(50);
        try {
            increase();
        } finally {
            lock1.unlock();
            lock2.unlock();
        }
    }

    public void result()
    {
        System.out.println("\nCount is: "+count);
    }
}
public class Ques16
{
    public static void main(String[] args) throws InterruptedException {
        final Lock_class2 obj = new Lock_class2();

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
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        obj.result();

    }
}
