class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> fin= new ArrayList<List<String>>();
        
        boolean[] used = new boolean[strs.length];

        for(int i=0;i<strs.length;i++){
            if(used[i] == true) continue;
            List<String> toAdd= new ArrayList<>();
            toAdd.add(strs[i]);
            used[i]=true;
            for(int j=i+1;j<strs.length;j++){
                if(used[j]!=true && isAnagram(strs[i],strs[j])){
                    toAdd.add(strs[j]);
                    used[j]=true;
                }
            }
            fin.add(toAdd);
        }
        return fin;
        
    }


    public boolean isAnagram(String a, String b){
        if(a.length()!=b.length())return false;

        int[] c = new int[26];

        for(char j: a.toCharArray()) c[j-'a']++;
        for(char g: b.toCharArray()) c[g-'a']--;

        for(int i: c){
            if (i!=0)return false;
        }  
        return true;
    }
}
