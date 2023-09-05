package String;

public class Qu11
{
    public static void main(String[] args) {

        String s = "hello12356gdfe";
        String s1 = "";
//        StringBuilder sb = new StringBuilder();
//
//        for (char c : s.toCharArray())
//        {
//            if(!Character.isDigit(c)) {
//                sb.append(c);
//            }
//        }
//        String str = sb.toString();
//        System.out.println(str);


        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
            {
                continue;
            }
            else  s1 += s.charAt(i);
        }
        System.out.println(s1);

    }
}
