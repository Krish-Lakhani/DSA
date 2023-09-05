package Liked_List;

public class CLL
{
    private Node head;
    private Node tail;

    public CLL() {
        this.head = head;
        this.tail = tail;
    }

    public void insert(int value)
    {
        Node node = new Node(value);
        if(head ==  null)
        {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int value) {
        Node temp = head;

        if (head == null) {
            return;
        }

        if (head.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = temp.next;
            if (n.value == value) {
                temp.next = n.next;
            }
        }while (temp != head);
    }

    public void display()
    {
        Node temp = head;

        if(head != null)
        {
            do{
                System.out.print(temp.value + "->");
                temp = temp.next;
            }while (temp != head);
            System.out.println(" ");
        }
    }
    private class Node
    {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
