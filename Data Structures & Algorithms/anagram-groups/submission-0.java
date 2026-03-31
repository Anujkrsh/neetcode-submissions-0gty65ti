class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> fin= new ArrayList<List<String>>();

        boolean[] used = new boolean[strs.length];

        for (int i=0; i<strs.length;i++){
            if(used[i]) continue;

            List<String> lst = new ArrayList<>();
            used[i]=true;
            lst.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(!used[j] && isAnagram(strs[i],strs[j])){
                    used[j]=true;
                    lst.add(strs[j]);
                }
            }
            fin.add(lst);
        }
        return fin;
    }

      private boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        
        int[] freq = new int[26];
        
        for (char c : a.toCharArray()) freq[c - 'a']++;
        for (char c : b.toCharArray()) freq[c - 'a']--;
        
        for (int f : freq) {
            if (f != 0) return false;
        }
        return true;
    }
}
