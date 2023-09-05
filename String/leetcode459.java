package String;

import static String.Solution.repeatedSubstringPattern;

public class leetcode459 {
    public static void main(String[] args) {
        String s ="abcabc";
        System.out.println(repeatedSubstringPattern(s));
    }
}

class Solution {
    public static  boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String str = doubled.substring(1,doubled.length()-1);
        return str.contains(s);
    }
}