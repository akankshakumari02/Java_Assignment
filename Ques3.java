import java.util.HashMap;
public class Ques3
{
    public static void main(String args[])
    {
        String str = "Programming";
        char_count(str);
    }
    //method to calculate occurrences of character in a string
    public static void char_count(String str)
    {
        int count = 0;
        char ch;

        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            if(map.containsKey(ch))
            {
                count = map.get(ch);
                count++;
                map.replace(ch,count);
            }
            else
            {
                map.put(ch,1);
            }
        }

        for(Character key : map.keySet())
        {
            System.out.println(key+" : "+map.get(key));
        }
    }
}
