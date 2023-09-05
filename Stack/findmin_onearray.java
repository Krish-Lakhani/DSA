package Stack;

public class findmin_onearray
{
    static int[] arr = new int[50];
    static int top = -1;
    static int mintop = 50;

    public static void main(String[] args) {

        push(10);
        push(20);
        push(6);
        push(3);
        pop();
        push(2);
        minvalue();
        pop();
        minvalue();
    }

    public static void minvalue() {
        if(mintop >= 50)
        {
            System.out.println("stack is empty");
            return;
        }

        System.out.println("min value is:=" + arr[mintop]);
    }

    public static void pop() {
        if(top < 0)
        {
            System.out.println("stack is empty");
            return;
        }

        if(arr[top] <= arr[mintop])
        {
           mintop++;
        }
        System.out.println("Popped value is :=" + arr[top--]);
    }

    public static void push(int value)
    {
        if(top+1 == mintop)
        {
            System.out.println("Stack is full");
            return;
        }

        arr[++top] = value;

        if(mintop == 50)
        {
            arr[--mintop] = value;
            return;
        }


        if(arr[top] <= arr[mintop])
        {
            arr[--mintop] = value;
        }
    }
}
