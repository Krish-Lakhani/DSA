package Recursion;

public class Que7 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 4;

        System.out.println(multiply(num1,num2));
    }

    private static int multiply(int num1, int num2) {
        if(num1 == 0 || num2 == 0) return 0;

        return num1 + multiply(num1 , num2-1);
    }
}
