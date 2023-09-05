package LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class main
{
    public static void main(String[] args) {
//        Que_1 ll = new Que_1();
//
//        ll.insertLast(10);
//        ll.insertLast(20);
//        ll.insertLast(20);
//        ll.insertLast(40);
//        ll.insertLast(50);
//
//        ll.remove();
//        ll.print();
//
////
////        ll.deletFirst();
//////
////        ll.deletLast();
////
////        ll.insertAtIndex(5,3);
////        ll.deletAtIndex(2);
////
//       System.out.println(ll.findValue(100));
////
////        ll.findnthNode(2);
////
////        ll.nthNoderevse(3);
////
//          ll.deNode(ll.head.next);
////
////        ll.update(40 ,4);
////
////        ll.revese();
////
//        ll.print();

//        Que_2 cl = new Que_2();
//        cl.insert(10);
//        cl.insert(20);
//        cl.insert(30);
//        cl.insert(40);
//        cl.print();
//
//        cl.exchange();
//        cl.print();

        Que_3 dll = new Que_3();
        dll.insert_last(30);
        dll.insert_last(20);
        dll.insert_last(30);
        dll.insert_last(40);

 //       dll.sorted(30);
        dll.display_start();

     //   dll.remove_du();
        dll.remove_Unsorted_du();
    //    dll.delete(30);

        dll.display_start();
        dll.reverse();

        dll.pairSum(70);
    }
}
