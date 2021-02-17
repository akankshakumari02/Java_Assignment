import java.util.Scanner;
interface Furniture
{
    public void stressTest();
    public void fireTest();
}
abstract class Chair implements Furniture
{
    public abstract String chairType();
}
abstract class Table implements Furniture
{
    public abstract String tableType();
}
class MetalChair extends Chair
{
    public void stressTest()
    {
        System.out.println("Passed stress Test");
    }
    public void fireTest()
    {
        System.out.println("Passed fire Test");
    }
    public String chairType()
    {
        return "this is a metal chair";
    }
}
class MetalTable extends Table
{
    public void stressTest()
    {
        System.out.println("Passed stress Test");
    }
    public void fireTest()
    {
        System.out.println("Passed fire Test");
    }
    public String tableType()
    {
        return "this is a metal table";
    }
}
class WoodenChair extends Chair
{
    public void stressTest()
    {
        System.out.println("Failed stress Test");
    }
    public void fireTest()
    {
        System.out.println("Failed fire test");
    }
    public String chairType()
    {
        return "this is a wooden chair";
    }
}

class WoodenTable extends Table
{
    public void stressTest()
    {
        System.out.println("Failed stress Test");
    }
    public void fireTest()
    {
        System.out.println("Failed fire test");
    }
    public String tableType()
    {
        return "this is a wooden table";
    }
}
public class Ques9
{    public static void main(String args[])
    {
        Chair metal_chair = new MetalChair();
        System.out.println(metal_chair.chairType());
        metal_chair.fireTest();
        metal_chair.stressTest();
        System.out.println(" ");
        Table metal_table = new MetalTable();
        System.out.println(metal_table.tableType());
        metal_table.fireTest();
        metal_table.stressTest();

        System.out.println(" ");
        Chair wood_chair = new WoodenChair();
        System.out.println(wood_chair.chairType());
        wood_chair.fireTest();
        wood_chair.stressTest();
        System.out.println(" ");
        Table wood_table = new WoodenTable();
        System.out.println(wood_table.tableType());
        wood_table.fireTest();
        wood_table.stressTest();
    }
}