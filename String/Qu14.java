package String;

public class Qu14
{
    public static void main(String[] args) {
        String s1 = "csdcs12345";
        String s2 ="";
        String s3 ="";

        for (int i = 0; i < s1.length(); i++)
        {
//            if (!Character.isDigit(i) == Character.isDigit(i))
//            {
//                System.out.println(true);
//                break;
//            }
//            else if (!Character.isDigit(i) != Character.isDigit(i)){
//                System.out.println(false);
//                break;
//            }
            if(s1.charAt(i) >= '0' && s1.charAt(i) <= '9')
            {
                s2 += s1.charAt(i);
            }
            else s3 += s1.charAt(i);
        }
        if(s2.length() == s3.length()) System.out.println(true);
        else System.out.println(false);
    }
}
