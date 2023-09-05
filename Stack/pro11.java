package Stack;

import java.util.Stack;

public class pro11
{
    public static void main(String[] args) {
        String s = "ababaca";
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < s.length(); i++) {

            if((!stack.empty() )&& s.charAt(i) == stack.peek()){
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        while (!stack.empty())
        {
            sb.append(stack.pop());
        }
        System.out.println(sb.reverse());
    }
}
