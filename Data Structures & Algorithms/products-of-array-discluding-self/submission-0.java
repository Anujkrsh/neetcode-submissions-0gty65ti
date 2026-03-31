class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
        int[] prenum= new int[n];
        int[] suffnum= new int[n];

        prenum[0]= 1;
        for(int i=1;i<n;i++){ 
            prenum[i]=prenum[i-1]*nums[i-1];
        }

        suffnum[n-1]=1;
        for(int j=n-2;j>=0;j--){ 
            suffnum[j]=nums[j+1]*suffnum[j+1];
        }

        for(int k=0;k<n;k++){
            nums[k]=prenum[k]*suffnum[k];
        }
        return nums;
    }
}  
