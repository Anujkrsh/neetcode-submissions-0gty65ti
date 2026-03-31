class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0;
        int len=s1.length();

        for(int i=len-1;i<s2.length();i++){
            char[] sub1= s2.substring(left,i+1).toCharArray();
            char[] sub2=s1.toCharArray();
            Arrays.sort(sub1);
            Arrays.sort(sub2);
            if(Arrays.equals(sub1, sub2)){
                return true;
            }
            left++;
        }
        return false;
    }
}
