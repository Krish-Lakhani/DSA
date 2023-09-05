//package LinkedList;
//
//public class Que_1
//{
//        Node head;
//        private Node tail;
//
//        private int size =0;
//
//    public void insertFirst(int value)
//    {
//       Node nn = new Node(value);
//       nn.next = head;
//       head = nn;
//
//       if(tail == null)
//       {
//           tail = head;
//       }
//       size += 1;
//    }
//
//
//
//    public void print()
//    {
//        Node temp = head;
//        while (temp != null)
//        {
//            System.out.println(temp.value);
//            temp = temp.next;
//        }
//    }
//
//    public void insertLast(int value)
//    {
//        if(tail == null)
//        {
//            insertFirst(value);
//            size += 1;
//            return;
//        }
//        Node nn = new Node(value);
//        tail.next = nn;
//        tail = nn;
//        size += 1;
//    }
//
//
//    public void deletFirst()
//    {
//        if(head == tail) return;
//        head = head.next;
//        size -= 1;
//    }
//
//
//    public void deletLast()
//    {
//        if(tail == null)
//        {
//            return;
//        }
//
//        Node temp = head;
//        while (temp.next.next != null)
//        {
//            temp = temp.next;
//        }
//        temp.next = null;
//        size -= 1;
//
//    }
//
//
//    public void insertAtIndex(int value , int index)
//    {
//        if(index == 0)
//        {
//            insertFirst(value);
//            size += 1;
//            return;
//        }
//
//        if (index == size)
//        {
//            insertLast(value);
//            size += 1;
//            return;
//        }
//
//        Node nn = new Node(value);
//        Node temp = head;
//
//        for(int i=1; i<index; i++)
//        {
//            temp = temp.next;
//        }
//
//        nn.next = temp.next;
//        temp.next = nn;
//        size += 1;
//    }
//
//
//    public void deletAtIndex(int index) {
//        if (index == 0) {
//            deletFirst();
//            size -= 1;
//            return;
//        }
//
//        if (index == size) {
//            deletLast();
//            size -= 1;
//            return;
//        }
//
//        Node temp = head;
//
//        for (int i = 1; i < index; i++) {
//            temp = temp.next;
//        }
//
//        temp.next = temp.next.next;
//        size -= 1;
//    }
//
//
//    public boolean findValue(int value)
//    {
//        Node temp = head;
//        while (temp != null)
//        {
//            if(temp.value == value)
//            {
//                return true;
//            }
//            temp = temp.next;
//        }
//        return false;
//    }
//
//    public Node findnthNode(int index) {
//        Node temp = head;
//        for (int i = 1; i < index; i++) {
//            temp = temp.next;
//
//        }
//        return temp;
//    }
//
//    public void nthNoderevse(int index)
//    {
//        Node temp = head;
//        for (int i = size; i > index; i--) {
//            temp = temp.next;
//
//        }
//    }
//
//
//    public void update(int pv, int nv)
//    {
//        Node temp = head;
//        while (temp.value != pv)
//        {
//            temp = temp.next;
//        }
//        temp.value = nv;
//    }
//
//    public void revese()
//    {
//        Node curr = head;
//        Node pre = null;
//        Node next;
//
//        while (curr != null)
//        {
//            next = curr.next;
//            curr.next = pre;
//            pre = curr;
//            curr = next;
//        }
//        head = pre;
//    }
//
//
//    public void deNode(Node node)
//    {
//        //int value = node.value;
//        node.value = node.next.value;
//        node.next = node.next.next;
//    }
//
//    public void remove() {
//        Node temp = head;
//
//        while (temp != null && temp.next != null)
//        {
//            if(temp.value == temp.next.value){
//                temp.next = temp.next.next;
//            }
//            temp = temp.next;
//        }
//    }
//}
//
//class Node{
//    int value;
//    Node next;
//
//    public Node(int value, Node next) {
//        this.value = value;
//        this.next = next;
//    }
//    public Node(int value) {
//        this.value = value;
//    }
//}
