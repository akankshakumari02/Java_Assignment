import java.util.*;
class Student{
    String name;
    double Age;
    double score;

    public Student(String name, double Age, double score) {
        this.name = name;
        this.Age = Age;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public double getAge() {
        return Age;
    }
    public double getScore() {
        return score;
    }
    public String toString() {
        return "\n[Name=" + this.name + ", Age=" + this.Age + ", Score=" +
                this.score + "]";
    }
}
class ScoreandAgeComparator implements Comparator<Student>
{
    @Override
    public int compare(Student s1, Student s2)
    {
        int flag = (int) (s1.getScore() - s2.getScore());
        if(flag==0) flag = s1.getName().compareTo(s2.getName());
        return flag;
    }
}
public class Ques5
{
    public static void main(String args[])
    {
        List<Student> student = new ArrayList<Student>();

        student.add(new Student("Akanksha",23,90.58));
        student.add(new Student("Riya",21,80.56));
        student.add(new Student("Raman",20,85.543));
        student.add(new Student("Ayush",22,80.56));
        student.add(new Student("Shyam",30,95.78));

        Collections.sort(student, new ScoreandAgeComparator());
        System.out.println("Sorted Data : ");
        for(Student student1 : student)
        {
            System.out.println(student1);
        }
    }
}



