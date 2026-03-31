class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a=0,b=0;
        StringBuilder sb= new StringBuilder();
        while(a<word1.length() && b<word2.length()){
            sb.append(word1.charAt(a++));
            sb.append(word2.charAt(b++));
        }
        if(a<word1.length()){
            sb.append(word1.substring(a,word1.length()));
        }
        else if(b<word2.length()){
            sb.append(word2.substring(b,word2.length()));
        }

        return sb.toString();
    }
}