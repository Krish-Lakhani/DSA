package Recursion;

public class Que2 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    private static int fact(int n) {
        if(n == 1) return n;
       return fact(n-1) * n;
    }
}
