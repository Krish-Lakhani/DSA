package Recursion;

public class Que4 {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9};
        int  n = arr.length-1;
        print(arr,n);
    }

    private static void print(int[] arr , int n) {
        if(n == -1) return;
        print(arr ,n-1);
        System.out.print(arr[n] + " ");
    }
}
