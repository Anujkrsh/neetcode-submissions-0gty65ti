class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lst= new ArrayList<>();
        boolean[] used= new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(used[i]==true) continue;
            List<String> anag= new  ArrayList<>();
            used[i]=true;
            anag.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(!used[j]==true && isAnagram(strs[i],strs[j])){
                    anag.add(strs[j]);
                    used[j]=true;
                }
            }
            lst.add(anag);
        }
        return lst;
    }

    public Boolean isAnagram(String str1,String str2){
        if (str1.length() != str2.length()) return false;
        char[] ch1= str1.toCharArray();
        char[] ch2 =str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            return true;
        }
        return false;
    }
}
