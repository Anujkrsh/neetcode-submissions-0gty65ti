class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;

        swap(nums,0,nums.length-1);
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);
    }

    public void swap(int[] nums, int k,int f){
        while(k<f){
            int temp= nums[k];
            nums[k++]=nums[f];
            nums[f--]=temp;
        }
    }
}