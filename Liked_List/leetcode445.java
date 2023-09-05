//package Liked_List;
//
//import java.util.LinkedList;
//
//public class leetcode445
//{
//    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        LinkedList<Integer> list2 = new LinkedList<>();
//
//        list.add(7);         list.add(2);            list.add(4);    list.add(3);
//        list2.add(5);         list2.add(6);          list2.add(4);
//
//        Stack<ListNode> s1 = new Stack();
//        Stack<ListNode> s2 = new Stack();
//
//        while(l1 != null)
//        {
//            s1.push(l1);
//            l1 = l1.next;
//        }
//
//        while(l2 != null)
//        {
//            s2.push(l2);
//            l2 = l2.next;
//        }
//
//        ListNode dummyNode = new ListNode();
//        ListNode head = dummyNode;
//
//        int carry = 0;
//        while(!s1.empty() || !s2.empty()){
//
//            int sum = carry;
//
//            if(!s1.empty()){
//                sum += s1.pop().val;
//            }
//
//            if(!s2.empty()){
//                sum += s2.pop().val;
//            }
//
//
//            ListNode newNode = new ListNode(sum % 10);
//            newNode.next = head.next;
//            head.next = newNode;
//
//            carry = sum / 10;
//        }
//
//        if(carry == 1){
//            ListNode newNode = new ListNode(1);
//            newNode.next = head.next;
//            head.next = newNode;
//        }
//
//        return head.next;
//    }
//}
