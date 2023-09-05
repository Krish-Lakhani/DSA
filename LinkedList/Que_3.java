package LinkedList;

import Liked_List.DLL;

import java.util.ArrayList;

public class Que_3
{
    Node head;
    Node tail;

    public void insertFirst(int value) {
        Node nn = new Node(value);
        nn.next = head;
        nn.prev = null;
        if(head != null)
        {
            head.prev = nn;
        }
        head = nn;
    }


    public void insert_last(int val)
    {
        Node node = new Node(val);

        node.next = null;
        if(head == null)
        {
            node.prev = null;
            head =node;
            return;
        }
        Node temp = head;

        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }

    public void display_start()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.value + " " + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void pairSum(int sum) {
       Node left = head;
       Node right = head.next;

        while (left.value!=right.value){
            if (left.value + right.value == sum){
                System.out.println(left.value+" + "+ right.value+" = " + sum);
                return;
            } else if (sum > right.value && right.next!=null) {
                right = right.next;
            }else {
                left = left.next;
            }
        }
        System.out.println("Not Fonud");
    }


    public void sorted(int value)
    {
        Node nn = new Node(value);

        if(head == null)
        {
            head = nn;
            tail = nn;
            return;
        }
        if(value < head.value) {
            nn.next = head;
            head.prev = nn;
            head = nn;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.value < value)
        {
            temp = temp.next;
        }

        nn.next = temp.next;
        if(temp.next != null)
        {
            temp.next.prev = nn;
        }
        temp.next = nn;
        nn.prev = temp;
    }

    public void delete(int value) {
        if(head.value == value && head == tail)
        {
            head = null;
            tail = null;
        }
        else if (head.value == value) {
            head.next.prev = null;
            head = head.next;
        }
        else
        {
            Node pre = head;
            Node curr = head.next;
            while (curr.value != value)
            {
                pre = curr;
                curr = curr.next;
            }
            if(curr.next != null)
            {
                curr.next.prev = curr.prev;
                pre.next =curr.next;
            }else {
                curr = null;
                tail = curr.prev;
            }
        }
    }

    public void reverse() {
        Node temp = head;
        Node temp1 = null;

        while (temp != null)
        {
            temp1 = temp;
            temp = temp.next;
        }

        while (temp1 != null)
        {
            System.out.print(temp1.value +"->" );
            temp1 = temp1.prev;
        }
        System.out.println();
    }

    public void remove_du()
    {
        Node prev = head;
        Node curr = head.next;

        while (curr.next != null) {
            if(prev.value == curr.value) {
                prev.next = curr.next;
                curr.next.prev = prev;
                curr.next = null;
                curr.prev =null;
            }else {
                prev = prev.next;
                curr = curr.next;
            }
        }
    }

    public void remove_Unsorted_du() {
        ArrayList<Integer> list = new ArrayList<>();

        Node prev = null;
        Node curr = head;

        while (curr.next != null) {
            list.add(curr.value);
            prev = curr;
            curr = curr.next;

            if(list.contains(curr.value))
            {
                prev.next = curr.next;
                curr.next.prev = prev;
            }
        }
    }
}

class Node{
    int value;
    Node next;
    Node prev;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
