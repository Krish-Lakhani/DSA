package Array;

public class leetcode767 {
    public static void main(String[] args) {
        String s = "aab";
        int[] frq = new int[26];

        for(int i=0; i<s.length(); i++){
            frq[s.charAt(i)-'a']++;
        }

        int max =0 , letter=0;
        for(int i=0; i<frq.length; i++){
            if(max < frq[i]){
                max = frq[i];
                letter = i;
            }
        }

  //      if (max > (s.length() + 1) / 2) return "";

        char[] ans = new char[s.length()];
        int idx =0;
        while(frq[letter] > 0){
            ans[idx] = (char) (letter + 'a');
            idx += 2;
            frq[letter]--;
        }

        for(int i=0; i<frq.length; i++){
            while(frq[i] > 0){
                if(idx >= ans.length){
                    idx = 1;
                }
                ans[idx] = (char) (i+'a');
                idx += 2;
                frq[i]--;
            }
        }
        System.out.println(String.valueOf(ans));
    }
}


