import java.util.*;
class Employee
{
    String name;
    double Age;
    double salary;

    public Employee(String name, double Age, double salary)
    {
        this.name = name;
        this.Age = Age;
        this.salary = salary;
    }
    public String getName()
    {
        return name;
    }
    public double getAge()
    {
        return Age;
    }
    public double getSalary()
    {
        return salary;
    }
    public String toString() {
        return "\n[Name=" + this.name + ", Age=" + this.Age + ", Salary=" +
                this.salary + "]";
    }
}
class SalaryComparator implements Comparator<Employee>{
    public int compare(Employee e1,Employee e2){

        if(e1.salary==e2.salary)
            return 0;
        else if(e1.salary>e2.salary)
            return -1;
        else
            return 1;
    }
}
public class Ques4
{
    public static void main(String args[])
    {
        List<Employee> emp = new ArrayList<Employee>();

        emp.add(new Employee("Akanksha",23,35000.789));
        emp.add(new Employee("Riya",21,20000.452));
        emp.add(new Employee("Raman",20,10000.567));
        emp.add(new Employee("Ayush",22,35000.23));
        emp.add(new Employee("Shyam",30,50000.456));

        Collections.sort(emp, new SalaryComparator());
        System.out.println("Sorted Data Based On Highest Salary: ");

        for(Employee emp1 : emp)
        {
            System.out.println(emp1);
        }
    }
}


