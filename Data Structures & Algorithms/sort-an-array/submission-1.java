class Solution {
    public int[] sortArray(int[] nums) {
        int n= nums.length;
        
        for(int i=n/2-1;i>=0;i--){
            heapify(nums,n,i);
        }
        
        for(int j=n-1;j>=0;j--){
            swap(nums,j,0);
            heapify(nums,j,0);
        }
        
        return nums;
    }

    public void heapify(int[] nums,int size, int i){
        int max=i;
        int left = 2*i+ 1 ;
        int right= 2*i+ 2;

        if(left<size && nums[left]>nums[max]){
            max=left;
        }

        if(right<size && nums[right]> nums[max]){
            max=right;
        }

        if(max!=i){
            swap(nums,max,i);
            heapify(nums,size,max);
        }

    }

    public void swap(int[] nums, int a , int b){
            int temp= nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
    }
}