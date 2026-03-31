class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] numstwo= new int[nums.length*2];
        int times=1;
        for(int i=0;i<numstwo.length;i++){
            if(i>nums.length-1){
                numstwo[i]=nums[i-nums.length];
                continue;
            }
            numstwo[i]=nums[i];

        }
        return numstwo;
    }
}