import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
class Demo1 extends Thread {
    private String str;

    public Demo1(String str) {
        this.str = str;
    }

    public void run() {
        String thread_Name = Thread.currentThread().getName();
        for (int i = 1; i <=5; i++) {
            System.out.printf("%s -> %s: %d\n", thread_Name, str, i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
public class Ques9
{
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
       //ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.execute(new Demo1("A"));
        ex.execute(new Demo1("B"));
        ex.execute(new Demo1("C"));

        ex.shutdown();
    }
}
