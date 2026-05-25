class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        Set<Integer> set = new HashSet<>();

        for(int n: nums){
            set.add(n);
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            int cons=1;
    
            if(!set.contains(nums[i]-1)){
                int current = nums[i];
                while(set.contains(current+1)){
                    cons++;
                    current++;
                }
            }
            max=Math.max(cons,max);
        }
        return max;
    }
}
