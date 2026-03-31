class Solution {
    public int removeElement(int[] nums, int val) {
      List<Integer> updated= new ArrayList<>();
      for(int n: nums){
        if(n!=val){
            updated.add(n);
        }
      }
      for(int i=0;i<updated.size();i++){
        nums[i]=updated.get(i);
      }

      return updated.size();
   
    }
}