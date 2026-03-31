class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max=0;
        set= Arrays.stream(nums).boxed().collect(Collectors.toSet());
        for(int i=0;i<nums.length;i++){
          if(!set.contains(nums[i]-1)){
            int current = nums[i];
            int count=1;

            while(set.contains(current+1)){
                current++;
                count++;
            }

            max= Math.max(max,count);
          }
        }
        return max;
    }
}
