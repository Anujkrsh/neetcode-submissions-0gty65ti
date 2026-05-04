class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set= new HashSet<>();

        for(int n: nums){
            if(set.add(n)){
                continue;
            }
            return true;
        }
        return false;
    }
}