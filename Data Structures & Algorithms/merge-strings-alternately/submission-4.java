class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a=0,b=0;
        int w1=word1.length();
        int w2=word2.length();
        StringBuilder sb= new StringBuilder();
        while(a<w1 && b<w2){
            sb.append(word1.charAt(a++));
            sb.append(word2.charAt(b++));
        }
        if(a<w1){
            sb.append(word1.substring(a,w1));
        }
        else if(b<w2){
            sb.append(word2.substring(b,w2));
        }

        return sb.toString();
    }
}