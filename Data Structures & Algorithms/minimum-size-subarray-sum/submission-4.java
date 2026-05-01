class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, min = Integer.MAX_VALUE;

        for (int rt = 0; rt < nums.length; rt++) {
            sum += nums[rt];
            while (sum >= target) {
                min = Math.min(min, rt - left + 1);
                sum-=nums[left++];
            }
        }
        return min == Integer.MAX_VALUE ? 0:min;
    }
}