package Recursion;

public class Qu1 {
    public static void main(String[] args) {
        hello();
    }

    private static void hello() {
        System.out.println("hello");
        hello();
    }
}
