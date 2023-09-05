package Stack;

import java.util.Stack;

public class pro1
{
    public static void main(String[] args) {
        String s = "hello";

        Stack stack = new Stack();

        for (int i = 0; i < s.length(); i++)
        {
            stack.push(s.charAt(i));
        }

        while (!stack.empty())
        {
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
