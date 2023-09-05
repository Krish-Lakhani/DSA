import java.util.HashMap;

public class LRUE {

    public static void main(String[] args) {
        LRU l = new LRU(5);
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(10);
        l.add(40);
        l.add(20);
        l.add(50);
        l.add(60);
        l.print();
    }
}
class LRU{
    HashMap<Integer,Node> hm = new HashMap<>();
    DoublyLL dllL = new DoublyLL();
    int capacity;

    public LRU(int capacity) {
        this.capacity = capacity;
    }

    public void add(int value) {
        if(hm.containsKey(value)){
            Node address = hm.get(value);
            DoublyLL.remove(address);
            hm.remove(value);
        }
        if (hm.size() == capacity){
            int d = DoublyLL.removeFirst();
            hm.remove(d);
        }
        Node nn = DoublyLL.insertLast(value);
        hm.put(value,nn);
    }

    public void print() {
        DoublyLL.print();
    }
}

class DoublyLL{
    static Node head;
    static Node tail;
    public static void remove(Node address) {
        if(head == address && head == tail){
            head = tail = null;
        } else if (head == address) {
            head = head.next;
            head.prev = null;
        }else{
            address.prev.next = address.next;
            address.next.prev = address.prev;
        }
    }
    public static Node insertLast(int value) {
        Node nn = new Node(value);
        if (head == null){
            head = tail = nn;
        }else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }
        return nn;
    }
    public static int removeFirst() {
        int value = head.value;
        head = head.next;
        head.prev = null;
        return value;
    }

    public static void print() {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.value + " ");
            temp =temp.next;
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