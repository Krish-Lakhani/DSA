package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class stackUsing2queue
{
    static Queue<Integer> queue1 = new LinkedList<>();
//    static Queue<Integer> queue2 = new LinkedList<>();


    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        pop();
        top();
    }

    public static void push(int value)
    {
        queue1.add(value);
        for (int i = 0; i < queue1.size()-1; i++)
        {
            queue1.add(queue1.remove());
        }
    }

    private static int pop()
    {
        System.out.println(queue1.element());
        return queue1.remove();
    }

    private static int top()
    {
        return queue1.element();
    }
}
