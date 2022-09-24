package src.Stack;

import java.util.Stack;

public class stacks {
    //LIFO LAST IN FIRST OUT
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Kenya");
        stringStack.push("Ethiopia");
        stringStack.push("Tanzania");
        System.out.println(stringStack);
        System.out.println(stringStack.peek());
        String pop = stringStack.pop();
        System.out.println(pop);
        System.out.println(stringStack);

    }
}
