class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> fin = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int k=j+1;

                int l= nums.length-1;
                while(k<l){
                    List<Integer> list= new ArrayList<>();
                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        fin.add(list);

                        while(k<l && nums[k]== nums[k+1])k++;
                        while(k<l && nums[l]== nums[l-1])l--;
                        k++;
                        l--;
                    
                    }else if (sum<target){
                        k++;
                    }else{
                        l--;
                    }
                }

            }
        }
        return fin;
    }
}