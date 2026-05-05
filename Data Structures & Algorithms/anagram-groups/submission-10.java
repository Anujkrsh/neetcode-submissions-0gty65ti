class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();

        boolean[] used= new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
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
            list.add(lst);

        }

        return list;
    }

        public boolean isAnagram(String s1, String s2){
            if (s1.length() != s1.length()) return false;

            int[] freq= new int[26];
            
            for(char c: s1.toCharArray()) freq[c-'a']++;
            for(char c: s2.toCharArray()) freq[c-'a']--;

            for(int a:freq){
                if(a!=0){
                    return false;
                }
            }
            return true;
        }
}
