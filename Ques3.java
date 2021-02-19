interface MainInterface
{
    void main_interface();
}
public class Ques3
{
    //instance method
    public void add()
    {
        int num1=20, num2=40;
        System.out.println("\nSum: "+(num1+num2));
    }

    public void subtract()
    {
        int num1=60, num2=40;
        System.out.println("\nDifference: "+(num1-num2));
    }

    //static method
    public static void mul()
    {
            int num1=40, num2=50;
        System.out.println("\nProduct: "+(num1*num2));
    }

    public static void main(String args[])
    {
        //instance method reference
        MainInterface obj2 = new Ques3()::add;
        obj2.main_interface();
        MainInterface obj3 = new Ques3()::subtract;
        obj3.main_interface();

        //static method interference
        MainInterface obj1 = Ques3::mul;
        obj1.main_interface();
    }
}
