package Recursion;

public class Que8 {
    static int ans =0;
    public static void main(String[] args) {
        int n = 456;
        System.out.println(sum(n));
    }

    public static int sum(int n){
        if(n ==0) return 0;

        int rem = n % 10;
        ans += rem;
        sum(n/10);
        return ans;
    }
}
