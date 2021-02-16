public class Ques7
{
    //static variables
    static String FirstName;
    static String LastName;
    static int age;

    //static block
    static
    {
        FirstName = "Akanksha";
        LastName = "Kumari";
        age = 23;
    }

    //static method
    static void print()
    {
        System.out.println("First Name : "+FirstName);
        System.out.println("Last Name  : "+LastName);
        System.out.println("Age        : "+age);
    }
    public static void main(String args[])
    {
        print();
    }
}