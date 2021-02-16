public class Ques8
{
    public static void main(String args[])
    {
        StringBuffer str_buff = new StringBuffer("Programming");
        System.out.println("Original string is : "+str_buff);
        StringBuffer rev_str = str_buff.reverse();

        System.out.println("Reversed string is : "+rev_str);

        StringBuffer new_str= str_buff.delete(4,9);
        System.out.println("String after removal  is : "+new_str);

    }
}