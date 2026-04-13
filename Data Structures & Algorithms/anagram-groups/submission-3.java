class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> fin= new ArrayList<List<String>>();
        boolean[] used = new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
         if(used[i]) continue;
         List<String> elem = new ArrayList<>();
         elem.add(strs[i]);
         for(int j=i+1;j<strs.length;j++){
            if(checkAnagram(strs[i],strs[j]) && !used[j]){
                elem.add(strs[j]);
                used[j]= true;
            }
         }
        fin.add(elem);   
        }
         return fin;
    }

    public boolean checkAnagram(String s1, String s2){
        int[] freq = new int[26];
        for(char c: s1.toCharArray()) freq[c-'a']++;
        for(char c: s2.toCharArray()) freq[c-'a']--;
        for(int i: freq){
            if(i!=0){
                return false;
            }    
        }
        return true;
    }
}