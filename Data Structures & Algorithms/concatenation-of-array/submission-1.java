class Solution {
    public int[] getConcatenation(int[] nums) {
        int len =nums.length;
        int[] numsT = new int[2*len];
        for(int i=0; i<numsT.length; i++){
            if(i>=len){
                numsT[i]=nums[i-len];
                continue;
            }
             numsT[i]=nums[i];
        }
        return numsT;
    }
}