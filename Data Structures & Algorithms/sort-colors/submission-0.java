class Solution {
    public void sortColors(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
        int index=0;
       for(int a : nums){
        map.put(a,map.getOrDefault(a,0)+1);
       } 
       for(int i=0;i<3;i++){
       int count = map.getOrDefault(i,0);
       for(int j=0;j<count;j++){
        nums[index++]=i;
       }
       }
        
    }
}