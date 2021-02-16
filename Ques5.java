//CLONING THROUGH CLONEABLE INTERFACE
class Course implements Cloneable
{
    String cname;
    int id;
    int price;
    public Course(String c,int i,int p)
    {
        this.cname = c;
        this.id = i;
        this.price = p;
    }
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

//CLONING THROUGH COPY CONSTRUCTOR
class Employee
{
    String ename;
    int id;
    int sal;

    public Employee(String n,int i,int s)
    {
        this.ename = n;
        this.id = i;
        this.sal = s;
    }

    public Employee(Employee emp)
    {
        ename = emp.ename;
        id = emp.id;
        sal = emp.sal;
    }
}

public class Ques5
{
    public static void main(String args[])
    {
        Employee e1 = new Employee("ABC",102,3000);
        Employee e2 = new Employee(e1);

        System.out.println("CLONING THROUGH COPY CONSTRUCTOR");
        System.out.println("Details of employee e1 are : ");
        System.out.println("Name : "+e1.ename);
        System.out.println("ID : "+e1.id);
        System.out.println("Salary : "+e1.sal);

        System.out.println(" ");

        System.out.println("Details of employee e2 are : ");
        System.out.println("Name : "+e2.ename);
        System.out.println("ID : "+e2.id);
        System.out.println("Salary : "+e2.sal);

        //CLONING THROUGH CLONEABLE
        Course obj1 = new Course("Java Programming",101,2000);
        Course obj2 = null;
        try
        {
            obj2 = (Course) obj1.clone();
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        System.out.println(" ");
        System.out.println("CLONING THROUGH CLONEABLE");
        System.out.println("Details of obj1 : ");
        System.out.println("Id of the course : "+obj1.id);
        System.out.println("Name of the course : "+obj1.cname);
        System.out.println("Price of the course : "+obj1.price);

        System.out.println("  ");

        System.out.println("Details of obj2 : ");
        System.out.println("Id of the course : "+obj2.id);
        System.out.println("Name of the course : "+obj2.cname);
        System.out.println("Price of the course : "+obj2.price);
    }
}
