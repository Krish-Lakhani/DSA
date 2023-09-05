package Liked_List;

import java.util.LinkedList;

public class LL
{
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size =0;
    }

    public void insert_first(int value)
    {
        Node n = new Node(value);
        n.next =  head;
        head = n;

        if(tail == null)
        {
            tail = head;
        }
        size += 1;
    }

    public void insert_last(int value)
    {
        if(tail == null)
        {
            insert_first(value);
            return;
        }
        Node n = new Node(value);

        tail.next = n;
         n = tail;
        size += 1;
    }

    public void display()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.value + "" + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public void delete_first()
    {
        if(head == tail) return;

        head = head.next;
        size--;
    }

    public void delete_last()
    {
        if(size <= 1) return;
        Node temp = head;
        while (temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
        size -= 1;
    }

    public void insert_atIndex(int index , int value)
    {
        if(index == 0)
        {
            insert_first(value);
            return;
        }

        if (index == size)
        {
            insert_last(value);
            return;
        }

        //Node n1 = new Node(value);
        Node temp = head;
        for (int i = 1; i < index; i++)
        {
            temp = temp.next;
        }

        Node next = new Node(value,temp.next);
        temp.next = next;
//        Node next = temp.next;
//        temp.next = n1;
//        n1.next = next;
    }

    public void deletIthindex(int index)
    {
        if(index == 0)
        {
            delete_first();
            return;
        }
        if (index == size-1)
        {
            delete_last();
            return;
        }

        Node prve = nthindx(index-1);
        prve.next = prve.next.next;
    }

    public Node nthindx(int index)
    {
        Node temp = head;
        for (int i = 1; i < index; i++)
        {
            temp = temp.next;
        }
        return temp;
    }

    public Node find(int value)
    {
        Node temp = head;
        int inx = 0;
        while (temp != null) {
            inx++;
            if (temp.value == value) {
                System.out.println(inx);
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void reverse()
    {
        Node prve = null;
        Node temp = head;
        Node next;
        while (temp != null)
        {
            next = temp.next;
            temp.next = prve;
            prve = temp;
            temp = next;
        }
        head = prve;
    }

    public Node midnode(Node head)
    {
        Node slow = head;
        Node fast = head;;

       while(fast != null && fast.next != null)
        {
             slow = slow.next;
             fast = fast.next.next;
        }
        return slow;
    }

    public Boolean palindrome()
    {
        if(head == null && head.next == null)
        {
                return true;
        }

        Node mid = midnode(head);

        Node prve = null;
        Node temp = mid;
        Node next;
        while (temp != null)
        {
            next = temp.next;
            temp.next = prve;
            prve = temp;
            temp = next;
        }

        Node right = prve;
        Node left = head;

        while(right != null)
        {
            if(left.value != right.value)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public void breakcycle()
    {
        Node slow =head;
        Node fast = head;
        Boolean cycle = false;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                cycle = true;
                break;
            }
        }

        if(cycle == false) return;

        slow = head;
        Node prev = null;
        if(slow != fast)
        {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }


}
