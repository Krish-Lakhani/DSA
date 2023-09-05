package Stack;

import java.util.Stack;

public class pro5
{
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        Stack temp = new Stack();

        int mid = stack.size() / 2;

        for (int i = 0; i < mid; i++)
        {
            temp.push(stack.pop());
        }

        stack.pop();

        while (!temp.empty())
        {
            stack.push(temp.pop());
        }

        System.out.println(stack);
    }
}
