import java.util.HashMap;
public class Ques2
{
    public static void main(String args[])
    {
        String str = "java programming";
        unique_char(str);//no of unique characters 11
    }
    public static void unique_char(String str)
    {
        int count = 0;
        char ch;

        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            if(map.containsKey(ch))
            {
                continue;
            }
            else
            {
                map.put(ch,1);
                count++;
            }
        }
        System.out.println("\nNumber of unique characters in a string are : "+count);
    }
}
