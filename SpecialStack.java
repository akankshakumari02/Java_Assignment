import java.util.*;
public class SpecialStack {
    static int[] specialStack;
    static int top = 0;
    private static int min = Integer.MAX_VALUE;
    static void push(int el) {
        specialStack[top] = el;
        top++;
        if (el <= min)
            min = el;
    }

    static void updateMin(){
        min=specialStack[top-1];
        System.out.println("in update min min is "+min);
        for(int i=0;i<top;i++){
            if(specialStack[i]<min)
                min=specialStack[i];
        }

    }

    static int pop() {
        top--;
        if(specialStack[top]==min) {
            min=specialStack[top];
            updateMin();
        }
        return specialStack[top];

    }

    static int getMin(){
        return min;
    }

    static void printStack(){
        for(int i=0;i<top;i++){
            System.out.println(specialStack[i]);
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i=0;
        System.out.println("Set size : ");
        int size = sc.nextInt();
        specialStack = new int[size];
        while(i < size)
        {
            System.out.println("Enter element to push: ");
            int val = sc.nextInt();
            push(val);
            i++;
        }
        System.out.println("Elements in stack are : ");
        printStack();
        System.out.println("minimum is "+getMin());
    }
}
