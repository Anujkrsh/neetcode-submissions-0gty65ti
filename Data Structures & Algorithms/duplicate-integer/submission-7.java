class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(Integer n: nums){
            if(!set.add(n)){
                return true;
            }
        }   

        return false;
    }
}