package Stack;

import java.util.Stack;

public class pro3
{
    public static void main(String[] args) {
        String s = "namanq";
        String ans = "";

        Stack stack = new Stack();

        for (int i = 0; i < s.length(); i++)
        {
            stack.push(s.charAt(i));
        }

        while (!stack.empty())
        {
            ans += stack.pop();
        }

        if(s.equals(ans)) System.out.println(true);

        else System.out.println(false);
    }
}
