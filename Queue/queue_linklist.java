package Queue;

public class queue_linklist
{

    static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    static Node head = null;
    static Node tail = null;

    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);
        remove();
        display();
        add(40);
        peek();
    }

    private static void peek()
    {
        if(head == null)
        {
            System.out.println("queue is empty");
        }
        System.out.println(head.value);
    }
    private static void display()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    private static void add(int value)
    {
        Node newNode = new Node(value);

        if(head == null || tail == null)
        {
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
    }

    private static  void remove()
    {
        if(head == null) return;

        head = head.next;
    }

}
