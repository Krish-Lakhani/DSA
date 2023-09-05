package Recursion;

public class Que9 {
    static int max =0;
    public static void main(String[] args) {
        int[] arr = {5,7,2,4,9,3,5};
        int n =arr.length-1;
        largest(arr, n);
        System.out.println(max);
    }

    private static void largest(int[] arr, int n) {
        if(n == -1) return;

        max = Math.max(max,arr[n]);
        largest(arr ,n-1);
    }

}
