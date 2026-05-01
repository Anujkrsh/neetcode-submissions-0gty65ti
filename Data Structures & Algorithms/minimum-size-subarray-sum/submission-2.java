class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int currentSum=0;
        int left=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            while(currentSum>=target){
                min=Math.min(min,i-left+1);
                currentSum-=nums[left++];
            }    
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}