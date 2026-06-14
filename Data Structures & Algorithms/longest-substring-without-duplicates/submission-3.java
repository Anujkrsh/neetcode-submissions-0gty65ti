class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        Set<Character> set = new HashSet<>();
        int len=0,ind=0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
            set.remove(s.charAt(ind++));
            }
            set.add(s.charAt(i));
            len=Math.max(len,i-ind);
        }
        return len+1;
    }
}
