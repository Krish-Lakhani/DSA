package Queue;

public class simplequeue
{
    public static void main(String[] args) {
        int[] queue = new int[10];
        int f = -1 , r = -1;

        r = enqueue(queue ,r, 10);
        r = enqueue(queue ,r, 20);
        r = enqueue(queue ,r, 30);
        f = dequeue(queue,f, r);
        print(queue,r,f);
    }

    private static void print(int[] queue, int r, int f)
    {
        for (int i = f+1; i <= r; i++)
        {
            System.out.println(queue[i]+" ");
        }
    }

    private static int dequeue(int[] queue, int f, int r)
    {
        if(f == r)
        {
            System.out.println("stack is full");
        }

        f++;

        if(f == r)
        {
            f = r = -1;
        }
        return f;
    }

    private static int enqueue(int[] queue, int r, int value)
    {
        if(r == queue.length -1)
        {
            System.out.println("Stack is full");
        }

        r++;
        queue[r] = value;
        return r;
    }
}
