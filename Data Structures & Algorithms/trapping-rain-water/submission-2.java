class Solution {
    public int trap(int[] nums) {
        int i=0;
        int j = nums.length-1;
        int water=0;
        int lm=nums[i];
        int rm=nums[j];

        while(i<j){
            lm= Math.max(nums[i],lm);
            rm=Math.max(nums[j],rm);
            if(lm<rm){
                water=water+(lm-nums[i++]);
            }
            else{
                water= water+(rm-nums[j--]);
            }
            }
        return water;
    }
}
