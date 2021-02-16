public class Ques2
{
    public static void main(String args[])
    {
        String str = "defamzbnwc";
        System.out.println("Before sorting : "+str);
        int j,i;
        char temp = 0;
        char ch[] = str.toCharArray();
        for(i = 0; i<ch.length; i++) {
            for (j = 0; j < ch.length; j++) {
                if (ch[j] > ch[i]) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }

        System.out.println("After Sorting : ");
        for(int p = 0; p<ch.length; p++)
        {
            System.out.printf(ch[p]+" ");
        }
    }
}
