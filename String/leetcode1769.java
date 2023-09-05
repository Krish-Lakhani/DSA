package String;

import java.util.Arrays;

public class leetcode1769
{
    public static void main(String[] args) {

        String s = "001011";

//        int[] ans = new int[s.length()];
//
//        for (int i = 0; i < ans.length; i++)
//        {
//            for (int j = ans.length-1; j >= 0; j--)
//            {
//                if(s.charAt(j) == '1') ans[i] += Math.abs(i-j);
//            }
//        }
//        System.out.println(Arrays.toString(ans));

        int n=s.length();
        int[] left=new int[n];
        int[] right=new int[n];
        int[] ans=new int[n];
        int count=s.charAt(0)-'0';

        for (int i=1;i<n;i++){
            left[i]=left[i-1]+count;
            count+=s.charAt(i)-'0';
        }

        count=s.charAt(n-1)-'0';
        for (int i=n-2;i>=0;i--){
            right[i]=right[i+1]+count;
            count+=s.charAt(i)-'0';
        }
        for (int i=0;i<n;i++) ans[i]=left[i]+right[i];
           System.out.println(Arrays.toString(ans));


    }
}
