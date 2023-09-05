//package Liked_List;
//
//import java.lang.reflect.Array;
//import java.util.*;
//
//public class leetcode2326 {
//    public static void main(String[] args) {
//        int m = 3, n = 5;
//        int[]head = {3,0,2,6,8,1,7,9,4,2,5,5,0};
//        int row=0;
//        int nrow=m-1;
//        int col=0;
//        int ncol=n-1;
//        int size=n*m;
//        int[][] arr=new int[m][n];
//
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//                arr[i][j]=-1;
//        }
//
//        while(head != null){
//
//            for(int i=row;head != null && i<=ncol;i++)
//            {
//                arr[row][i]=head.val;
//                head=head.next;
//            }
//            row+=1;
//
//            for(int i=row;head != null && i<=nrow;i++)
//            {
//                arr[i][ncol]=head.val;
//                head=head.next;
//            }
//            ncol-=1;
//
//            for(int i=ncol;head != null && i>=col;i--){
//                arr[nrow][i]=head.val;
//                head=head.next;
//            }
//            nrow-=1;
//
//            for(int i=nrow;head != null && i>=row;i--){
//                arr[i][col]=head.val;
//                head=head.next;
//            }
//            col+=1;
//        }
//        System.out.println(Arrays.deepToString(arr));
//
//        class Node{
//            int val;
//            Node next;
//
//            public Node(int val) {
//                this.val = val;
//            }
//
//            public Node(int val, Node next) {
//                this.val = val;
//                this.next = next;
//            }
//        }
//    }
//}
