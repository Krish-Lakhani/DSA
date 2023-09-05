package Stack;
import java.util.*;
public class leetcode1209
{
    public static void main(String[] args) {
        String s = "abcd";
        int k = 2;
        //"pbbcggttciiippooaais", k = 2;
        System.out.println(removeDuplicates(s = "deeedbbcccbdaa", k = 3));
    }

    public static String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int count = 0;
        stack.push(s.charAt(0));
        for(int i=1; i<s.length(); i++)
        {

            if(!stack.empty() && stack.peek() == s.charAt(i))
            {
                count++;
                stack.push(s.charAt(i));

                if(count == k)
                {
                    while(count >= 0) {
                        stack.pop();
                        count--;
                    }
                }
            }
            else stack.push(s.charAt(i));
        }
        while(!stack.empty())
        {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}


