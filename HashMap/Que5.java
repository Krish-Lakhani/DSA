package HashMap;

import java.util.HashMap;

public class Que5
{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,5,4};

        HashMap<Integer,Integer> hm1 = new HashMap<>();

        if(arr1.length != arr2.length) {
            System.out.println("false");
            return;
        }
        for (int i = 0; i < arr1.length; i++) {
            hm1.put(arr1[i],hm1.getOrDefault(arr1[i],0)+1);
        }

        for (int i = 0; i < arr2.length; i++) {
            if(hm1.containsKey(arr2[i]))
            {
                int count = hm1.get(arr2[i]);
                if (count == 1) {
                    hm1.remove(arr2[i]);
                } else {
                    hm1.put(arr2[i], count - 1);
                }
            }
            else {
                System.out.println(false);
                return;
            }
        }

        if(hm1.isEmpty())
        {
            System.out.println(true);
        }else System.out.println(false);


    }
}
