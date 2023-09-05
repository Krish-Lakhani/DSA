package Recursion;

public class Que3 {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    private static int sum(int n) {
        if(n == 0) return n;
        return sum(n-1) + n;
    }
}
