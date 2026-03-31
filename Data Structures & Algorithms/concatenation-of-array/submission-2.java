class Solution {
    public int[] getConcatenation(int[] nums) {
        int len =nums.length;
        int[] numsT = new int[2*len];
        for(int i=0; i<numsT.length; i++){
            numsT[i] = nums[i % len];
        }
        return numsT;
    }
}