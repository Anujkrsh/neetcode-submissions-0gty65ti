class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> fin = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            
            while(j<k){
                List<Integer> list= new ArrayList<>();
                int sum= nums[j]+nums[i]+nums[k];
                if(sum==0){
                    list.add(nums[j++]);
                    list.add(nums[i]);
                    list.add(nums[k--]);
                    fin.add(list);
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }

                else if(sum>0) k--;
                else j++;
            }
        }
        return fin;
    }
}
