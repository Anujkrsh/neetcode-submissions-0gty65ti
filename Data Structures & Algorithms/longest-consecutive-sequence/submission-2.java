class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int max=0;
        for(Integer i: set){
            if(!set.contains(i-1)){
                int current =i;
                int count=0;

                while(set.contains(current)){
                    current++;
                    count++;
                }
                max= Math.max(count,max);
            }
        }
        return max;
    }
}
