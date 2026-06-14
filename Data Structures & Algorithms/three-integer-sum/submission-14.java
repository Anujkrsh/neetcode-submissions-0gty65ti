class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> last = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if(i>0 && nums[i]== nums[i-1]) continue;
            int st = i + 1;
            int lt = nums.length - 1;
            while (st < lt) {
                List<Integer> inter = new ArrayList<>();
                int num = nums[i] + nums[st] + nums[lt];
                if (num == 0) {
                    int inti=nums[st];
                    int lasts=nums[lt];
                    inter.add(nums[i]);
                    inter.add(nums[st++]);
                    inter.add(nums[lt--]);
                    last.add(inter);
                    
                while(st <= lt && nums[lt]==lasts) lt--;
                while(st <= lt && nums[st]==inti) st++;
                }
                else if (num > 0) {
                    lt--;
                }else if(num<0) {
                   st++;
                }

                
            }
        }

        return last;
    }
}
