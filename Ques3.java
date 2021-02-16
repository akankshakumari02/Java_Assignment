public class Ques3
{
    public static void main(String args[])
    {
        String str = "hello hi hello";

        int total_length = str.length();

        int total_after = str.replace("l", "").length();

        int final_length = total_length - total_after;

        System.out.println("Total number of occurences of 'l' is : "+final_length);
    }
}