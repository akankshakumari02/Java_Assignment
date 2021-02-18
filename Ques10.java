import java.util.LinkedList;
import java.util.Queue;

class Customer
{
    String cname;
    int cash;
    int order_no;
    Order order;
    public void waiting()
    {}

    public void process()
    {}

    public void order_received()
    {}

    Customer()
    {}
}

class Cashier
{
    String name;
    Order order;
    Customer customer;
    Barista barista;

    int payment;
    int order_no;
    int token;
    boolean ready;

    public void get_order()
    { }

    Cashier()
    {}
}

class Order
{
    public static Queue<Integer> order = new LinkedList<>();
    Customer customer;
    int order_id;
    public Order()
    {   }

    void place_order()
    {
    }

    int process_order()
    { }
}

class Barista
{
    Order order;
    boolean createOrder(int token)
    {            }

    public void updateOrder()
    {         }
}

public class Ques10
{
     Customer customer = new Customer();
     Order order = new Order();
     Barista barista = new Barista();
     Cashier cash = new Cashier();

     customer.process();

}
