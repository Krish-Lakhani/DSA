package Array;

import java.util.ArrayList;

public class leecode2089
{
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        ArrayList<Integer> list1 = new ArrayList<>();
        int target = 2;
        int targetcount = 0;
        int smallcount = 0;

        for(int i : nums)
        {
            if(i == target) targetcount++;
            if(i < target)  smallcount++;
        }

        for(int i=0; i<targetcount; i++)
        {
            if(target == 0) System.out.println(list1);
            list1.add(i+smallcount);
        }
        System.out.println(list1);
    }
}
