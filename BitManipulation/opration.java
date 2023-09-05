package BitManipulation;

public class opration
{
    public static void main(String[] args) {
        int i = 8 , j = 6;
        System.out.println(i & j);  //  1 1 =1
        System.out.println(i | j);  //  0 0 =0
        System.out.println(i ^ j);  //  same =0
        System.out.println(~i);  //  msb 0-positive ans , msb 1-nagative ans   lsb
        System.out.println(i << 2);
        System.out.println(i >> 2);

        // evwn or odd    lsb 0-even 1-odd
        if((i & 1) == 0) System.out.println("even");

        else System.out.println("odd");

    }
}
