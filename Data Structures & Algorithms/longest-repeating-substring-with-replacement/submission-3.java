class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxFr=0,left=0,max=0;
        for(int rt=0;rt<s.length();rt++){
            freq[s.charAt(rt)-'A']++;
            maxFr=Math.max(freq[s.charAt(rt)-'A'],maxFr);

            if((rt-left+1)-maxFr>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            max=Math.max(max,rt-left+1);
        }

        return max;
    }
}
