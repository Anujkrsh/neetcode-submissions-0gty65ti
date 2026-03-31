class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            int [] freq = new int[26];
            for(int j=i;j<s.length();j++){
               char c= s.charAt(j);
               freq[c-'A']++;
                int maxFreq=0;
                for(int l: freq){
                    maxFreq= Math.max(l,maxFreq);
                }

                int len=j-i+1;
                if(len-maxFreq<=k){
                    max=Math.max(len,max);
                }

            }
        }

        return max;

    }
}
    