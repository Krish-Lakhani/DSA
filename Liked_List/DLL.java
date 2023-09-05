package Liked_List;

public class DLL
{

    private Node head;
    private Node tail;

    public void insert_first(int val) {
        Node node = new Node(val);

        node.next = head;
        node.prv = null;
        if (head != null) {
            head.prv = node;
        }
        head = node;
    }



    public void insert_last(int val)
    {
        Node node = new Node(val);

        node.next = null;
        if(head == null)
        {
            node.prv = null;
            head =node;
            return;
        }
        Node temp = head;

        while (temp.next != null)
        {
              temp = temp.next;
        }
            temp.next = node;
            node.prv = temp;


    }

    public void display_start()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.val + " " + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void display_end()
    {
        Node temp = head;
        Node temp1 = null;
        while (temp != null)
        {
            temp1 = temp;
            temp = temp.next;
        }
        System.out.println();
        while (temp1 != null)
        {
            System.out.print(temp1.val + " " + "->");
            temp1 = temp1.prv;
        }
        System.out.println("Start");
    }

    public Node find(int val)
    {
        Node temp = head;

        while (temp != null)
        {
            if(temp.val == val)
            {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void insert_ith(int in_va, int val)
    {
        Node temp = find(val);

        if (temp == null)
        {
            System.out.println("val is not pre");
            return;
        }

        Node node = new Node(in_va);

        node.next = temp.next;
        temp.next = node;
        node.prv = temp;

        if(node.next != null)
        {
            node.next.prv = node;
        }
    }

    private class Node
    {
        private int val;
        private Node next;
        private Node prv;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prv) {
            this.val = val;
            this.next = next;
            this.prv = prv;
        }

    }
}
