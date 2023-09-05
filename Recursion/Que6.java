package Recursion;

public class Que6 {
    static int ans = 0;
    public static void main(String[] args) {
        int n = 45678;
        reverse(n);
        System.out.println(ans);
    }

    public static void reverse(int n){
        if(n ==0) return;

        int rem = n % 10;
        n = n/10;
        ans = (ans * 10) + rem;
        reverse(n);
    }
}
