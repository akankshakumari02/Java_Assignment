import java.util.Locale;

public class Ques2 {
    public static void main(String args[]) {
        String str = "hello hi hello how is everyone everyone is doing good.";
        str.toLowerCase();
        String word[] = str.split(" ");
        int count = 0,i,j;
        for (i = 0; i < word.length; i++) {
            count = 1;
            for (j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    count++;
                    word[j] = "0";
                }
            }
            if (count > 1 && word[i] != "0") {
                System.out.println("Number of time " + word[i] + " occured is " + count);
            }
        }


    }
}