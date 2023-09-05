package Queue;

public class circularqueue
{
    static int[] queue = new int[5];
    static int front = -1;
    static int rare = -1;
    static int size = 5;

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        System.out.println(peek());
        enqueue(40);
        dequeue();
        enqueue(50);
        dequeue();
        System.out.println(peek());
    }

    private static int peek()
    {
        if(front == -1 && rare == -1)
        {
            System.out.println("stack is empty");
            return -1;
        }
        return queue[front];
    }
    private static void dequeue()
    {
        if(front == rare)
        {
            front = rare = -1;
        }else {
            front = (front + 1) % size;
        }
    }

    private static void enqueue(int value)
    {
        if((rare+1) % size == front)
        {
            System.out.println("stack is full");
            return;
        }
        if(front == -1) {
            front = 0;
        }
        rare = (rare + 1) % size;
        queue[rare] = value;
    }


}
