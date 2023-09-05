//package LinkedList;
//
//public class Que_2
//{
//    Node head;
//    public void insert(int value) {
//        Node nn = new Node(value);
//       if(head == null){
//          head = nn;
//          head.next = head;
//       }
//        Node temp = head;
//       while (temp.next != head)
//       {
//           temp = temp.next;
//       }
//        temp.next = nn;
//       nn.next = head;
//    }
//
//
//    public void print() {
//        Node temp = head;
//        do
//        {
//            System.out.print(temp.value + "->");
//            temp = temp.next;
//        }while (temp != head);
//        System.out.println();
//    }
//
//    public void exchange() {
//        if (head == null || head.next == head) {
//            return;
//        }
//        Node last = head;
//        Node secondlast = null;
//
//        while (last.next != head)
//        {
//            secondlast = last;
//            last = last.next;
//        }
//        last.next = head.next;
//        head.next = secondlast.next;
//        secondlast.next = head;
//        head = last;
//    }
//}
//
//class Node{
//    int value;
//    Node next;
//
//    public Node(int value) {
//        this.value = value;
//    }
//
//    public Node(int value, Node next) {
//        this.value = value;
//        this.next = null;
//    }
//}
