package Recursion;

public class Que5 {
    public static void main(String[] args) {
        int n = 6789;
        System.out.println(count(n));
    }

    private static int count(int n) {
        if(n == 0) return 0;
        return 1 + count(n/10);
    }
}
