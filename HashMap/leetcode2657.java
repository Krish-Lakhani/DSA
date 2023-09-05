package HashMap;
import java.util.*;

public class leetcode2657 {
    public static void main(String[] args) {
        int[]  A = {1,3,2,4};
        int[] B = {3,1,2,4};
        int n = A.length;
        HashMap<Integer,Integer> mp1 = new HashMap<>();
        HashMap<Integer,Integer> mp2 = new HashMap<>();
        int[] C = new int[n];
        for(int i=0;i<n;i++){
            mp1.put(A[i],mp1.getOrDefault(A[i],0)+1);
            mp2.put(B[i],mp2.getOrDefault(B[i],0)+1);

            for(int x:mp1.keySet()){
                if(mp2.containsKey(x)){
                    C[i] += Math.min(mp1.get(x),mp2.get(x));
                }
            }
        }
        System.out.println(Arrays.toString(C));
    }
}
