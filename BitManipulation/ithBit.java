package BitManipulation;

public class ithBit
{
    public static void main(String[] args) {
        System.out.println(get_ith(1,5));
        System.out.println(set_ith(2,10));
        System.out.println(cler_ith(1,10));
    }

    public static int get_ith(int i , int n)
    {
        int ans =  1 << i;
        if((n & ans)==0) return 0;

        else return 1;
    }

    public static int set_ith(int i , int n)
    {
        int ans =  1 << i;

        return n | ans;
    }

    public static int cler_ith(int i , int n)
    {
        int ans =  ~(1 << i);

        return n & ans;
    }

    public static int update_ith(int i , int n)
    {
        int ans =  1 << i;
        if((n & ans)==0) return 0;

        else return 1;
    }

}
