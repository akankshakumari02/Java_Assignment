public class Ques2 extends Thread
{
    @Override
    public void run()
    {
        int i =1;
        for(i = 1; i<5 ; i++)
        {
            System.out.println("\n Hello "+i);
            try {
                Thread.sleep(500); //gap of 500ms
            } catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args)
    {
        Ques2 thread_obj1 = new Ques2(); //Thread 1 object
        Ques2 thread_obj2 = new Ques2(); //Thread 2 object
        System.out.println("\nExecution of Thread 1 ");
        thread_obj1.start();
        try
        {
            thread_obj1.join(); //will wait for complete execution of Thread 1
        }catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("\nExecution of Thread 2 ");
        thread_obj2.start();
    }
}
