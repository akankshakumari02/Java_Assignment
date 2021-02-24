class Wait1 extends Thread
{
    public void run()
    {
       synchronized (this)
       {
           try
           {
               System.out.println("\n"+Thread.currentThread().getName()+" is waiting..");
               this.wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("\n"+Thread.currentThread().getName()+" notified..");
       }
    }
}
class Wait2 extends Thread {
    Wait1 w1;

    Wait2(Wait1 w1)
    {
        this.w1 = w1;
    }
    public void run() {
        synchronized (this.w1) {
            try {
                System.out.println("\n" + Thread.currentThread().getName() + " is waiting..");
                this.w1.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n" + Thread.currentThread().getName() + " notified..");
        }
    }
}

class Wait3 extends Thread {
    Wait1 w1;

    Wait3(Wait1 w1)
    {
        this.w1 = w1;
    }
    public void run() {
        synchronized (this.w1) { //synching on same object
            System.out.println("\n" + Thread.currentThread().getName() + " is notifying all threads..");
            this.w1.notifyAll();
            System.out.println("\n" + Thread.currentThread().getName() + " notified..");
        }
    }
}
public class Ques14
{
    public static void main(String[] args) throws InterruptedException {
        Wait1 w1 = new Wait1();
        Wait2 w2 = new Wait2(w1);
        Wait3 w3 = new Wait3(w1);

        Thread t1 = new Thread(w1,"Thread1");
        Thread t2 = new Thread(w2,"Thread2");
        Thread t3 = new Thread(w3,"Thread3");

        t1.start();
        t2.start();

        Thread.sleep(1000);
        t3.start();
    }
}
