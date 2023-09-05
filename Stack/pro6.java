package Stack;

import java.util.Stack;

public class pro6 {
//    static int mintop = -1;
//
//    public static void main(String[] args) {
//        int[] Stack = new int[5];
//        int top = -1;
//        int[] min = new int[5];
//
//        top = push(Stack, min, top, 9);
//        top = push(Stack, min, top, 8);
//        top = push(Stack, min, top, 10);
//        top = push(Stack, min, top, 6);
//        top = push(Stack, min, top, 2);
//
//        System.out.println("Minimum is  " + getmin(min));
//
//        top = pop(Stack, min, top);
//        System.out.println("After popping");
//        System.out.println("Minimum is  " + getmin(min));
//
//        top = pop(Stack, min, top);
//        System.out.println("After popping");
//        System.out.println("Minimum is  " + getmin(min));
//    }
//
//    private static int getmin(int[] min) {
//        return min[mintop];
//    }
//
//    public static int pop(int[] stack, int[] min, int top) {
//        int value = stack[top];
//        top--;
//        if (value == min[mintop]) {
//            mintop--;
//        }
//        return top;
//    }
//
//    public static int push(int[] stack, int[] min, int top, int value) {
//        top++;
//        stack[top] = value;
//
//        if (top == 0) {
//            mintop++;
//            min[mintop] = value;
//        }
//        if (value < min[mintop]) {
//            mintop++;
//            min[mintop] = value;
//        }
//
//        return top;
//    }

    static int[] stack = new int[5];
    static int[] Minstack = new int[5];
    static int top = -1;
    static int mintop = -1;

    public static void main(String[] args) {
        push(2);
        push(200);
        push(10);
        push(3);
        push(110);
        pop();
        System.out.println(top);
        System.out.println(getmin());
    }

    private static int getmin() {
        if(mintop == -1) {
            return -1;
        }
        return Minstack[mintop];
    }

    private static void pop() {
        if(top == -1) {
            return;
        }

        top--;

        if(Minstack[mintop] >= stack[++top])
        {
            mintop--;
        }
    }

    private static void push(int i) {
        if(top > 4) return;
        top++;
        stack[top] = i;

        if(mintop == -1)
        {
            mintop++;
            Minstack[mintop] = i;
        }else {
            if(i < Minstack[mintop]){
                mintop++;
                Minstack[mintop] = i;
            }
        }
    }
}