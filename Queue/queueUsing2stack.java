    package Queue;

import java.util.Queue;
import java.util.Stack;

public class queueUsing2stack
{
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);
        remove();
        peek();
    }

    private static int peek()
    {
        if(stack1.empty())
        {
            System.out.println("queue is empty");
            return -1;
        }
        return stack1.peek();
    }

    private static int remove()
    {
        if(stack1.empty())
        {
            System.out.println("queue is empty");
            return -1;
        }

        return stack1.pop();
    }

    private static void add(int value)
    {
        while (!stack1.empty())
        {
            stack2.push(stack1.pop());
        }

        stack1.push(value);

        while (!stack2.empty())
        {
            stack1.push(stack2.pop());
        }
    }


}
