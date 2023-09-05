package String;

public class leetcode821
{
    public static void main(String[] args) {

        String s =  "loveleetcode";
        char c = 'e';

        int arr[]=new int[s.length()];


        for(int i=0;i<s.length();i++)
        {
//            if(i==0)
//                arr[i]=s.indexOf(c);
            if(s.charAt(i)==c)
                //arr[i]=0;
                System.out.println(i);

            //ans[i] = Math.abs(i-)
        }
    }
}
