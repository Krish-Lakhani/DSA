package Stack;

import java.util.Stack;

public class pro2
{
    public static void main(String[] args) {
        String s1 = "java is language";
        Stack<Character> stack = new Stack<>();
//        char[] ch = new char[s1.length()];

        for (int i = 0; i < s1.length(); i++)
        {
            if(s1.charAt(i) != ' ')
            {
                stack.push(s1.charAt(i));
            }
            else {
                while (!stack.empty()){
                    System.out.print(stack.peek());
                    stack.pop();
                }
                System.out.print(" ");
            }
        }
        while (!stack.empty()){
            System.out.print(stack.peek());
            stack.pop();
        }

    }
}
