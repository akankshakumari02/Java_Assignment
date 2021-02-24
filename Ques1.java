public class Ques1 extends Thread
{
    public void run()
    {
        System.out.println("\nExtending Thread class...");
    }
    public static void main(String[] args)
    {
        Ques1 obj1 = new Ques1();
        obj1.start();
    }
}
