class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0) return 0;
        int len=1;
        int temp=1;
        for(int i=0;i<nums.length;i++){
            if( (i>0) && nums[i]==nums[i-1]) continue;
            if((i>0) && (nums[i]==nums[i-1]+1)){
                temp++;
                len= Math.max(temp,len); 
            }else{
                temp=1;
            }
        }
        return len;
    }
}
