class Customer
{
    String cname;
    int cid;
    int phone_number;
    Order order;
    public void place_order()
    {}
}

class Cashier
{
    String name;
    Order order;
    Customer customer;

    public void get_order()
    { }
}

class Order
{
    Customer customer;
    boolean status;
    int order_id;
    public Order()
    {   }

    public boolean orderStatus()
    {      }
}

class Barista
{
    Order order;
    Cashier cash;
    public void createOrder()
    {            }

    public Order getOrder()
    {      return new Order();    }

    public void updateOrder()
    {         }
}

public class Ques10
{
     Customer customer = new Customer();
     Order order = new Order();
     Barista barista = new Barista();
     Cashier cash = new Cashier();

}
