class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> haveIt = new HashSet<>();

        for(int num: nums ){
            if(!haveIt.add(num)){
                return true;
            }
        }
        return false;
    }
}