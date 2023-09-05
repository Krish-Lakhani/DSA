package Stack;

public class method
{
    public static void main(String[]args){
        int stack[]=new int[5];
        int top=-1;
        top=push(stack,10,top);
        top=push(stack,20,top);
        top=push(stack,30,top);
        top=push(stack,40,top);
        top=push(stack,50,top);
        top=pop(stack,top);
        peek(stack,top);
        System.out.println("isEmpty "+isEmty(top));

    }

    private static boolean isEmty(int top) {
        if (top == -1){
            return true;
        }
        return false;
    }

    private static void peek(int[] stack, int top) {
        if (top == -1){
            System.out.println("stack is emty");
            return;
        }
        while (top >= 0) {
            System.out.print(stack[top] + " ");
            top--;
        }
    }

    private static int pop(int[] stack, int top) {
        if (top==-1){
            System.out.println("stack is empty");
        }
        System.out.println("poped value is:-"+ stack[--top]);
        return top;
    }

    private static int push(int[] stack, int v, int top) {
        if (top==stack.length-1){
            System.out.println("Stack is full");
        }
        stack[++top]=v;
        return top;
    }
}

