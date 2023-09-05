package Stack;

import java.util.Stack;

public class pro7
{
    public static void main(String[] args) {

        String s = "({[}])";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' )
            {
                stack.push(s.charAt(i));
            }
        }

        for (int i = 0; i < s.length(); i++)
        {
            char ch = stack.peek();

            if((ch == '(' && s.charAt(i) == ')') || (ch == '{' && s.charAt(i) == '}') || (ch == '[' && s.charAt(i) == ']'))
            {
                stack.pop();
            }
        }

        if(stack.empty()) System.out.println(true);

        else System.out.println(false);
    }
}
