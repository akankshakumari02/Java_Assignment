public class Ques9
{
    enum Courses
    {
        java(3000), javascript(2000), jquery(4000);
        private int price;

        Courses(int c)
        {
            price=c;
        }

        int getPrice()
        {
            return price;
        }

    }
    public static void main(String args[])
    {
        System.out.println("Price of various Courses are : ");
        for(Courses c : Courses.values())
        {
            System.out.println("Price of "+c+" course is : INR "+c.getPrice());
        }
    }
}