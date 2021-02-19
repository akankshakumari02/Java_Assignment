import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface NewInterface
{
    Employee getEmployee(String name, int Age, String city);
}
class Employee
{
    String name;
    int Age;
    String city;

    public Employee(String name, int Age, String city)
    {
        this.name = name;
        this.Age = Age;
        this.city = city;
    }
    public String getname()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return Age;
    }
    public void setAge(int Age)
    {
        this.Age = Age;
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public String toString()
    {
        return "\nName: "+name+"\nAge: "+Age+"\nCity: "+city;
    }
}
public class Ques4
{
    public static void main(String args[])
    {
        NewInterface newobj = Employee::new; //construtor reference
        System.out.println(newobj.getEmployee("Riya",23,"New Delhi").toString());

    }
}
