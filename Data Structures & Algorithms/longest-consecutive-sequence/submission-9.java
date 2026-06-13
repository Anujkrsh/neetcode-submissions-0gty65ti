class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> set = new HashSet<Integer>();
        int max=0;

        for(int i: nums){
            set.add(i);
        }

        for(int i: set){
            int count=1;
            if(!set.contains(i-1)){
                int val=i;
                while(set.contains(val+1)){
                    count++;
                    val++;
                }
            }
            max=Math.max(count,max);
        }
        return max;
    }
}
