public class Multithreading implements Runnable
{
    public void run()
    {
        System.out.println("\n Implementing Runnable interface...");
    }
    public static void main(String[] args)
    {
        Multithreading obj1 = new Multithreading();
        Thread t1 = new Thread(obj1);
        t1.start();
    }
}
